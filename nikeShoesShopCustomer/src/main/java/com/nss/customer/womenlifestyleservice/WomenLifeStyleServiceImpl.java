package com.nss.customer.womenlifestyleservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.womenlifestyledao.WomenLifeStyleDao;
import com.nss.customer.womenlifestylevo.WomenLifeStyleVO;

@Service
@Transactional
public class WomenLifeStyleServiceImpl implements WomenLifeStyleService{
	Logger logger = Logger.getLogger(WomenLifeStyleService.class);
	
	@Autowired
	private WomenLifeStyleDao wmlifestyleDao;

	//여성 라이프스타일 리스트
	@Override
	public List<WomenLifeStyleVO> wmlifestyleList(WomenLifeStyleVO wlsvo) {
		List<WomenLifeStyleVO> wmlifestyleList = null;
		wmlifestyleList = wmlifestyleDao.wmlifestyleList(wlsvo);
		return wmlifestyleList;
	}

}
