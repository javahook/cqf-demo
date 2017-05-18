package com.cqf.chapter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author qifu.chen
 * @version 1.0.0
 * @date May 16, 2017 3:11:16 PM
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		//new SpringApplicationBuilder(Application.class).web(true).run(args);

	}

}
