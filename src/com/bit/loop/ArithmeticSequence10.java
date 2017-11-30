package com.bit.loop;
/*
 Algorithm 10번 문제
 1+2+3+4+....+100 의 합계
 override -> 기존값을 삭제하고 추가 
 overload -> 기존값을 삭제하지 않고 추가 ("+")
 **/
public class ArithmeticSequence10 {
	public void main() {
		// 1 + 2 + 3 ...+10
		int result = 0;
		String a = " ";
		for(int i = 1; i<=100; i++) {
			if(i==100) {
				a+=i+"=";
			}else{
				a+=i+"+";
			}
			result += i;
		}
			System.out.print(a+result);
	}
}
