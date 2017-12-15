package Sunnysuh01;

import java.util.Scanner;

public class Statements03 {
	public static void main(String[] args) {

		// 반복문 - wile 문

		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			System.out.println("오늘 참 좋은 날입니다^^");
			++i; // 증감식
		}

		// 무한루프

		// while (true) {
		// System.out.println("오늘 참 좋은 날입니다^^");
		// ++i;
		// }

		// 구구단
		// String fmt = "%d * %d = %d \n";
		// int dan = 5;
		// i = 1;
		// while (i <= 9) { // 조건식
		// System.out.printf(fmt, dan, i, dan * i);
		// +=i
		// }

		// 한번도 실행 안된다고요?
		i = 9;
		while (i > 10) {
			System.out.printf("while : 잘 보여요?");
		}

		// 하지만 이건 달라요
		i = 9;
		do {
			System.out.printf("do while : 잘 보여요?");
		} while (i > 10);

		// 별을 헤는 밤
		// ******
		// ******

		i = 1;
		int j = 1;
		while (i <= 5) {
			while (j <= 5) {
				System.out.printf("*");
				++j;
			}
			++i;
			j = 1;
			System.out.print("\n");
		}

		// *****
		i = 1;
		j = 1;
		while (i <= 5) {
			while (j <= i) {
				System.out.printf("*");
				++j;
			}
			++i;
			j = 1;
			System.out.print("\n");
		}

		// ******

		i = 1;
		j = 5;
		while (i <= 5) {
			while (j >= i) {
				System.out.printf("*");
				--j;
			}
			++i;
			j = 5;
			System.out.print("\n");
		}

		// *****
		i = 1;
		j = 1;
		while (i++ <= 5) {
			while (j <= i) {
				System.out.printf("*");
				++j;
			}
			j = 1;
			System.out.print("\n");
		}

		// ******

		i = 1;
		j = 5;
		while (i++ <= 5) {
			while (j >= i) {
				System.out.printf("*");
				--j;
			}
			j = 5;
			System.out.print("\n");
		}

		// 반복의 중단 - break
		i = 1;
		int sum = 0;
		String fmt = "i : %d, sum : %d \n";
		while (true) {
			if (sum >= 100)
				break;
			System.out.println(fmt, i);

			sum += i;
			++i;

			// 반복의 재시작 - continue
			++i;
			i = 1;
			while (i <= 100) {
				++i;
			}
			if (i % 2 != 0)
				continue;
			System.out.println(i);
		}

		// while의 다른 용도 (실행문 무한 작업 : 은행 자판기)

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("작업하실 코드를 입력하세요 \n");
			System.out.println("c)reate : 회원 등록 \n");
			System.out.println("r)ear : 회원 조회 \n");
			System.out.println("u)p date : 회원 수정 \n");
			System.out.println("d)reat : 회원 삭제 \n");
			System.out.println("q)uit : 종료");
			System.out.print(">>>>>>> ");

			String job = sc.nextLine();

			// q가 입력되면 나갑니다
			// if (job.equals("q") break;
			switch (job) {
			case "c":
				System.out.println("<회원등록 메뉴 선택");
				break;
			case "r":
				break;
			case "u":
				break;
			case "d":
				break;
			case "q":
				System.e
				xit(0);
				break;

			}

		}

	}
}
