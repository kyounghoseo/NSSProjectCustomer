package com.nss.customer.loginController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.AlternativeJdkIdGenerator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.nss.customer.customervo.CustomerVO;
import com.nss.customer.loginservice.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login")
	public String login(HttpSession hsession) {// 로그인 들어갈때
		return "login/login";
	}

	@RequestMapping(value = "/loginForm", method = RequestMethod.POST)
	public String loginForm(@ModelAttribute CustomerVO cvo, HttpSession Session) {// 로그인내용
		System.out.println("로그인 체크 컨트롤러" + cvo.getLoginCustomerID());
		System.out.println(cvo.getLoginCustomerPW());
		String url = "";
		CustomerVO customer = new CustomerVO();
		customer = loginService.loginInsert(cvo);

		Session.setAttribute("loginSession", customer);
		System.out.println(customer.getLoginCustomerID());
		System.out.println(customer.getLoginCustomerPW());

		System.out.println("로그인 체크 ");

		return "redirect:/index.jsp";

	}

	/*
	 * @RequestMapping(value="/loginCheck", method=RequestMethod.POST) public
	 * String loginCheck(@ModelAttribute CustomerVO cvo, HttpSession
	 * hsession){//중복확인?
	 * 
	 * return "index";
	 * 
	 * }
	 */

	@RequestMapping(value = "/idSearch")
	public String idSearch(HttpSession hsession) {
		return "login/idSearch";// 아이디 찾기

	}

	@RequestMapping(value = "/idConfirm", method = RequestMethod.POST)
	public String idConfirm(@ModelAttribute CustomerVO cvo, Model model) {// 아이디찾기
		System.out.println("idConfirmController");
		String url = "";

		CustomerVO customer = new CustomerVO();
		customer = loginService.idInsert(cvo);
		
		System.out.println(customer.getCustomerID());

			url= "login/idConfirm";

		model.addAttribute("customerID", customer.getCustomerID());
		
		  return url;//아이디 찾기-> 여기에 쓰는 맵핑명은 jsp파일명
		                                                        
	}

	@RequestMapping(value = "/pwSearch")
	public String pwSearch(HttpSession hsession) {// 비밀번호 찾기
		return "login/pwSearch";
	}
	
	@RequestMapping(value = "/pwConfirm", method = RequestMethod.POST)
	public String pwConfirm(@ModelAttribute CustomerVO cvo, Model model){//비밀번호 재설정
		/*System.out.println(pwSearchForm);*/
		String url = "";
		
		CustomerVO customer = new CustomerVO();
		customer = loginService.pwInsert(cvo);
		
		if (customer.getCustomerPW().equals(cvo.getLoginCustomerPW())) {
			
			url = "/login/pwConfirm";
		}
		
		return url;
		
	}
	
	

}
