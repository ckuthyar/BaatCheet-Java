package com.sangamone.controller;

public class Cl1 {
	public static void diamond1(String word1) {
		String s1=word1;
		String placeholder=" ";
		int len1=s1.length();
		String temp1="";
		for(int j=0;j<len1;j++) {
			for(int i=0;i<len1-1-j;i++) {
				System.out.print(placeholder);
			}
			temp1=s1.substring(0,j+1);
			System.out.print(temp1);
			System.out.println();
		}
		for(int j=0;j<len1-1;j++) {
			for(int i=0;i<j+1;i++) {
				System.out.print(placeholder);

			}
			temp1=s1.substring(0,len1-1-j);
			System.out.print(temp1);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond1("clinton");
		diamond1("prithviraj");
		
		
		
		
		
		
		
	}
}
