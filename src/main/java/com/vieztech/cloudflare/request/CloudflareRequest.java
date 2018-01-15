package com.vieztech.cloudflare.request;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vieztech.cloudflare.CloudflareApi;
import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.results.CloudflareError;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public abstract class CloudflareRequest implements Closeable {
  protected String         requestUrl;
  private CloudflareAccess api;
  private Logger           logger = LogManager.getLogger(CloudflareApi.class);

  public CloudflareRequest(CloudflareAccess api, String restUrl) {
    this.api = api;
    this.requestUrl = String.format("%s%s", CloudflareAccess.CF_API_LINK, restUrl);
  }

  public CloudflareRequest(CloudflareAccess api) {
    this(api, "");
  }

  public Object executeBasic() throws CloudflareError {
    try {
      HttpUriRequest request = getRequest();
      request.setHeader(new BasicHeader("X-AUTH-Email", api.getEmail()));
      request.setHeader(new BasicHeader("X-AUTH-Key", api.getToken()));
      request.setHeader(new BasicHeader("Content-Type", "application/json"));
      HttpResponse response = api.getClient().execute(request);
      BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

      StringBuilder sbResult = new StringBuilder();
      String line = null;
      while ((line = rd.readLine()) != null) {
        sbResult.append(line);
      }

      JSONObject jsonResult = (JSONObject) JSONSerializer.toJSON(sbResult.toString());

      if (!jsonResult.containsKey("result")) {
        throw new CloudflareError("no_result", "No result received", "Result=null");
      }

      if (jsonResult.getBoolean("success")) {
        if (jsonResult.containsKey("result")) {
          return jsonResult.get("result");
        } else {
          return jsonResult;
        }

      }
    } catch (IOException e) {
      logger.error("Unknown error in processing request [%s]", e);
    }
    return null;
  }

  protected abstract void add(String key, Object value);

  protected abstract HttpUriRequest getRequest() throws UnsupportedEncodingException;

  public void close() throws IOException {
    api = null;
  }
}
