package Sunnysuh01;

public class Operators {
	public static void main(String[] args) {

		// 연산자 : 각종 작업들을 간단하게 표시한 기호
		// 산술연산자 : +, -, *, /, %
		//
		int x = 10, y = 4;
		System.out.printf("10 + 4 = %d \n", x + y);
		System.out.printf("10 - 4 = %d \n", x - y);
		System.out.printf("10 * 4 = %d \n", x * y);
		System.out.printf("10 / 3 = %d \n", x / y);
		System.out.printf("10 %% 3 = %d \n", x % y);

		// 비교연산자 : >, <, ==, !=
		String a = "Hello";
		String b = "hello";
		String c = "Hello";
		String d = new String("Hello");
		System.out.printf("10 > 4 = %b \n", x > y);
		System.out.printf("10 < 4 = %b \n", x < y);
		System.out.printf("10 == 4 = %b \n", x == y);
		System.out.printf("10 != 3 = %b \n", x != y);
		System.out.printf("10 %% 3 = %b \n", x % y);
		System.out.printf("a == b = %b \n", a == b);
		System.out.printf("b == c = %b \n", b == c);
		System.out.printf("a == c = %b \n", a == c);
		System.out.printf("c == d = %b \n", c == d);
		System.out.printf("c.equals(d) = %b \n", c.equals(d)); // 문자일 경우에 .equals로 비교해라!

		// 논리 연산자 : &&, ||, !
		// &&, || 는 단축 논리연산이 지원된다
		int i = 5;
		int j = 13;
		System.out.printf("(i > 4 || j < 10) = %b \n", i > 4 || j < 10);
		System.out.printf("(i < 4 && j > 10) = %b \n", i < 4 && j > 10);

	}
}