package com.nss.customer.customercontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nss.customer.customerservice.CustomerService;
import com.nss.customer.customervo.CustomerVO;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value="/updateForm") //수정폼으로 들어가기 위한 것
	public String Update(HttpSession hsession){
		/*System.out.println("아무말대잔치");*/
		return "customer/updateForm";
	}
	
	@RequestMapping(value="/customerUpdate", method=RequestMethod.POST)//내용수정
	public String customerupdate(@ModelAttribute CustomerVO cvo, HttpSession hsession){
		customerService.customerUpdate(cvo);
		return "customer/updateForm";
		
	}
	
	@RequestMapping(value="/customerInsert", method=RequestMethod.POST) //내용등록
	public String customerInsert(@ModelAttribute CustomerVO cvo, HttpSession hsession){
		/*System.out.println("아무말대잔치");*/
		
		cvo.setCustomerBirth(cvo.getCustomerBirth()+cvo.getCustomerBirth1()+cvo.getCustomerBirth2());
		System.out.println(cvo.getCustomerBirth());
		
		cvo.setCustomerCellPhone(cvo.getCustomerCellPhone()+cvo.getCustomerCellPhone1()+cvo.getCustomerBirth2());
		System.out.println(cvo.getCustomerCellPhone());
		
		customerService.customerInsert(cvo);
		
		
		return "customer/registerForm";
		
	}
	
	@RequestMapping(value="/insertForm") //등록폼으로 들어가기 위한 것
	public String Insert(HttpSession hsession){
		/*System.out.println("아무말대잔치");*/
		return "customer/registerForm";
	}
}
