package com.sangamone.controller;
import java.util.List;
import java.util.ArrayList;
public class K1 {
	public static void main(String []args) {
		List <String> odd=new ArrayList<>();
		List <String> even=new ArrayList<>();
		String cc="9876 5432 1234 5678";
		for (int i=0;i<10;i++) {
			odd.add(cc.substring(2*i, 2*i+1));
			
		}
		//System.out.println(odd);
		int len1=odd.size();
		String odd_cc="";
		for(int i=0;i<len1;i++) {
			odd_cc+=odd.get(i);
		}
		System.out.println(odd_cc);
	
	}

}
