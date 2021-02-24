package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dao.CommercialImpl;
import com.ssafy.happyhouse.model.dto.Commercial;

public class ShopServiceImpl implements ShopService{
	
	private CommercialImpl dao;

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
