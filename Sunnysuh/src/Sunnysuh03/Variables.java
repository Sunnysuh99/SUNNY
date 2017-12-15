package Sunnysuh03;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		/*
		 * 자바 기본 자료형 int ; 정수(byte, short, double, long) double : 실수 (float) char : 문자
		 * string : 문자열
		 */

		// 변수: 자료형 변수이름
		int a; // 정수형 변수
		double b; // 실수형 변수
		char c; // 문자 변수 (1차)
		String d; // 문자열 변수

		// 상수: final 자료형 변수이름;
		// 변수불가 자료를 저장할 목적으로 사용
		// 변수이름은 대문자로 작성!
		final int E;
		final double F;
		final char G;
		final String H;

		// 자바 예약어를 변수로 사용 불가!
		// int if;
		// double import;
		// char System; //비 추천!
		// String String; //비 추천!

		// 회원정보(아이디, 비번, 이름, 나이)
		String userid; // id, uid, 아이디
		String passwd; // password, pwd
		String name;
		int age;

		// String userId, passwd, name;
		// ,를 사용하여 구분 가능
		// 한번에 선언가능 (비추천 - 가동성 문제)
		// String name="x", passwd="y", name="z"; (비추천)
		// 영속적 기록 : '파일'로 저장,
		// DBMS : Data Base Management System

		// 리터럴 : 컴파일러가 이해할 수 있는 형식으로 작성된 데이터나 값

		// int juminNo = 123456789999;
		long juminNo = 12345678999L;

		// 변수 초기화 : 변수에 값을 대비
		// 변수명 = 값;
		userid = "zzzyzzy";
		passwd = "987654";
		name = "suji";
		age = 23;

		b = 123.456;

		float pi = 3.145678F;

		// C = '수';
		G = 'S';

		// 변수 vs. 상수
		// C = '우';
		// G = 'X'; // ???
		// G = 'X'; // 상수이므로 변경이 불가

		// 선언과 초기화
		int i = 123;
		double j = 789.123;
		boolean k = true; // 논리형 변수
		k = false;
		// k = 1213;
		// k = '가';

		// 변수/상수 이름\// 벼수는 일반적으로 소문자
		// 만일 이름을 두 단어로 사용시 Camel 표기법
		int juminCode;
		String sayHello;

		// 상수는 모두 대분자로 사용하되 두 단어일 경우: 단어_단어 로 이어서
		final double PI = 3.14;
		final int THIS_YEAR = 2017;
		final String USER_ID = "zzyzzy";

		// JDK7부터 도입된 자릿수 표시:
		// jumin = 123456789L;
		// jumin = 234_567_123_333L;

		// 문자와 숫자간의 변환
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = '가';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = '나';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 'z';
		System.out.println(ch);
		System.out.println((int) ch);

		String chars = "abc";
		System.out.println(chars.charAt(0));
		System.out.println((int) chars.charAt(0));

		// 특수문자 - escape sequence
		System.out.println("가      나");
		System.out.println("가\t나"); // 탭문자
		System.out.println("가\n나"); // 줄바꿈
		System.out.println("가\"나"); // 큰 따옴표 문자
		System.out.println("가\'나"); // 작은 다옴표 문자

		// 변수를 출력하는 방법 팁
		System.out.println(userid); // 탭문자
		System.out.println(passwd); // 줄바꿈
		System.out.println(name); // 큰 따옴표 문자
		System.out.println(age); // 탭문자

		System.out.println("아이디 : " + userid);
		System.out.println("이름 : " + name); // 큰 따옴표 문자

		System.out.println("아이디 : " + userid + "비밀번호" + passwd + "이름 : " + name + "나이 : + age");

		// 서식화된 출력 - printf
		System.out.printf("아이디 : %s, 비밀번호 : %s, 이름 : %s, 나이 : %d \n", userid, passwd, name, age);

		String fmt = "아이디 : %s, 비밀번호 : %s, 이름 : %s, 나이 : %d \n";
		System.out.printf(fmt, userid, passwd, name, age);

		// double vs. float : 오차범위 주의
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;
		System.out.println(avg1);
		System.out.println(avg2);

		// 키보드로 문자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요");
		userid = sc.nextLine();

		System.out.print("비밀번호를 입력하세요");
		passwd = sc.nextLine();

		System.out.print("이름을  입력하세요");
		name = sc.nextLine();

		System.out.print("나이를 입력하세요");
		age = Integer.parseInt(sc.nextLine());

		System.out.printf(fmt, userid, passwd, name, age);

		// 대입연산자 : =, +=, -+, *=, /=
		int x = 5;
		int y = 5;
		int z = x + y;
		z = z + x;
		z = z + y;

		// int z = x + y;
		z += x; // z = z + x;
		z += y; // z = z + y;

		// 증감연산자 : ++, --
		++z; // 전치 z = z + 1;
		--z; // 후치 z = z - 1;

		i = 5;
		j = 5;
		j = ++i;
		System.out.printf("i = 5; j = 5; j = ++i : %f\n", j);

		i = 5;
		j = 5;
		j = i++;
		System.out.printf("i = 5; j = 5; j = i++ : %f\n", j);

		// 삼황 연산자 - ? :
		// (논리식) ? (참 일때 처리) : (거짓 일때 처리)
		double avg = 296 / 3.0;
		// char grd = (avg >= 90) ? '수' : '우';
		// char grd = (avg <= 100 && avg >= 90) ? '수' : '우';
		char grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';
		System.out.println(grd);

		// 연산자 우선순위
		// 표현식의 계산순서를 결정
		// z = x + y * 2;
		// z = (x + y) * z;
		int k1 = 1, l = 2, m = 3;
		int n = k1 + l * m;
		int o = (k1 + l) * m;
		System.out.println(n);
		System.out.println(m);

		// 형 변환
		// 이미 선언된 변수의 자료형은
		// 형변환 연선자인 ()를 이용하여
		// 명시적으로 변환이 가능
		double avg3 = 296 / 3;
		System.out.printf("296 / 3 = %f \n", avg3); // 정수를 정수로 나누면 문제

		avg3 = (double) 296 / 3;
		System.out.printf("296 / 3 = %f \n", avg3);

		// 정수연산의 기본 단위 : int
		byte p = 10;
		byte q = 10;
		p = (byte) (p + 10);
		p = (byte) (p + q);

		// 확대 변환 (자동으로 바뀜)
		int s = p; // byte -> int

		// 축소 변환 (명시적으로 기술)
		// 데이터 소실의 위험성 감수
		s = 130;
		p = (byte) s;
		System.out.println(p); // underflow가 되다.

	}
}
