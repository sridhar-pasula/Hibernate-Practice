package org.jsp.mobile.controller;

import java.util.Scanner;

import org.jsp.mobile.dao.Mobile_Dao;
import org.jsp.mobile.dto.Mobile;


public class Mobile_Controller {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter mobileId: ");
		int mobileId= sc.nextInt();
		
		System.out.println("Enter brandName: ");
		String brandName= sc.next();
		
		System.out.println("Enter ram: ");
		int ram= sc.nextInt();
		
		System.out.println("Enter storage: ");
		int storage= sc.nextInt();
		
		System.out.println("Enter processor: ");
		String processor= sc.next();
		
		System.out.println("Enter price: ");
		double price= sc.nextDouble();
		
		
		Mobile mobile= new Mobile(mobileId,brandName,ram,storage,processor,price);
		
//		Mobile mobile= new Mobile();
		
		Mobile_Dao dao= new Mobile_Dao();
		dao.saveMobile(mobile);
		
		
//		dao.updateMobile(mobile);
		
//		dao.FindMobile(mobile, mobileId);
		
//		dao.fetchAllMobiles();
		
//		dao.deleteMobiles(mobile,mobileId);
		
	}

}
