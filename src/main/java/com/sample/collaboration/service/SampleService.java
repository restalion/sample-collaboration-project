package com.sample.collaboration.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.collaboration.dto.SampleDto;
import com.sample.collaboration.entity.SampleEntity;
import com.sample.collaboration.repository.SampleRepository;

@Service
public class SampleService {
	
	@Autowired
	SampleRepository repository;
	
	public List<SampleDto> findAll() {
		List<SampleDto> dtoList = new ArrayList<>();
		List<SampleEntity> entityList = repository.findAll();
		
		entityList.forEach(e -> dtoList.add(SampleDto.builder().id(e.getId()).name(e.getName()).build()));
		
		return dtoList;
	}
	
}
