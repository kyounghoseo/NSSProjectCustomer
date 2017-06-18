package com.nss.customer.menalldao;

import java.util.List;

import com.nss.customer.menallvo.MenAllVO;

public interface MenAllDao {
	public List<MenAllVO> allList(MenAllVO mavo);//남자 전체 상품 리스트
	public MenAllVO allDetail(MenAllVO mavo); //남자 전체 상품 상세보기
}
