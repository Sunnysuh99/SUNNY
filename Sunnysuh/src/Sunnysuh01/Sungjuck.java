package Sunnysuh01;

import java.util.Scanner;

public class Sungjuck {
	public static void main(String[] args) {
		/*
		 * 성적 처리프로그램 V1 간단한 성적처리를 수행하는 프로그램 입력 : 이름, 국어, 영어, 수학 처리 : 총점, 평균, 학점 출력 : 이름,
		 * * 국어, 영어, 수학, 총점, 평균, 학점
		 */

		// 변수 선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avrg;
		char grd;

		// 성적 처리
		// 데이터 입력 - 입력자료는 하드코읻
		name = "박성현";
		kor = 90;
		eng = 99;
		mat = 88;
		
		// Scanner 개체 닫기
		sc.close();
		
		// 총점 계산
		tot = kor + eng + mat;

		// avrg = (kor + eng + mat) / 3
		avrg = (kor + eng + mat) / 3;
		
		
		
		//결과 출력
		String fmf = "이름 : %s, 국어 : %s, 영어 : %s, 수학 : %s"
		String fmf = "총점 : %d, 평균 : %.1f, 학점 : %c \r 출력 : 이름,
				 * * 국어, 영어, 수학, 총점, 평균, 학점
		System.out.printf(fmf, name, kor, eng, mat, tot, avrg, grd);
		
		
		// 데이터 입력 - Scanner 사용
        Scanner sc = new Scanner(System.in);
        System.out.printf("성적처리 프로그램");
        System.out.printf("이름을 입력 ");
        System.out.printf("국어점수를 입력 ");
        System.out.printf("영어점수를 입력 ");
        System.out.printf("수학점수를 입력 ");
        System.out.printf("수고 많으셨습니다^^");
        name = sc.nextLine();
        kor = sc.nextLine();
        eng = sc.nextLine();
        mat = sc.nextLine();
        

	}
}
