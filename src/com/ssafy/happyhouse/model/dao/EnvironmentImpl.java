package com.ssafy.happyhouse.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import com.ssafy.happyhouse.model.dto.Environment;
import com.sun.imageio.plugins.common.SubImageInputStream;

public class EnvironmentImpl {
	private List<Environment> envInfo;
	
	public EnvironmentImpl() {
		envInfo = new LinkedList<Environment>();
//		load1();
//		load2();
//		load3();
		load4();
	}

	private void load1() {
		File f = new File("res"+File.separator+"서울시 강남구 환경 지도점검 내역 현황.csv");
		if(f.exists()) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(f), "UTF-8"))) {
				 String line=null;
	             reader.readLine();
	             while((line=reader.readLine()) != null) {
	            	 String[] info = line.split(",");
	            	 System.out.println();
	            	 if(info.length == 5) {
	            		 envInfo.add(new Environment(info[0], Integer.parseInt(info[1]), info[2], Integer.parseInt(info[3]), info[4])); 
	            	 } else if(info.length == 4) {
	            		 envInfo.add(new Environment(info[0], Integer.parseInt(info[1]), info[2], Integer.parseInt(info[3]), ""));
	            	 }
	             }
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	private void load2() {
		File f = new File("res"+File.separator+"서울시 강동구 환경 지도점검 내역 현황.csv");
		if(f.exists()) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(f), "UTF-8"))) {
				 String line=null;
				 reader.readLine();
	             while((line=reader.readLine()) != null) {
	            	 String[] info = line.split(",");
	            	 if(info.length == 5) {
	            		 envInfo.add(new Environment(info[0], Integer.parseInt(info[1]), info[2], Integer.parseInt(info[3]), info[4]));
	            	 } else if(info.length == 4) {
	            		 envInfo.add(new Environment(info[0], Integer.parseInt(info[1]), info[2], Integer.parseInt(info[3]), ""));
	            	 }
	             }
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	private void load3() {
		File f = new File("res"+File.separator+"서울시 강서구 환경 지도점검 내역 현황.csv");
		if(f.exists()) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(f), "UTF-8"))) {
				 String line=null;
				 reader.readLine();
	             while((line=reader.readLine()) != null) {
	            	 String[] info = line.split(",");
	            	 if(info.length == 5) {
	            		 envInfo.add(new Environment(info[0], Integer.parseInt(info[1]), info[2], Integer.parseInt(info[3]), info[4]));
	            	 } else if(info.length == 4) {
	            		 envInfo.add(new Environment(info[0], Integer.parseInt(info[1]), info[2], Integer.parseInt(info[3]), ""));
	            	 }
	             }
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	private void load4() {
		File f = new File("res"+File.separator+"서울시 종로구 환경 지도점검 내역 현황.csv");
		if(f.exists()) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(f), "MS949"))) {
				 String line=null;
				 reader.readLine();
	             while((line=reader.readLine()) != null) {
	            	 String[] info = line.split(",");
	            	 if(info.length == 13) {
	            		 envInfo.add(new Environment(info[0].substring(1, info[0].length()-1), Integer.parseInt(info[2].substring(1, info[2].length()-1)), info[12].substring(1, info[12].length()-1), 11110, ""));
	            	 }
	             }
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public List<Environment> getEnvList(String dong){
		List<Environment> tmp = new LinkedList<Environment>();
		for (int i = 0, end = envInfo.size(); i < end; i++) {
			if(envInfo.get(i).getAddress().contains(dong)){
				tmp.add(envInfo.get(i));
			}
		}
		return tmp;
	}
}
