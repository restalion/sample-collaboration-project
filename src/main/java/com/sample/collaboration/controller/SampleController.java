package com.sample.collaboration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.collaboration.dto.SampleDto;
import com.sample.collaboration.service.SampleService;

@RestController
public class SampleController {

	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/findAll")
	public List<SampleDto> findAll() {
		return sampleService.findAll();
	}
}
