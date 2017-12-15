package Sunnysuh01;

public class Statements {
	public static void main(String[] args) {

		// 문장 - 무엇이가를 하라는 지시를 의미
		// 문자이 모야서 프로그램을 구성

		; // 빈 문장도 일단 적법하다

		// 조건문 if : 유효성 검사
		// if (조건식) { 참일 때 실행할 문장 }
		// if (조건식) { 참일 때 } else {거짓일 때}
		// if (조건식1) { 참일 때 }
		// else if (조건식2) { 참일 때 }
		// else if (조건식3) { 참일 때 }
		// else {거짓일 때}

		if (3 > 5) {
		}
		System.out.println("3은 5보다 크다");
		int tot = 99 + 98 + 99;
		if (tot > 269) {
		}
		System.out.println("수");

		// 어떤 수가 2의 배수인 경우 ?
		int x = 13;
		if (x % 2 == 0) {
			System.out.println("2의 배수");
		} else {
			System.out.println("2의 배수가 아님");
		}
		// 범위 검사
		if (x <= 100 && x >= 90)
			System.out.println("수");

		String userId = new String("zzzzz");
		String psswd = new String("9988887");
		if (userId.equals("zzzzz") && psswd.equals("9988887")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		if (userId.equals("zzzzz")) {
		}
		if (psswd.equals("998887")) {
			System.out.println("비밀번호가 다름");

		} else {
			System.out.println("아이디 다름");
		}

		// 문자입력 확인
		char ch = 'a';
		if (ch == 'q' || ch == 'Q') {
			System.out.println("프로그램 종료");
		}

		// 입력한 문자가 알파벳 소문자 여부 확인
		// if (ch == 'a' || ch == 'b') { }
		if (!(ch >= 'a' && ch <= 'z')) { // 부정어 !
			System.out.println("알파벳만 넣어주세요");
		}

		// 입력한 문자가 알파벳 대문자 여부 확인
		// if (ch == 'A' || ch == 'B') { }
		if (!(ch >= 'A' && ch <= 'Z')) {
			System.out.println("알파벳만 넣어주세요");
		}

		// 입력한 문자가 알파벳 수자만 입력 여부 확인
		// if (ch == '0' || ch == '9') { }
		if (!(ch >= 'A' && ch <= 'Z')) {
			System.out.println("숫자만 입력해주세요");
		}

		// 다중 if문 작성
		// int tot = 99 + 98 + 99;
		double avg = (double) tot / 3;
		char grd;
		if (avg >= 90) // if (avg <= 100 && avg >= 90)
			grd = '수';
		else if (avg <= 90 && avg >= 80)
			grd = '우';
		else if (avg <= 80 && avg >= 70)
			grd = '미';
		else if (avg <= 70 && avg >= 60)
			grd = '양';
		else
			grd = '가';
		{
			System.out.println(grd);
		}

		// 애매한 if문
		String grds = "";
		if (avg >= 90)
			if (avg >= 96)
				grds = "A+";
			else
				grds = "A0또는 A-";
		System.out.println(grds);

		if (avg >= 90) { // 중첩 if문
			if (avg >= 96)
				grds = "A+";
		} else
			grds = "A0또는 A-";

		// switch : 연산식의 결과값에 다라 분기
		// 연산식 결과값 유형은 정수, 문자열, 열거형 중 하나이어야 함
		// switch(연산식) {
		// case 값1 : 실행할 코드; break;
		// case 값2 : 실행할 코드; break;
		// case 값3 : 실행할 코드; break;
		// default : 실행할 코드; break;
		// }

		int userLevel = 1;
		switch (userLevel) {
		case 1:
			System.out.println("관리자");
			break;
		case 2:
			System.out.println("사용자");
			break;
		case 3:
			System.out.println("매니져");
			break;
		default:
			System.out.println("비회원");
			break;
		}

		String key = "C";
		switch (key) {
		case "C": // 소대문자 활용
		case "c":
			System.out.println("데이터 생성");
			break;
		case "r":
			System.out.println("조회");
			break;
		case "u":
			System.out.println("수정");
			break;
		case "d":
			System.out.println("삭제");
			break;

		default:
			System.out.println("비회원");
			break;
		}

		// 학점 계산
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		case 5:
			grd = '가';
			break;
		}

		// 난수 생성

		double lucky = Math.random();
		System.out.println(lucky);
		System.out.println(lucky * 10);
		System.out.println(lucky * 100);
		System.out.println((int) lucky * 100);
		System.out.println(((int) lucky * 100) + 1);

		// 과제: Lab04 - 프린트 문제 16-20,
		// Lab05 - 연습문제 4-6,7,8
		// Lab06 - 자바정석 연습문제 3-1,2,3, 4-1

	}
}
