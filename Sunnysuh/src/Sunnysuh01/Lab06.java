package Sunnysuh01;

import java.util.Scanner;

public class Lab06 {
	public static void main(String[] args) {

		// #21
		// 결혼여부  isMarried = "Y", "N"
		// 결혼여부  isMarried = true, false
		// 결혼여부  isMarried = 0, 1
		// 
		Scanner scanner = new Scanner(System.in);
		System.out.println("결혼 하셨어요? (미혼:0, 기혼:1)==>");
		
		System.out.println("연봉을 입력하세요)==>");
		int salary = sc.nextInt();
		int tax = 0; {			
		if (isMarried == 0)
			if(salary < 3000)
				tax = (int)(salary * 0.1);
			else
				tax = (int)(salary * 0.25);
		} else if (isMarried == 1) {
		}
		
		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);
		
	}
}
