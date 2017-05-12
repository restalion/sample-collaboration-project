package com.sample.collaboration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.collaboration.entity.SampleEntity;

public interface SampleRepository extends JpaRepository<SampleEntity, Long> {
	
}
