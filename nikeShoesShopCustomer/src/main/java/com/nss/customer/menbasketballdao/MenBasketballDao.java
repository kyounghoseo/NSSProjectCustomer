package com.nss.customer.menbasketballdao;

import java.util.List;

import com.nss.customer.menbasketballvo.MenBasketballVO;

public interface MenBasketballDao {
	public List<MenBasketballVO> basketballList(MenBasketballVO mbvo);
}
