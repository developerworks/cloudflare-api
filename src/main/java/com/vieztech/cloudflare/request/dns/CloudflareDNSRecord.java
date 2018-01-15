package com.vieztech.cloudflare.request.dns;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vieztech.cloudflare.constants.CloudflareRecordType;

import net.sf.json.JSONObject;

public class CloudflareDNSRecord {
	private String id;
	private CloudflareRecordType type;
	private String name;
	private String content;
	private boolean proxiable;
	private boolean proxied;
	private int ttl;
	private boolean locked;
	@JsonProperty("zone_id")
	private String zoneId;
	@JsonProperty("zone_name")
	private String zoneName;

	public String getId() {
		return id;
	}

	public CloudflareRecordType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public boolean isProxiable() {
		return proxiable;
	}

	public boolean isProxied() {
		return proxied;
	}

	public int getTtl() {
		return ttl;
	}

	public boolean isLocked() {
		return locked;
	}

	public String getZoneId() {
		return zoneId;
	}

	public String getZoneName() {
		return zoneName;
	}

	public static CloudflareDNSRecord parse(JSONObject object) {
		CloudflareDNSRecord record = new CloudflareDNSRecord();
		record.id = object.getString("id");
		record.type = CloudflareRecordType.valueOf(object.getString("type"));
		record.name = object.getString("name");
		record.content = object.getString("content");
		record.proxiable = object.getBoolean("proxiable");
		record.proxied = object.getBoolean("proxied");
		record.ttl = object.getInt("ttl");
		record.locked = object.getBoolean("locked");
		record.zoneId = object.getString("zone_id");
		record.zoneName = object.getString("zone_name");
		return record;
	}

}
