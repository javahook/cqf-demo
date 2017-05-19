package com.cqf.chapter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author qifu.chen
 * @version 1.0.0
 * @date May 16, 2017 3:11:16 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonApplication {

	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	public static void main(String[] args) {

		SpringApplication.run(RibbonApplication.class, args);

	}

}
