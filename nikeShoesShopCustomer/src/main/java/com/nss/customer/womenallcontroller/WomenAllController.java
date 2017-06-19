package com.nss.customer.womenallcontroller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.womenallservice.WomenAllService;
import com.nss.customer.womenallvo.WomenAllVO;

@Controller
@RequestMapping(value="/product/women")
public class WomenAllController {
	Logger logger = Logger.getLogger(WomenAllController.class);
	
	@Autowired
	private WomenAllService womenallService;
	
	@RequestMapping(value="/wmallList", method = RequestMethod.GET)
	public String wmallAllist(@ModelAttribute WomenAllVO wavo, Model model){
		logger.info("여성 전체상품 리스트 호출 성공");
		
		List<WomenAllVO> wmallList = womenallService.wmallList(wavo);
		model.addAttribute("wmallList",wmallList);
		logger.info(wmallList);
		return "/customer/product/women/wmallList";
		
	}
	

}
