package com.sangamone.controller;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class M1 {
	public static void convert3(int num3) {
		int input1=num3;
		if(input1<100) {
			convert2(input1);
			
		}
		else {
		
			double temp1=input1/100.0;
			int part1=((int)temp1);
			int part2=part1*100;
			int part3=input1-part2;
			System.out.println(part1);
			System.out.println(part2);
			System.out.println(part3);
			convert2(part1);
			System.out.print("hundred ");
			convert2(part3);
			
			
		}
	}
	public static void convert2(int num2) {
		int input1=num2;
		if(input1<=20) {
			convert1(input1);
		}
		else {
		
			double temp1=input1/10.0;
			int part1=((int)temp1)*10;
			int part2=input1-part1;
//			System.out.println(part1);
//			System.out.println(part2);
			convert1(part1);
			convert1(part2);
		}
	}
	
	
	public static void convert1(int num1) {
		int input1=num1;
		List<Integer> list1= new ArrayList<>();
		List<String> list2= new ArrayList<>();
		for(int i=0;i<=20;i++) { 
			list1.add(i);
		}
		for(int i=3;i<10;i++) {
			list1.add(10*i);
		}
		

		
		list2.add("");
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		list2.add("six");
		list2.add("seven");
		list2.add("eight");
		list2.add("nine");
		list2.add("ten");
		list2.add("eleven");
		list2.add("twelve");
		list2.add("thirteen");
		list2.add("fourteen");
		list2.add("fifteen");
		list2.add("sixteen");
		list2.add("seventeen");
		list2.add("eighteen");
		list2.add("nineteen");
		list2.add("twenty");
		list2.add("thirty");
		list2.add("forty");
		list2.add("fifty");
		list2.add("sixty");
		list2.add("seventy");
		list2.add("eighty");
		list2.add("ninety");
		
		int pos=list1.indexOf(input1);
		String output1=list2.get(pos);
		System.out.print(output1+" ");
	}
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int input1=sc1.nextInt();
		
		convert3(input1);
		
	}
	
	

}
