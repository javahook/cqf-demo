package com.cqf.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author qifu.chen
 * @version 1.0.0
 * @date May 15, 2017 10:53:38 AM
 */
@Controller
@SpringBootApplication
public class Application {
    
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
