package com.myblog.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {
	Logger logger=LogManager.getLogger(BaseController.class);
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String navigateHome(){
		logger.info("In Base Controller");
		return "index";
	}
}
