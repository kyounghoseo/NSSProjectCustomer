package com.nss.customer.registerdao;

import com.nss.customer.registervo.RegisterVO;

public interface RegisterDao {

	public int customerInsert(RegisterVO cvo);
	
	public int customerUpdate(RegisterVO cvo);
	
	
}
