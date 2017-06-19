package com.nss.customer.logindao;

import com.nss.customer.customervo.CustomerVO;

public interface LoginDao {

	public CustomerVO loginInsert(CustomerVO cvo);//濡쒓렇�씤
	
	/*public int loginCheck(CustomerVO cvo);//ID以묐났泥댄겕(DB�뿉 ���옣�맂 ID�� �엯�젰�븳 ID媛� 留욌뒗媛�)
*/	
	public CustomerVO idInsert(CustomerVO cvo);//�븘�씠�뵒 李얘린
	
	public CustomerVO pwInsert(CustomerVO cvo);//鍮꾨�踰덊샇 李얘린
	
	public int pwUpdate(CustomerVO cvo);//鍮꾨�踰덊샇 �옱�꽕�젙
	
}
