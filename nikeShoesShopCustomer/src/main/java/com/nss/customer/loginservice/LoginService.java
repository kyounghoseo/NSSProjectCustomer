package com.nss.customer.loginservice;

import com.nss.customer.customervo.CustomerVO;

public interface LoginService {

	public CustomerVO loginInsert(CustomerVO cvo); //로그인
	
	/*public int loginCheck(CustomerVO cvo);//ID중복체크(DB에 저장된 ID와 입력한 ID가 맞는가)
*/
	public CustomerVO idInsert(CustomerVO cvo);//아이디 찾기

	public CustomerVO pwInsert(CustomerVO cvo);//비밀번호 찾기

	public CustomerVO pwUpdate(CustomerVO cvo);//비밀번호 재설정


}
