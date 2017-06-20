package com.nss.customer.productdetailcontroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.productdetailvo.ProductDetailVO;

@Controller
@RequestMapping(value="/product")
public class ProductDetailController {
	Logger logger = Logger.getLogger(ProductDetailController.class);
	
	@Autowired
	private ProductDetailService productdetailService;
	
	@RequestMapping(value="/productDetail", method=RequestMethod.GET)
	public String productDetail(@ModelAttribute ProductDetailVO pdvo, Model model){
		logger.info("상품 상세페이지 호출 성공");
		logger.info("productNo=" + pdvo.getProductNo());
		
		ProductDetailVO detail = new ProductDetailVO();
		detail = productdetailService.productDetail(pdvo);
		
		
	}

}
