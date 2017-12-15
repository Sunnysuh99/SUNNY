package Sunnysuh01;

public class Arrays {
	public static void main(String[] args) {

	// 배열 - 동일한자료형 데ㅣ터들의 묵음
		String name1, name2, name3;
	
		// 배열 선언
		// 자료형[] 변수명;
		String[] names;
		
		// 배열을 초기화
		// 변수명 = new 자료형[크기];
		names = new String[3];
		
		// 배열  다루기
		// 변수명[위치값];
		names[0] = "혜리";
		names[1] = "지연";
		names[2] = "혜은";
					
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		for(int i = 0; i < names.length; ++i) {
			System.out.println(names[i]);
			
		int[] kor;
		kor = new int[3];
		
		kor[0] = 99;
		kor[1] = 98;
		kor[2] = 90;
		}
		for (int i1 = 0; i1 < kor.length; ++i1) {
				System.out.println(kor[i1]);
		}
		
		// 배열은 참조형이다???
		System.out.println([names]);
		System.out.println([kor]);
		
		// 배열요소의 값은 자동으로 초기화된다.
		String[] a = new String[1];
		int[] b = new int[1];
		char[] c = new char[1];
		double[] d = new double[1];
		boolean[] e = new boolean[1];
		
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(e[0]);
		
		// 배열의 길이는 : 배열변수, lenth
		// names.length = 10; 상수이므로 변경불가,
		
		// 배열 선언과 동시에 초기화 
		int[] f = {99, 77, 65}
		
		for(int i = 0; i < f.length; ++i) {
		System.out.println(f[i]);
		
		
		
		
	}
}
