package com.nss.customer.menallservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.menalldao.MenAllDao;
import com.nss.customer.menallvo.MenAllVO;


@Service
@Transactional
public class MenAllServiceImpl implements MenAllService {
	
	Logger logger = Logger.getLogger(MenAllService.class);

	@Autowired
	private MenAllDao menallDao;
	
	//남자 상품 전체 리스트
	@Override
	public List<MenAllVO> allList(MenAllVO mavo) {
		List<MenAllVO> allList = null;
		allList = menallDao.allList(mavo);
		return allList;
	}

	//전체상품 디테일 보기
	@Override
	public MenAllVO allDetail(MenAllVO mavo) {
	MenAllVO detail = null;
	detail = menallDao.allDetail(mavo);
		return detail;
	}


	
	
}
