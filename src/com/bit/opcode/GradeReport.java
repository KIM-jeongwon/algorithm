package com.bit.opcode;

import java.util.Scanner;
public class GradeReport{
 public void main() {
	 Scanner s = new Scanner(System.in);
	 int kor = 0, eng = 0, math = 0, avg = 0;
	 String name ="", test = "";
	 System.out.print("당신의 이름은?\n");
	 name = s.next();
	 System.out.print("국어 점수\n");
	 kor = s.nextInt();
	 System.out.print("영어 점수\n");
	 eng = s.nextInt();
	 System.out.print("수학 점수\n");
	 math = s.nextInt();
	 avg = (kor + eng + math ) /3 ;
	switch(avg/10) {
	case 10 : test ="님의 학점은 A 입니다"; break;
	case 9 : test ="님의 학점은 a 입니다"; break;
	case 8 : test ="님의 학점은 b 입니다"; break;
	case 7 : test ="님의 학점은 c 입니다"; break;
	case 6 : test ="님의 학점은 d 입니다"; break;
	case 5 : test ="님의 학점은 e 입니다"; break;
		default :  test = "님의 학점은 F 입니다.";
	} 
	System.out.printf(name + test);
 }
}