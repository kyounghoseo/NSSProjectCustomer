package com.nss.customer.menallcontroller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.menallservice.MenAllService;
import com.nss.customer.menallvo.MenAllVO;

@Controller
@RequestMapping(value="/product/men")
public class MenAllController {
	Logger logger = Logger.getLogger(MenAllController.class);
	
	@Autowired
	private MenAllService menallService;
	
	
	//남성 전체상품 리스트
	@RequestMapping(value="/allList", method = RequestMethod.GET)
	public String allList(@ModelAttribute MenAllVO mavo, Model model){
		logger.info("남성 전체 상품 리스트 호출 성공");
		List<MenAllVO> allList = menallService.allList(mavo);
		model.addAttribute("allList",allList);
		logger.info(allList);
		
		return "product/men/allList";
	}

}
