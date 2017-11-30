package com.bit.portal;

import java.util.Scanner;

import com.bit.opcode.Ssn;
import com.bit.opcode.Whoareyou;
import com.bit.loop.EvenSum;
import com.bit.opcode.Bmi;
import com.bit.opcode.Calc;
import com.bit.opcode.ClacSwitch;
import com.bit.opcode.GradeReport;
import com.bit.opcode.HowMuch;

public class Portal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int val=0;
			while(true) {
		System.out.println("가고싶은곳을 정하시오.");
		val = s.nextInt();
		Ssn ssn = new Ssn();
		Bmi bmi = new Bmi();
		Calc calc = new Calc();
		ClacSwitch clacswitch= new ClacSwitch();
		GradeReport gradereport = new GradeReport();
		Whoareyou whoareyou = new Whoareyou();
		HowMuch howmuch = new HowMuch();
		EvenSum evenSum = new EvenSum();
		switch(val) {
			case 1 : 
			ssn.main();
			return; 
			case 2 :
			bmi.main();
			return;
			case 3 :
			calc.main();
			return;
			case 4 :
			clacswitch.main();
			return;
			case 5 : 
			gradereport.main();
			return;
			case 6 :
			whoareyou.main();
			case 7 :
			howmuch.main();
			case 8 :
			evenSum.main();
			
		default :
			break;
		}
		}
	}
}
