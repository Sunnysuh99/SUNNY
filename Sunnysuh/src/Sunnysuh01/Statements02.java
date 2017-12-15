package Sunnysuh01;

public class Statements02 {
	public static void main(String[] args) {

		System.out.println("오늘 참 좋은 날입니다^^");
		System.out.println("오늘 참 좋은 날입니다^^");

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");

		// 단순 무식하게 복불 코드로 반복작업을 수행하는 것은 유지보수가 어려움
		// for (초기식, 조건식, 증감식) {반복 실행문(들); 본체 }
		// for (int i = 1; i <= 5; i = i + 1) {
		// for (int i = 1; i <= 5; i += 1) {
		// for (int i = 1; i <= 5; ++i) {
		for (int i = 1; i <= 5; i = i + 1) {
			System.out.println("오늘 참 좋은 날입니다^^");
		}

		// for (int i = 1; i <= 5; i = ++i) {
		// System.out.println("1");
		for (int i = 1; i <= 5; ++i) {
			System.out.println(i);
		}
		// 1-100 전부
		for (int i = 1; i <= 100; ++i) {
			System.out.println(i);
		}
		// 1-100 홀수 case 1 (비효율)
		for (int i = 1; i <= 100; ++i) {
			if (i % 2 != 0)
				System.out.println(i);
		}
		// 1-100 홀수 case 2 (양호)
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		// 1-100 짝수
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}

		// 구구단 출력
		// 5 * 1 = 5
		// 5 * 2 = 10
		String fmt = "%d * %d = %d \n";
		for (int i = 1, j = 5; i <= 9; ++i) {
			System.out.printf(fmt, j, i, j * i);
		}

		// #23 구구단 입력

		// #24 구구단 입력

		// Scanner sc = new Scanner(System.in);
		// System.out.printf(welcome);
		// int gugudan = sc.nextInt();

		String fmt1 = "%2d * %2d = %3d \n";

		// welcome = "출력할 구구단의 단을 입력해주세요 (1-19)";
		// sc = new Scanner(System.in);

		// System.out.println("welcome");
		// int dan = sc.nextInt();

		// for (int i = 1, j = dan; i <= 19; ++i) {
		// System.out.printf(fmt1, j, i, j * i);

		// fmt = "%d * %d = %d \t";

		// 중첩 for문

		// for(int i; i <= 5; ++i) {
		// System.out.println("************");

		// for(int i = 1; i <= 10; ++i) {
		// for(int j = 1; j <= 10; ++j) {
		// System.out.print("*");
		// }
		// System.out.print("\n");

		// 예제: 4-16
		// 직각 삼각형
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		for (int i = 1; i <= 5; ++i) {
			// for (int j = 1; j <= 5; j >= i; -= 1) {
			for (int j = 1; j <= (6 - i); ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
