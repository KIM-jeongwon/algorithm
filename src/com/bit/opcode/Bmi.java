package com.bit.opcode;

/*
 고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만 
BMI = T2/W
 **/
import java.util.Scanner;

public class Bmi {
	public void main() {
		Scanner s = new Scanner(System.in);
		String res = "";
		int a = 0;
		System.out.println("사람 수를 입력하세요");
		a = s.nextInt();
		int i = 0;
		while(i < a) {
			String name = "", t = "";
			double hei = 0.0, wei = 0.0, bmi = 0.0;
			System.out.println("이름을 입력하세요.");
			name = s.next();
			System.out.println("키를 입력하세요.");
			hei = s.nextDouble() / 100;
			System.out.println("몸무게를 입력하세요.");
			wei = s.nextDouble();
			bmi = wei / (hei * hei);
			if (35 < bmi) {
				t = "고도비만입니다.";
			} else if (35 >= bmi && bmi > 30) {
				t = "중도비만입니다.";
			} else if (30 >= bmi && bmi > 25) {
				t = "경도비만입니다.";
			} else if (24.9 >= bmi && bmi > 23) {
				t = "과체중입니다.";
			} else if (22.9 >= bmi && bmi >= 18.5) {
				t = "정상체중입니다.";
			} else {
				t = "저체중입니다.";
			}
			res += String.format("이름:%s %s\n", name , t) ;
			a--;
		}
		
		System.out.printf(res);
	}
}
