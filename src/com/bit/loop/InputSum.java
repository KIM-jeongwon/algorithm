package com.bit.loop;

import java.util.Scanner;

/*
 사용자가 원하는대로 숫자를 입력하게 하고
0을 누르면 총 누적된 합계를 보여주는 어플
 **/
public class InputSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0 , sum =0;
		String opcode = "";
		while(true) {
			System.out.println("숫자를 적으시오, 0: 답은 ");
			a = s.nextInt();
				switch(a) {
					case 0 :
						System.out.println(sum);
						return;
					default : 
						System.out.println("부호 입력");
						opcode = s.next();
						switch(opcode) {
						case "+" : 
							sum += a;
							break;
						case "-" :
							sum -= a;
							break;
				}
			}
		}
	}
}
