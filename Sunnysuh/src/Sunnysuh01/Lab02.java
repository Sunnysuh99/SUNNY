package Sunnysuh01;

public class Lab02 {
	public static void main(String[] args) {

		// 연습문제_Print

		// #02 회원정보(이름, 몸무게, 나이)
		// String name = '서재천';
		int weight = 76;
		int age = 59;
		// System.out.println(name);
		System.out.println(weight);
		System.out.println(age);

		// #03 수학식
		// 3 * x
		int x = 10;
		int y = 20;
		int z = 30;
		int result = 0;
		System.out.printf("3 * x * Y / z");

		result = 3 * x;
		result = 3 * x + y;
		result = (x + y) / 7;
		result = (3 * x + y) / (z + 2);

		// #04 실행 결과 : 정수끼리 연산은 언제나 정수
		double number = (1 / 3) * 3;
		System.out.printf("(1/3)*3 = %d \n", (1 / 3) * 3);
		System.out.printf("(1/3)*3 = %d \n", ((double) 1 / 3) * 3);

		// #05 몫과 나머지
		int quotient, remander;
		// System.out.println(quotient);
		// int remainder = d % e;
		// System.out.println(remainder);

		// #06 실행결과
		// int result = 11;
		result /= 2; // r + r / 2;

		// #07 우선순위
		double x2 = 2.5;
		double y2 = -1.5;
		int m = 18;
		int n = 4;
		// x + n * y - (x + n) * y;
		System.out.println(x + n * y - (x + n) * y);
		System.out.println(m / n + m & n);
		System.out.println(5 * x - n / 5);
		System.out.println(1 - (1 - (1 - (1 - (1 - n)))));

		// #08 계산 논리연산자의 단축평가
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		// System.out.println(true || false && 3 < 4 || !(5 == 7));
		// System.out.println(true || (3 < 5 && 6 >= 2));

		// #09 문자열로 처리
		System.out.println("May 13, 1988 fell on day number ");
		// System.out.println((13 + (13*3-1)/5+1988 %d);
		// day는 요일을 출력하고 일(0), 월(1), 화(2)..........
		// 특정일 : (Year + (Year / 4) - (Year / 100) + (Year / 400) + (13 * Month + 8) / 5
		// + Day) % 7);
		System.out.println((1988 + (1988 / 4) - (1988 / 100) + (1988 / 400) + (13 * 05 + 8) / 5 + 21) % 7);
		System.out.println("//hello there" + '9' + 7);
		System.out.println('H' + 'I' + "is" + 1 + "more example" + '9' + 7);
		System.out.println("print both of us");
		System.out.println('H' + 'I' + "is" + 1 + "more exe" + '9' + 7);

		// #10 단축연산
		System.out.println(7);

		// #11 사칙연산
		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13 + 4.0);
		System.out.println(27 / 13.0 + 4);

		// #12 형 변환 : 축소형
		int n = (int) 3.9;
		System.out.println("n == " + n);

		// #13 형 변환 : 증/감 형
		int p = (int) 3;
		p++;
		System.out.println("p == " + p);

		p = 3;
		System.out.println("p == " + p++);
		System.out.println("p == " + p);

		p = 3;
		p--;
		System.out.println("p == " + p++);
		System.out.println("p == " + p);

		p = 3;
		System.out.println("p == " + p--);
		System.out.println("p == " + p);

		// #14 문자열결
		System.out.println("2 + 2 = " + (2 + 2));

		// #15 문자열결
		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a);

		b = 'c';
		System.out.println(b);

		a = b;
		System.out.println(a);

	}
}
