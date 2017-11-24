package com.bit.opcode;

import java.util.Scanner;
public class ClacSwitch {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String[] arr = {
	"첫번째 숫자 값을 입력하세요." ,
	"두번째 숫자 값을 입력하세요." ,
	"연산자를 입력하세요." ,
	"사칙 연산자만 입력 가능" ,
	"%d %s %d = %d"
	};
	int num1=0 , num2=0 , result=0;
	String opcode ="",  test = "" ;
	boolean inputok = true;
	System.out.print(arr [0]);
	num1 = s.nextInt();
	System.out.print(arr [1]);
	num2 = s.nextInt();
	System.out.print(arr [2]);
	opcode = s.next();
	switch(opcode) {
	case "+" : result = num1 + num2; break;
	case "-" : result = num1 - num2; break;
	case "*" : result = num1 * num2; break;
	case "/" : result = num1 / num2; break;
	case "%" : result = num1 % num2; break;
	default:
		inputok = false;
		break;
	}
	if(!inputok) {
		test =arr[3] ;
	}else {
		test = String.format(arr[4], num1, opcode, num2, result);
	}
	System.out.printf(test);
	}
}