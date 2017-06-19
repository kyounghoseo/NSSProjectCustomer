package com.nss.customer.womenrunningcontroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.womenrunningvo.WomenRunningVO;

@Service
@RequestMapping(value="/product/women")
public class WomenRunningController {
	Logger logger = Logger.getLogger(WomenRunningController.class);
	
	@Autowired 
	private WomenRunningService womenrunningService;
	
	//여성 런닝화 리스트
	
	@RequestMapping(value="/womenrunningList", method = RequestMethod.GET)
	public String womenrunningList(@ModelAttribute WomenRunningVO wrvo, Model model){
		logger.info("여성 런닝화 호출 성공");
		
	}

}
