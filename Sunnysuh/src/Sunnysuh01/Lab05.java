package Sunnysuh01;

import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {

		// 계절
		System.out.println("지금은 몇 월입니까?==>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
		case 12:
		case 1:
		case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		}

		// 가위, 바위, 보
		System.out.println("가위(1), 바위(2), 보(3)를 입력하세요==>");
		Scanner scanner1 = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		System.out.println("귀하는" + user + "입니다.");
		System.out.println("컴은   " + com + "입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("저런! 패하셨어요, 화이팅 하십시오!^^");
			break;
		case 1:
			System.out.println("이기셨습니다, 축하 드립니다");
			break;

		case 0:
			System.out.println("비기셨습니다. 다시 한번 더 하실까요?");
			break;
		}

		// 가위, 바위, 보
		System.out.println("가위(1), 바위(2), 보(3)를 입력하세요==>");
		Scanner scanner1 = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		System.out.println("귀하는" + user + "입니다.");
		System.out.println("컴은   " + com + "입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("저런! 패하셨어요, 화이팅 하십시오!^^");
			break;
		case 1:
			System.out.println("이기셨습니다, 축하 드립니다");
			break;

		case 0:
			System.out.println("비기셨습니다. 다시 한번 더 하실까요?");
			break;
		}

	}
}
