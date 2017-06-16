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
@RequestMapping(value="/men")
public class MenRunningController {
	Logger logger = Logger.getLogger(MenRunningController.class);
	
	@Autowired
	private MenRunningService runningService;
	
	//남성 런닝화 리스트
	@RequestMapping(value="runningList", method = RequestMethod.GET)
	public String runningList(@ModelAttribute MenRunningVO mrvo, Model model){
		logger.info("남성 런닝화 리스트 호출 성공");
		
		//정렬 설정
		if(mrvo.getHeighPrice()==null)mrvo.setHeighPrice("productPrice");
		if(mrvo.getRowPrice()==null)mrvo.setRowPrice("rowPrice");
		
		logger.info("비싼가격순 성공 =" + mrvo.getHeighPrice());
		logger.info("낮은가격순 성공="+mrvo.getRowPrice());
		
		List<MenRunningVO> runningList = runningService.runningList(mrvo);
		model.addAttribute("runningList",runningList);
		model.addAttribute("data",mrvo);
		logger.info(runningList);
		
		return "men/runningList";
	}
	
	
	

}
