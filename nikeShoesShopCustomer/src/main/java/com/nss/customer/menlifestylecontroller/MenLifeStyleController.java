package com.nss.customer.menlifestylecontroller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.menlifestyleservice.MenLifeStyleService;
import com.nss.customer.menlifestylevo.MenLifeStyleVO;

@Controller
@RequestMapping(value="product/men")
public class MenLifeStyleController {
	Logger logger = Logger.getLogger(MenLifeStyleController.class);
	
	@Autowired
	private MenLifeStyleService lifestyleService;
	
	//남성 라이프 스타일 리스트
	@RequestMapping(value="lifestyleList", method = RequestMethod.GET)
	public String lifestyleList(@ModelAttribute MenLifeStyleVO mlsvo,Model model){
		logger.info("남성 라이프 스타일 리스트 호출 성공");
		
		List<MenLifeStyleVO> lifestyleList = lifestyleService.lifestyleList(mlsvo);
		model.addAttribute("lifestyleList",lifestyleList);
		logger.info(lifestyleList);
		
		return "product/men/lifestyleList";
	}
	

}
