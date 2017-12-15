package Sunnysuh01;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab07 {
	public static void main(String[] args) throws IOException {

		// #22 윤년
		// 현재 년도 400 나누어 떨어지거나, 4로 떨어지지만,
		// 100으로 나누어 떨어지 않음

		GregorianCalendar gc = new GregorianCalendar();

		String welcome = "학인하고싶은 '윤년'을 입력하세요";
		String fmt1 = "%d는 윤년입니다.\n";
		String fmt2 = "%d는 윤년이 아닙니다.\n";
		// int year = 2000;

		Scanner sc = new Scanner(System.in);
		System.out.printf(welcome);
		int year = sc.nextInt();

		if (gc.isLeapYear(year))
			System.out.printf(fmt1, year);
		else
			System.out.printf(fmt2, year);

		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
			System.out.printf(fmt1, year);
		else
			System.out.printf(fmt2, year);

		// #23 - 복권 발행 PGM
		// 특정범위를 포함하는 난수 생성
		// 정수, 난수 값에 ((마지막 값 - 시작 값) + 1) + 시작 값
		// 복권 범위 : 100 - 999
		// lotto : 657, luck : 452 = 1자리 일치
		// lotto : 657, luck : 666 = 1자리 일치
		// lotto : 657, luck : 737 = 0자리 일치
		// lotto : 657, luck : 726 = 2자리 일치
		// cat @으로 숫자 봅아냄

		int rand = (int) (Math.random() * 100);
		int lotto = rand % ((999 - 100) + 1) + 100;
		System.out.println(lotto);
		
		String lucky = sc.nextLine();
		
		// 문자 하나씩 추출
		char lucky1 = lucky.charAt(0);
		char lucky2 = lucky.charAt(1);
		char lucky3 = lucky.charAt(2);
		
		char lotto1 = ("" + lotto),charAt(0);
		char lotto2 = ("" + lotto),charAt(1);
		char lotto3 = ("" + lotto),charAt(2);
		
		
		// 비교
		String lotto4 = "" + lotto;
		int size = lotto4.length();
		
		for(int i = 0; i < size; ++i)
			for(int j = 0; j < size; ++j)
			if (lucky.charAt(i) == lotto4.charAt(j)) ++ match;
		System.out.println(lotto);

		// 비교 1
		// int match = 0;
		// if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3) ++ match;
		// if (lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3) ++ match;
		// if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3) ++ match;
		// System.out.println(lotto);
		
		String msg = "꽝입니다, 다음 기회에...";
		switch (match) {
		case 3: msg = "모두 일치! 상금 일억원입니다"; break; 
		case 2: msg = "2개 일치! 상금 일천만입니다"; break; 
		case 1: msg = "1개 일치! 상금 오백원입니다"; break; 
		}	
			System.out.println(msg);
		
		
		
		// #25 - 문자와 숫자 변환
		// 소문자 a : 97, 대문자 A : 65
		System.out.println("알파벳 소문자를 대문자로 바꿔드립니다");
		System.out.println("알파벳 소문자를 한 글자를 입력해주세요");
		int ch = System.in.read();
		// 소뮨자(a:97, z:122) 이외의 값이 입력되면 경고메시지 출력
		if (ch < 97 && ch > 122)
			System.out.println("잘못 입력하셨어요.");
		else {
			// 소문자 대문자로 변환
			// 입력한 문자에서 -32만큼 뺀ㄷ다.
			ch = ch - 32;
			System.out.println((char) ch);
		}

		// #26 - 숫자 맞추기
		int num2 = (int)(Math.random() * 100) + 1; // 정수 만들기
		sc = new Scanner(System.in); // 키보드로부터 데이터를 입력받을 즌비를 함)
		while (true) {
		int num1 = sc.nextInt();  // 정수를 입력받음
		
		if (num1 > num2)
		    System.out.println("추측하신 숫자가 큽니다");
		else if (num1 < num2)
			System.out.println("추측하신 숫자가 작습니다");
		else if (num1 == num2)
			System.out.println("와, 숫자를 맞추셨어요 O");
	        break;	
		
		
		// #27 - sum = number = 0
		int number = 0;
		int sum = 0;
		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;
		}
		fmt2 = "num : %d, sum : %d \n";
		System.out.printf(fmt2, number, sum);

		// #28 - sum = number = 0
		number = 0;
		sum = 0;
		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
			// System.out.printf(number, sum);

		}

		// #30 - 구구단 차트 Multiplication Table

		String fmt = "\t   Multiplication Table \n";
		fmt += "        1   2   3   4   5   6   7   8   9 \n";
		fmt += "----------------------------------------- \n";
		fmt += "1 |     1   2   3   4   5   6   7   8   9 \n";
		fmt += "2 |     2   4   6   8   5   6   7   8   9 \n";
		fmt += "3 |     3   2   3   4   5   6   7   8   9 \n";
		fmt += "4 |     4   2   3   4   5   6   7   8   9 \n";
		fmt += "5 |     5   2   3   4   5   6   7   8   9 \n";
		fmt += "6 |     6   2   3   4   5   6   7   8   9 \n";
		fmt += "7 |     7   2   3   4   5   6   7   8   9 \n";
		fmt += "8 |     8   2   3   4   5   6   7   8   9 \n";
		fmt += "9 |     9   2   3   4   5   6   7   8   9 \n\n";

		System.out.printf(fmt, number, sum);

		fmt = "\t     Multiplication Table \n";
		fmt += "        1   2   3   4   5   6   7   8   9 \n";
		fmt += "----------------------------------------- \n";

		System.out.printf(fmt);
		for (int i = 1; i <= 9; ++i) {
			fmt = "%d  |  3%d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
			System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
		}

		fmt = "\t     Multiplication Table \n";
		fmt += "        1   2   3   4   5   6   7   8   9 \n";
		fmt += "----------------------------------------- \n";
		System.out.printf(fmt);
		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d  |  %3d", i, i);
			for (int j = 2; j <= 9; ++j) {
				System.out.printf("  %2d", i * j);
			}
			System.out.println();
		}

	}

	private static void charAt(int i) {
		// TODO Auto-generated method stub

	}

}
