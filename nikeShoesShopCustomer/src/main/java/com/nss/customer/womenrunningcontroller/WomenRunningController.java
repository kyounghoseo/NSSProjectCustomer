package com.nss.customer.womenrunningcontroller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.womenrunningservice.WomenRunningService;
import com.nss.customer.womenrunningvo.WomenRunningVO;

@Service
@RequestMapping(value="/product/women")
public class WomenRunningController {
	Logger logger = Logger.getLogger(WomenRunningController.class);
	
	@Autowired 
	private WomenRunningService womenrunningService;
	
	//여성 런닝화 리스트
	
	@RequestMapping(value="/wmrunningList", method = RequestMethod.GET)
	public String wmrunningList(@ModelAttribute WomenRunningVO wrvo, Model model){
		logger.info("여성 런닝화 호출 성공");
		List<WomenRunningVO> wmrunningList = womenrunningService.wmrunningList(wrvo);
		model.addAttribute("wmrunningList",wmrunningList);
		logger.info(wmrunningList);
		
		return "/customer/product/women/wmrunningList";
	}

}
