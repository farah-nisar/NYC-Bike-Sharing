package com.test.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.test.beans.StationInfo;
import com.test.beans.StationInformationMetadata;
import com.test.beans.StationStatus;
import com.test.beans.StationStatusMetadata;
import com.test.dao.StationInfoDao;
import com.test.dao.StationStatusDao;

@Controller
@RequestMapping(value = "/livestream")
public class LiveStreamController {
	
	private Gson gson = new Gson();
	
	@Autowired
	StationInfoDao stationInfoDao;
	
	@Autowired
	StationStatusDao stationStatusDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<HttpStatus> getLiveData() {
		
	//	crawlStationLiveStreamAndSaveToDB();
		
		crawlStationStatusLiveStreamAndSaveToDB();
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	private void crawlStationLiveStreamAndSaveToDB() {
		String jsonStationInfo = getDataFromUrl("https://gbfs.citibikenyc.com/gbfs/en/station_information.json");
		StationInformationMetadata stationInformation = gson.fromJson(jsonStationInfo, StationInformationMetadata.class);
		
		// Save Station info data to DB
		for (StationInfo stationInfo : stationInformation.getData().getStations()) {
			stationInfoDao.saveStationInfo(stationInfo);
		}
	}
	
	private void crawlStationStatusLiveStreamAndSaveToDB() {
		String jsonStationInfo = getDataFromUrl("https://gbfs.citibikenyc.com/gbfs/en/station_status.json");
		
		StationStatusMetadata stationStatusMeta = gson.fromJson(jsonStationInfo, StationStatusMetadata.class);
		
		// Save Station data to DB
		for (StationStatus stationStatus : stationStatusMeta.getData().getStations()) {
			stationStatus.setLastUpdated(stationStatusMeta.getLastUpdated());
			stationStatusDao.saveStationStatus(stationStatus);
		}
	}
	
	private String getDataFromUrl(String url) {
		String jsonData = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			while (null != (jsonData = br.readLine())) {
				return jsonData;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return "";
	}
}

