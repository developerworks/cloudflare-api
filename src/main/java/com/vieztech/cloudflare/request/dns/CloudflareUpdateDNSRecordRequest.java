package com.vieztech.cloudflare.request.dns;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.constants.CloudflareRecordType;
import com.vieztech.cloudflare.request.CloudflarePutRequest;

public class CloudflareUpdateDNSRecordRequest extends CloudflarePutRequest {
	public CloudflareUpdateDNSRecordRequest(CloudflareAccess api, String zoneId, String recId,
			CloudflareRecordType type, String name, String content) {
		super(api, String.format("/zones/%s/dns_records/%s", zoneId, recId));
		add("type", type.type);
		add("name", name);
		add("content", content);
		add("ttl", 1);
		add("proxied", true);
	}
}
