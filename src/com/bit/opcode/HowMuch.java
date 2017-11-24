package com.bit.opcode;

import java.util.Scanner;
public class HowMuch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int price = 0, b = 0, c = 0, d = 0, result = 0;
		String[] arr = new String [5];
		arr [0] = "얼마입니까";
		arr [1] = String.format("%d원 입니다", price);
		arr [2] = "몇개드릴까요";
		arr [3] = String.format("%d개 주세요", b);
		arr [4] = String.format("총금액은+%d원 입니다+",c);
		arr [5] = "몇퍼센트 DC할까요?";
		arr [6] = "안팔아요";
		arr [7] = String.format("%d원입니다" , result);
		price = s.nextInt();
		b = s.nextInt();
		c = price * b ;
		d = s.nextInt();
		result = c -( c * d /100);
		System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.print(arr[2]);
		System.out.print(arr[3]);
		System.out.print(arr[4]);
		System.out.print(arr[5]);
		if(d>10) {
			System.out.print(arr[6]);
		}else
		System.out.printf(arr[7]);
		}
 }
