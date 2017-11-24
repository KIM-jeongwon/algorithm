package com.bit.opcode;

import java.util.Scanner;
public class Whoareyou {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String[] arr = new String [2];
	arr [0] ="당신의 이름은";
	arr [1] ="당신은 %s 입니다";
	String name ="";
	System.out.print(arr [0]);
	name = s.next();
	System.out.printf(arr [1],name);
	}
}
