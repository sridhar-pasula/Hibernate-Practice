package org.jsp.onetoone_bi.controller;

import org.jsp.onetoone_bi.dao.Mobile_Os_Dao;
import org.jsp.onetoone_bi.dto.Mobile;
import org.jsp.onetoone_bi.dto.OperatingSystem;

public class Mobile_Os_Controller {

	public static void main(String[] args) {
		Mobile mobile= new Mobile();
		
		mobile.setMobileId(101);
		mobile.setBrand("vivo");
		mobile.setColor("pink");
		mobile.setRam(16);
	
		OperatingSystem os= new OperatingSystem();
		
		os.setOsId(1001);
		os.setOsName("dimensity");
		os.setNoOfCores(8);
		os.setBit(64);
		os.setSpeed(2.4);
		
//		 here mobile has os and os has mobile
//		os.setMobile(mobile);
//		mobile.setOs(os);
		
		
		// here mobile has os but os doesnot have mobile
//		mobile.setOs(os);;
		
		// here os has mobile but mobile doesnot have os
		os.setMobile(mobile);
		mobile.setOs(os);
		
		
		Mobile_Os_Dao dao= new Mobile_Os_Dao();
//		dao.saveMobile(mobile);
//		dao.findOS(os,os.getOsId());
//		dao.saveMobile(mobile);
		dao.findMobile(mobile, mobile.getMobileId());
	}
	
}
