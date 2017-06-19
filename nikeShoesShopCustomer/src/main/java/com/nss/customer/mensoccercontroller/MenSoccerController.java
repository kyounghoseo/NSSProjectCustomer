package com.nss.customer.mensoccercontroller;

import java.awt.MenuContainer;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.mensoccerservice.MenSoccerService;
import com.nss.customer.mensoccervo.MenSoccerVO;

@Controller
@RequestMapping(value="/product/men")
public class MenSoccerController {
	Logger logger = Logger.getLogger(MenuContainer.class);
	
	@Autowired
	private MenSoccerService mensoccerService;
	
	//남성 축구화 리스트
	@RequestMapping(value="/soccerList", method =RequestMethod.GET)
	public String soccerList(@ModelAttribute MenSoccerVO msvo, Model model){
		logger.info("남성 축구화 리스트 호출 성공");
		
		List<MenSoccerVO> soccerList = mensoccerService.soccerList(msvo);
		model.addAttribute("soccerList",soccerList);
		logger.info(soccerList);
		
		return "product/men/soccerList";
	}
	

}
