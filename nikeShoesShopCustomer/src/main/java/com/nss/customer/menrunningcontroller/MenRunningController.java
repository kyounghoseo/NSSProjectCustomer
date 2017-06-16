package com.nss.customer.menrunningcontroller;

import java.util.List;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.menrunningservice.MenRunningService;
import com.nss.customer.menrunningvo.MenRunningVO;

@Controller
@RequestMapping(value="/product/men")
public class MenRunningController {
	Logger logger = Logger.getLogger(MenRunningController.class);
	
	@Autowired
	private MenRunningService runningService;
	
	//남성 런닝화 리스트
	@RequestMapping(value="runningList", method = RequestMethod.GET)
	public String runningList(@ModelAttribute MenRunningVO mrvo, Model model){
		logger.info("남성 런닝화 리스트 호출 성공");
		
		//정렬 설정
		if(mrvo.getPriceSort()==null)mrvo.setPriceSort("productPrice");
		if(mrvo.getOrder_sc()==null)mrvo.setOrder_sc("DESC");
		
		logger.info("priceSort =" + mrvo.getPriceSort());
		logger.info("order_sc="+mrvo.getOrder_sc());
		
		List<MenRunningVO> runningList = runningService.runningList(mrvo);
		model.addAttribute("runningList",runningList);
		model.addAttribute("data",mrvo);
		logger.info(runningList);
		
		return "product/men/runningList";
	}
	
	
	

}
