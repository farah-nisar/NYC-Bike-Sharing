package com.test.beans;

import com.google.gson.annotations.SerializedName;

public class StationStatusMetadata {
	
	@SerializedName("last_updated")
	private int lastUpdated;
	
	private int ttl;
	
	private DataStationStatus data;

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

	public DataStationStatus getData() {
		return data;
	}

	public void setData(DataStationStatus data) {
		this.data = data;
	}

}
