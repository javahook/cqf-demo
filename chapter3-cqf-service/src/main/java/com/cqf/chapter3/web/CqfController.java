package com.cqf.chapter3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cqf.chapter3.service.CqfService;

/**
 * 
 * @author qifu.chen
 * @version 1.0.0
 * @date May 16, 2017 4:52:44 PM
 */
@RestController
public class CqfController {

	@Autowired
	private CqfService cqfService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return cqfService.addService();
    }

}
