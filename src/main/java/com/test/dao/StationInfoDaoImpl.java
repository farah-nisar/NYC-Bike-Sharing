package com.test.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.test.beans.StationInfo;

@Repository("stationDao")
@Transactional
public class StationInfoDaoImpl extends AbstractDao<Integer, StationInfo> implements StationInfoDao {

	@Override
	public void saveStationInfo(StationInfo station) {
		persist(station);
	}

	
}
