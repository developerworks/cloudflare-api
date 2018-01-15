package com.vieztech.cloudflare.request.dns;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

public class CloudflareGetDNSRecordRequest extends CloudflareGetRequest {
	public CloudflareGetDNSRecordRequest(CloudflareAccess api, String zoneId, String recId) {
		super(api, String.format("/zones/%s/dns_records/%s", zoneId, recId));
	}
}
