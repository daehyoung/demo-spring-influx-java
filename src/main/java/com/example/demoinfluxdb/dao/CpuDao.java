package com.example.demoinfluxdb.dao;

import java.util.List;

import org.influxdb.InfluxDB;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;
import org.influxdb.impl.InfluxDBResultMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demoinfluxdb.vo.CpuVO;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CpuDao {

	final private InfluxDB influxDB;
	
	final private  InfluxDBResultMapper resultMapper;
	
	@Value("${app.influxdb.db}")
	String dbName;

	public List<CpuVO> selectList(){ 
		QueryResult queryResult = influxDB.query(new Query("SELECT * FROM cpu", dbName)); 
		return resultMapper.toPOJO(queryResult, CpuVO.class);
	}
	
	
}
