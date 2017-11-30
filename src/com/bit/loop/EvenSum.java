package com.bit.loop;

public class EvenSum {
	public void main() {
		String str =" ";
		int evensum = 0;
		for(int i =1; i<=100; i++) {
			if(i !=100) {
				if(i %2 ==0) {
					str += i+"+";
					evensum += i;
				}	
				}else {
					str += i+"=";
					evensum += i;
				}
		}
			System.out.print(str+"\n"+evensum);
			}
}
