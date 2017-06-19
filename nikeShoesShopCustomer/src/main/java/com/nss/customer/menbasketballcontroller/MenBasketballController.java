package com.nss.customer.menbasketballcontroller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.menbasketballservice.MenBasketballService;
import com.nss.customer.menbasketballvo.MenBasketballVO;


@Controller
@RequestMapping(value="/product/men")
public class MenBasketballController {
	Logger logger = Logger.getLogger(MenBasketballController.class);
	
	@Autowired
	private MenBasketballService menbasketballService;
	
	@RequestMapping(value="/basketballList", method = RequestMethod.GET)
	public String basketballList(@ModelAttribute MenBasketballVO mbvo, Model model){
		logger.info("남성 농구화 리스트 호출 성공");
		List<MenBasketballVO> basketballList = menbasketballService.basketballList(mbvo);
		model.addAttribute("basketballList",basketballList);
		logger.info(basketballList);
		
		return "/customer/product/men/basketballList";
	}

}
