package com.nss.customer.registerservice;

import com.nss.customer.registervo.RegisterVO;

public interface RegisterService {

	public int customerInsert(RegisterVO cvo);

	public int customerUpdate(RegisterVO cvo);
	
	
}
