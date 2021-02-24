package com.ssafy.happyhouse.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import com.ssafy.happyhouse.model.dto.Commercial;

public class CommercialImpl {
	List<Commercial> comInfo;
	public CommercialImpl() {
		comInfo = new LinkedList<Commercial>();
		load();
	}
	
	private void load() {
		File f = new File("res"+File.separator+"CommercialArea.csv");
		if(f.exists()) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(f), "UTF-8"))) {
				 String line=null;
	             reader.readLine();
	             while((line=reader.readLine()) != null) {
	            	 String[] info = line.split(",");
	            	 if(info.length == 23) {
	            		 comInfo.add(new Commercial(info[0], info[1], info[4], info[6], info[14], info[16], info[17].substring(1, info[17].length()-1), info[18].substring(1, info[18].length()-1)));
	            	 } else if(info.length == 24) {
	            		 comInfo.add(new Commercial(info[0], info[1], info[5], info[7], info[15], info[17], info[18].substring(1, info[18].length()-1), info[19].substring(1, info[19].length()-1)));
	            	 }
	             }
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public List<Commercial> getShopList(){
		return comInfo;
	}
	
	public List<Commercial> getShopList(String dong){
		List<Commercial> tmp = new LinkedList<Commercial>();
		for (int i = 0; i < comInfo.size(); i++) {
			if(comInfo.get(i).getDong().contains(dong)) {
				tmp.add(comInfo.get(i));
			}
		}
		return tmp;
	}
}
