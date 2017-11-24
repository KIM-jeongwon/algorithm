package com.bit.opcode;

import java.util.Scanner;
public class HowMuch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int price = 0, b = 0, c = 0, d = 0, result = 0;
		String[] arr = {
				" 얼마입니까\n" ,
				" %d 원 입니다\n" ,
				" 몇개드릴까요\n" ,
				" %d 개 주세요\n" ,
				" 총금액은 %d 원 입니다\n" ,
				" 몇퍼센트 DC할까요?\n" ,
				" 안팔아요" ,
				" %d 원입니다" ,
		};
		System.out.print(arr[0]);
		price = s.nextInt();
		System.out.printf(arr[1], price);
		System.out.print(arr[2]);
		b = s.nextInt();
		System.out.printf(arr[3], b);
		c = price * b ;
		System.out.printf(arr[4], c);
		System.out.print(arr[5]);
		d = s.nextInt();
		result = c -( c * d /100);
		if(d > 10) {
			System.out.print(arr[6]);
		}else
		System.out.printf(arr[7], result);
		}
 }
