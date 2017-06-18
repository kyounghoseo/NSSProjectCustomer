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
@RequestMapping(value="product/men/")
public class MenAllController {
	Logger logger = Logger.getLogger(MenAllController.class);
	
	@Autowired
	private MenAllService allService;
	
	//남성 전체 리스트
	@RequestMapping(value="allList", method = RequestMethod.GET)
	public String allList(@ModelAttribute MenAllVO mavo, Model model){
		logger.info("농구화 호출 성공");
		
		List<MenAllVO> allList = allService.allList(mavo);
		model.addAttribute("allList", allList);
		logger.info(allList);
		return "product/men/allList";
	}
	
	//상세페이지 보기
	@RequestMapping(value="allDetail", method=RequestMethod.GET)
	public String allDetail(@ModelAttribute MenAllVO mavo, Model model){
		logger.info("남자 전체페이지 상세보기 호출 성공");
		logger.info(mavo.getProductNo()+"번 상품의 상세페이지");
		
		MenAllVO detail = new MenAllVO();
		detail = allService.allDetail(mavo);
		
		if(detail != null && (!detail.equals(""))){
			detail.setProductName(detail.getProductName().toString().replaceAll("\n", "<br>"));
		}
		model.addAttribute("detail",detail);
		
		return "product/men/allDetail";
		
	}

}
