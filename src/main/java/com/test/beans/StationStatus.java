package com.test.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "station_status")
public class StationStatus {
	
	@Id
	private int id;
	
	@SerializedName("station_id")
	@Column(name = "station_id")
	private int stationId;
	
	@SerializedName("num_bikes_available")
	@Column(name = "bikes_available")
	private int bikesAvailable;
	
	@SerializedName("num_bikes_disabled")
	@Column(name = "bikes_disabled")
	private int bikesDisabled;
	
	@SerializedName("num_docks_available")
	@Column(name = "docks_available")
	private int docksAvailable;
	
	@SerializedName("num_docks_disabled")
	@Column(name = "docks_disabled")
	private int docksDisabled;
	
	@SerializedName("is_installed")
	@Column(name = "is_installed")
	private int isInstalled;
	
	@SerializedName("is_renting")
	@Column(name = "is_renting")
	private int isRenting;
	
	@SerializedName("is_returning")
	@Column(name = "is_returning")
	private int isReturning;
	
	@SerializedName("last_reported")
	@Column(name = "last_reported")
	private int lastReported;
	
	@SerializedName("last_updated")
	@Column(name = "last_updated")
	private int lastUpdated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public int getBikesAvailable() {
		return bikesAvailable;
	}

	public void setBikesAvailable(int bikesAvailable) {
		this.bikesAvailable = bikesAvailable;
	}

	public int getBikesDisabled() {
		return bikesDisabled;
	}

	public void setBikesDisabled(int bikesDisabled) {
		this.bikesDisabled = bikesDisabled;
	}

	public int getDocksAvailable() {
		return docksAvailable;
	}

	public void setDocksAvailable(int docksAvailable) {
		this.docksAvailable = docksAvailable;
	}

	public int getDocksDisabled() {
		return docksDisabled;
	}

	public void setDocksDisabled(int docksDisabled) {
		this.docksDisabled = docksDisabled;
	}

	public int getIsInstalled() {
		return isInstalled;
	}

	public void setIsInstalled(int isInstalled) {
		this.isInstalled = isInstalled;
	}

	public int getIsRenting() {
		return isRenting;
	}

	public void setIsRenting(int isRenting) {
		this.isRenting = isRenting;
	}

	public int getIsReturning() {
		return isReturning;
	}

	public void setIsReturning(int isReturning) {
		this.isReturning = isReturning;
	}

	public int getLastReported() {
		return lastReported;
	}

	public void setLastReported(int lastReported) {
		this.lastReported = lastReported;
	}

	public int getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(int lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
}
