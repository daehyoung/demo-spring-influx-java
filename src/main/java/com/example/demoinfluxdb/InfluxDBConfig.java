package com.example.demoinfluxdb;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.impl.InfluxDBResultMapper; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfluxDBConfig {

	@Value("${app.influxdb.url}")
	String url;
	
	@Value("${app.influxdb.user}")
	String user;
	
	@Value("${app.influxdb.password}")
	String password;
	
	@Bean
	public InfluxDB getInfluxDB() {
		InfluxDB influxDB = InfluxDBFactory.connect(url,user, password);
		return influxDB;
	}
	
	@Bean
	public InfluxDBResultMapper getInfluxDBResultMapper() {
		return new InfluxDBResultMapper(); // thread-safe - can be reused
	}
	
}
