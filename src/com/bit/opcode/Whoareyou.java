package com.bit.opcode;

import java.util.Scanner;
public class Whoareyou {
	public void main() {
	Scanner s = new Scanner(System.in);
	String[] arr = {
	"당신의 이름은" ,
	"당신은 %s 입니다"
	};
	String name ="";
	System.out.print(arr [0]);
	name = s.next();
	System.out.printf(arr [1], name);
	}
}
