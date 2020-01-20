package com.example.demoinfluxdb;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoinfluxdb.service.CpuService;
import com.example.demoinfluxdb.vo.CpuVO;

import lombok.RequiredArgsConstructor;


@RequestMapping("/cpus")
@RestController
@RequiredArgsConstructor
public class CpuController {
	
	private final CpuService cpuService;
	
	@GetMapping
	public @ResponseBody List<CpuVO> selectList(){
		return cpuService.selectList();
	}
}
