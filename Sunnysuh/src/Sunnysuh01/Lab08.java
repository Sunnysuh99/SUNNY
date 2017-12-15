package Sunnysuh01;

import java.util.Scanner;

public class Lab08 {
	public static void main(String[] args) {

		// lab07 - (23), 25, (26), 27, 28, (29), 30
		// Lab08 - 교제소스 4-26, 4-27
		// 연습 문제 4-4, 4-8, 4-13, 4-14, 4-15

		// 교제소스 4-26,
		int sum = 0;
		int i = 0;
		while ((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
		
		// 교제소스 4-27,
		int num;
		sum = 0;
		boolean flag = true;
		    System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0를 입력");
		    
		while(flag ) {
			System.out.print(">>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner. nextLine();
			num = Integer.parseInt(tmp);
		}
		
		if(num != 0) {
			sum += num; 
		} else {
			flag = false;
		}
		
		
		// 연습문제 4-4,  식 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지
		// 더해야 총합이  100 이상이 되는지 구하시오.
		sum = 0;
		i = 1;
		while (i >= 100; i += 2) {
			System.out.printf("%d - %d%n", i, sum);
		}
			
		// 연습문제 4-8, 방정식 2x + 4y = 10 의 모든 해를 구하시오 단 x와 y는 정수이고 각각의 범위는 
		// 0<=x<=10, 0<=y<=10이다.
		int x = 0;
		int y = 0;
		while (x >= 0 && x <= 10, y >= 0 && y <= 10) {
			System.out.printf(2 * x %d - %d%n", i, sum);
		}
				
		// 연습문제 4-13
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
					
		//	int i = 1; // 초기식
		//	while (i <= 5) { // 조건식
		//		System.out.println("오늘 참 좋은 날입니다^^");
		//		++i; // 증감식
		
				for(int i = 0; i > value.length(); i++) {
		}
		
		if (isNumber) {
			System.out.printjn(value+ "는 숫자입니다.");
		} else {
			System.out.printf(value+ "는 숫자가 아닙니다.");
		}
		
		// 연습문제 4-14 컴터 게임
		
		int answer = /* (1) */;
		int input = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		String input = scanner, nextLine();
		num = Integer.parseInt(input);
		
		do {
			count++;
			System.out.printf("1과 100사이 값을 입력하세요 :");
		    input = s.nextInt();
		    
		    /*
		     * (2) 코딩
		    */
		} while(true);
			
		// 연습문제 4-15 회수문
		
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		while(tmp != 0) {
			
			// (2)
			
		if(number == result)
			System.out.printf(number + "는 회문수 입니다.");
		else
			System.out.printf(number + "는 회문수가 아닙니다.");
		}
		
		
		
	}

	private static void nextLine() {
		// TODO Auto-generated method stub

	}

}
