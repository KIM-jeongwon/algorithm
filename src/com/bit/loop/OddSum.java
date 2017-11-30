package com.bit.loop;

// 1~100 까지 홀수의 합
// modular %
// 1 % 2 = 1 
// 2 % 2 = 0 
// 3 % 2 = 1
// 4 % 2 = 0
public class OddSum {
	public static void main(String[] args) {
		String str = "";
		int oddsum = 0;
		for (int i = 1; i <=99; i++) {
			if(i !=99) {
				if(i % 2 == 1) {
					str += i+"-";
					oddsum -= i;
				}
			}else{
					str += i+"=";
					oddsum -= i;
			}
			}
		System.out.print(str +"\n답="+oddsum);
	}
}