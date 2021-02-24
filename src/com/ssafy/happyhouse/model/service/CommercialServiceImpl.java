package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dao.CommercialImpl;
import com.ssafy.happyhouse.model.dto.Commercial;

public class CommercialServiceImpl implements CommercialService{
	
	private CommercialImpl dao;
	
	public CommercialServiceImpl() {
		dao = new CommercialImpl();
	}
	
	@Override
	public List<Commercial> search() {
		return dao.getShopList();
	}

	@Override
	public List<Commercial> search(String dong) {
		// TODO Auto-generated method stub
		return dao.getShopList(dong);
	}

}
