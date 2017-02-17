package com.test.beans;

import com.google.gson.annotations.SerializedName;

public class StationInformationMetadata {
	
	@SerializedName("last_updated")
	private int lastUpdated;
	
	private int ttl;
	
	private DataStationInfo data;

	public int getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(int lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}

	public DataStationInfo getData() {
		return data;
	}

	public void setData(DataStationInfo data) {
		this.data = data;
	}

}
