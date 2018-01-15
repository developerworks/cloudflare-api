package com.vieztech.cloudflare.constants;

public enum CloudflareRecordType {

	// @formatter:off
	A("A"),
	AAAA("AAAA"),
	CNAME("CNAME"),
	MX("MX"),
	TXT("TXT"),
	NS("NS"),
	SRV("SRV"),
	SPF("SPF"),
	LOC("LOC");
	// @formatter:on

	public final String type;

	private CloudflareRecordType(String type) {
		this.type = type;
	}
}
