package com.bit.loop;

import java.util.Scanner;

public class InfiniteDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴] 0.정지 1.bmi");
			int a = 0;
			a = scanner.nextInt();
			switch(a) {
				case 0 : System.out.println("시스템이 종료되었습니다.");
					return;
				case 1 : 
					break;	
			}
		}
	}
}
