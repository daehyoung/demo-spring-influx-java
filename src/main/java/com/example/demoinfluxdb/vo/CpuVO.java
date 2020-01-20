package com.example.demoinfluxdb.vo;

import java.time.Instant;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;

import lombok.Data;

@Data
@Measurement(name = "cpu")
public class CpuVO {
    //@TimeColumn
    @Column(name = "time")
    private Instant time;
    @Column(name = "host", tag = true)
    private String hostname;
    @Column(name = "region", tag = true)
    private String region;
    @Column(name = "idle")
    private Double idle;
    @Column(name = "happydevop")
    private Boolean happydevop;
    @Column(name = "uptimesecs")
    private Long uptimeSecs;
    // getters (and setters if you need)
}