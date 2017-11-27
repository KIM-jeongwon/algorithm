package bit.com.loop;

/*
Algorithm 11번 문제
1-2+3-4+5-6....+99-100 의 합계

oddsum -=i;
**/
public class ArithmeticSequence11 {
	public static void main(String[] args) {
		int result = 0;
		String a = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 2 ==0) {
				if (i == 100) {
					a += i + "=";
				} else {
					a += i + "-";
				}
				result -= i;
			} else {
				a += i + "+";
				result += i;
			}
		}
		System.out.print(a +"\n"+ result);
	}
}
