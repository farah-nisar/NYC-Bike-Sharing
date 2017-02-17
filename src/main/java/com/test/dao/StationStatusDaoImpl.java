package com.test.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.test.beans.StationStatus;

@Repository("stationStatusDao")
@Transactional
public class StationStatusDaoImpl extends AbstractDao<Integer, StationStatus> implements StationStatusDao {

	@Override
	public void saveStationStatus(StationStatus stationStatus) {
		persist(stationStatus);
	}

}
