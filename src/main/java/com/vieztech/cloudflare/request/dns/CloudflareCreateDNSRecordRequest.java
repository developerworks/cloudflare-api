package com.vieztech.cloudflare.request.dns;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.constants.CloudflareRecordType;
import com.vieztech.cloudflare.request.CloudflarePostRequest;

public class CloudflareCreateDNSRecordRequest extends CloudflarePostRequest {
	public CloudflareCreateDNSRecordRequest(CloudflareAccess api, String zoneId, CloudflareRecordType type, String name,
			String content) {
		super(api, String.format("/zones/%s/dns_records", zoneId));
		add("type", type.type);
		add("name", name);
		add("content", content);
		add("ttl", 1);
		add("proxied", true);
	}
}
