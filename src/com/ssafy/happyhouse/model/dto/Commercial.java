package com.ssafy.happyhouse.model.dto;

public class Commercial {
	private String no;
	private String shopname;
	private String codename1;
	private String codename2;
	private String gu;
	private String dong;
	private String jibuaddress;
	private String address;
	public Commercial() {}
	public Commercial(String no, String shopname, String codename1,
			String codename2, String gu, String dong, String jibuaddress, String address) {
		this.no = no;
		this.shopname = shopname;
		this.codename1 = codename1;
		this.codename2 = codename2;
		this.gu = gu;
		this.dong = dong;
		this.jibuaddress = jibuaddress;
		this.address = address;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getCodename1() {
		return codename1;
	}
	public void setCodename1(String codename1) {
		this.codename1 = codename1;
	}
	public String getCodename2() {
		return codename2;
	}
	public void setCodename2(String codename2) {
		this.codename2 = codename2;
	}
	public String getGu() {
		return gu;
	}
	public void setGu(String gu) {
		this.gu = gu;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getJibuaddress() {
		return jibuaddress;
	}
	public void setJibuaddress(String jibuaddress) {
		this.jibuaddress = jibuaddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Commercial [no=" + no + ", shopname=" + shopname + ", codename1=" + codename1 + ", codename2=" + codename2 + ", gu=" + gu
				+ ", dong=" + dong + ", jibuaddress=" + jibuaddress + ", address=" + address + "]";
	}
	
}
