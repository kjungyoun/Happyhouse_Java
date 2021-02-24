package com.ssafy.happyhouse.model.service;

import java.util.List;

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
