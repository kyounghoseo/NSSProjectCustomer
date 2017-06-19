package com.nss.customer.loginController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String login(HttpSession hsession) {// 濡쒓렇�씤 �뱾�뼱媛덈븣
		return "/customer/login/login";
	}

	@RequestMapping(value = "/loginForm", method = RequestMethod.POST)
	public String loginForm(@ModelAttribute CustomerVO cvo, HttpSession Session) {// 濡쒓렇�씤�궡�슜
		System.out.println("濡쒓렇�씤 泥댄겕 而⑦듃濡ㅻ윭" + cvo.getLoginCustomerID());
		System.out.println(cvo.getLoginCustomerPW());
		String url = "";
		CustomerVO customer = new CustomerVO();

		customer = loginService.loginInsert(cvo);

		Session.setAttribute("loginSession", customer);
		System.out.println(customer.getLoginCustomerID());
		System.out.println(customer.getLoginCustomerPW());

		System.out.println("濡쒓렇�씤 泥댄겕 ");

		return "redirect:/index.jsp";

	}

	/*
	 * @RequestMapping(value="/loginCheck", method=RequestMethod.POST) public
	 * String loginCheck(@ModelAttribute CustomerVO cvo, HttpSession
	 * hsession){//以묐났�솗�씤?
	 * 
	 * return "index";
	 * 
	 * }
	 */

	@RequestMapping(value = "/idSearch")
	public String idSearch(HttpSession hsession) {
		return "/customer/login/idSearch";// �븘�씠�뵒 李얘린

	}

	@RequestMapping(value = "/idConfirm", method = RequestMethod.POST)
	public String idConfirm(@ModelAttribute CustomerVO cvo, Model model) {// �븘�씠�뵒李얘린
		System.out.println("idConfirmController");
		String url = "";

		CustomerVO customer = new CustomerVO();
		customer = loginService.idInsert(cvo);

		System.out.println(customer.getCustomerID());

		url = "/customer/login/idConfirm";

		model.addAttribute("customerID", customer.getCustomerID());

		return url;// �븘�씠�뵒 李얘린-> �뿬湲곗뿉 �벐�뒗 留듯븨紐낆� jsp�뙆�씪紐�

	}

	@RequestMapping(value = "/pwSearch")
	public String pwSearch(HttpSession hsession) {// 鍮꾨�踰덊샇 李얘린
		return "/customer/login/pwSearch";
	}

	@RequestMapping(value = "/pwConfirm", method = RequestMethod.POST)
	public String pwConfirm(@ModelAttribute CustomerVO cvo, Model model) {// 鍮꾨�踰덊샇
																			// �옱�꽕�젙
		/* System.out.println(pwSearchForm); */
		String url = "";

		CustomerVO customer = new CustomerVO();

		try {

			customer = loginService.pwInsert(cvo);

		} catch (Exception e) {
			// TODO: handle exception
		}

		if (customer.getCustomerPW() != null || customer.getCustomerPW() != "") {

			url = "/customer/login/pwConfirm";
		} else {
			
			url = "/customer/login/pwSearch";
		}

		return "redirect:"+url;

	}

	@RequestMapping(value = "/pwConfirm2", method = RequestMethod.POST)
	public String pwConfirm2(@ModelAttribute CustomerVO cvo, Model model) {// 비밀번호
																			// 재설정
																			// 여기서
																			// 수정
		System.out.println("pwConfirm2 호출 성공");

		int result = 0;
		String url = "";

		result = loginService.pwUpdate(cvo);

		if (result == 1) {

			url = "/login/login.do";
		}
		return url;

	}
		
}
