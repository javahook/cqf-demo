package com.cqf.chapter3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author qifu.chen
 * @version 1.0.0
 * @date May 16, 2017 4:49:56 PM
 */
@Service
public class CqfService {
	
	@Autowired
	RestTemplate restTemplate;

	public String addService() {
		return restTemplate.getForEntity("http://CQF-SERVICE/add?a=10&b=20", String.class).getBody();
	}

}
