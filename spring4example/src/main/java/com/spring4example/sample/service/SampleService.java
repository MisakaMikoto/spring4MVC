package com.spring4example.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring4example.sample.mapper.SampleMapper;

@Service
@Transactional
public class SampleService {
	@Autowired
	SampleMapper sampleMapper;

	public List list(String name) {
		return new ArrayList();
	}
}
