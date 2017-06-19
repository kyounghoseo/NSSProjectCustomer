package com.nss.customer.menbasketballservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.menbasketballdao.MenBasketballDao;
import com.nss.customer.menbasketballvo.MenBasketballVO;

@Service
@Transactional
public class MenBasketballServiceImpl implements MenBasketballService{

	Logger logger = Logger.getLogger(MenBasketballService.class);
	
	@Autowired
	private MenBasketballDao menbasketballDao;
	
	//남성 농구화 리스트
	@Override
	public List<MenBasketballVO> basketballList(MenBasketballVO mbvo) {
		List<MenBasketballVO> basketballList =null;
		basketballList = menbasketballDao.basketballList(mbvo);
		return basketballList;
	}

}
