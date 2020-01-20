package com.example.demoinfluxdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoinfluxdb.dao.CpuDao;
import com.example.demoinfluxdb.vo.CpuVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CpuService {

	private final CpuDao cpuDao;
	
	public List<CpuVO> selectList(){
		return cpuDao.selectList();
	}
	
}
