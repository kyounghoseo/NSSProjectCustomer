package com.nss.customer.womenlifestylecontroller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.womenlifestyleservice.WomenLifeStyleService;
import com.nss.customer.womenlifestylevo.WomenLifeStyleVO;

@Controller
@RequestMapping(value="/product/women")
public class WomenLifeStyleController {
	Logger logger = Logger.getLogger(WomenLifeStyleController.class);
	
	@Autowired
	private WomenLifeStyleService womenlifestyleService;
	
	@RequestMapping(value="/wmlifestyleList", method = RequestMethod.GET)
	public String wmlifestyleList(@ModelAttribute WomenLifeStyleVO wlsvo, Model model){
		logger.info("여성 라이프 스타일 리스트 호출 성공");
		
		List<WomenLifeStyleVO> wmlifestyleList = womenlifestyleService.wmlifestyleList(wlsvo);
		model.addAttribute("wmlifestyleList",wmlifestyleList);
		logger.info(wmlifestyleList);
		
		return "/customer/product/women/wmlifestyleList";
		

		
	}

}
