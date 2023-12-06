package com.sangamone.controller;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class C12 {
	public static void convert3(int num3) {
		int input3=num3;
		int part1=(int)(input3/100.0);
		int part2=100;
		int part3=input3-part1*100;
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		convert2(part1);
		convert2(part2);
		convert2(part3);
	}
	public static void convert2(int num2) {
		
		int part1;
		int part2;
		int input1=num2;
		if(input1<=20) {
			convert1(input1);
		}else if (input1<100) {
			part1=((int)(input1/10.0))*10;
			part2=input1-part1;
			convert1(part1);
			convert1(part2);
		}else {
			convert1(input1);
		}
		
	}
	
	public static void convert1(int num1) {
		List<Integer>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		for(int i=1;i<20;i++) {
			list1.add(i);
		}
		for(int i=2;i<10;i++) {
			list1.add(10*i);
		}
		list1.add(100);
		
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		list2.add("Six");
		list2.add("Seven");
		list2.add("Eight");
		list2.add("Nine");
		list2.add("Ten");
		list2.add("Eleven");
		list2.add("Twelve");
		list2.add("Thirteen");
		list2.add("Fourteen");
		list2.add("Fifteen");
		list2.add("Sixteen");
		list2.add("Seventeen");
		list2.add("Eighteen");
		list2.add("Nineteen");
		list2.add("Twenty");
		list2.add("Thirty");
		list2.add("Forty");
		list2.add("Fifty");
		list2.add("Sixty");
		list2.add("Seventy");
		list2.add("Eighty");
		list2.add("Ninety");
		list2.add("Hundred");
		
		int position=list1.indexOf(num1);
		String output1=list2.get(position);
		System.out.print(output1);
		System.out.print(" ");
	}

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int input2=sc1.nextInt();
		convert2(input2);
		sc1.close();
		
		
	}

}
