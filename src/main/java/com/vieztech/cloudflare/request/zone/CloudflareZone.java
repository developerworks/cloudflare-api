package com.vieztech.cloudflare.request.zone;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import net.sf.json.JSONObject;

public class CloudflareZone {
	private String id;
	private String name;
	private String status;
	private boolean paused;
	private String type;
	@JsonProperty("development_mode")
	private int developmentMode;
	@JsonProperty("name_servers")
	private List<String> nameServers;
	@JsonProperty("original_name_servers")
	private List<String> originalNameServers;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDevelopmentMode() {
		return developmentMode;
	}

	public void setDevelopmentMode(int developmentMode) {
		this.developmentMode = developmentMode;
	}

	public List<String> getNameServers() {
		return nameServers;
	}

	public void setNameServers(List<String> nameServers) {
		this.nameServers = nameServers;
	}

	public List<String> getOriginalNameServers() {
		return originalNameServers;
	}

	public void setOriginalNameServers(List<String> originalNameServers) {
		this.originalNameServers = originalNameServers;
	}

	public static CloudflareZone parse(JSONObject object) {
		CloudflareZone cloudflareZone = new CloudflareZone();
		cloudflareZone.id = object.getString("id");
		cloudflareZone.name = object.getString("name");
		cloudflareZone.status = object.getString("status");
		cloudflareZone.paused = object.getBoolean("paused");
		cloudflareZone.type = object.getString("type");
		cloudflareZone.developmentMode = object.getInt("development_mode");
		cloudflareZone.nameServers = object.getJSONArray("name_servers");
		cloudflareZone.originalNameServers = object.getJSONArray("original_name_servers");
		return cloudflareZone;
	}

}
