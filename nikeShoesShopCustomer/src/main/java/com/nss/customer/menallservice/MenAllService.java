package com.nss.customer.menallservice;

import java.util.List;


import com.nss.customer.menallvo.MenAllVO;

public interface MenAllService {
	public List<MenAllVO> allList(MenAllVO mavo);
	public MenAllVO allDetail(MenAllVO mavo);
}
