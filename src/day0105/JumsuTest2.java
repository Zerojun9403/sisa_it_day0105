package day0105;

public class JumsuTest2 {

	public static void main(String[] args) {
		
		
		
		/*
		 * class JumsuTest2 {
		 *  => Java 클래스
		 *   
		 *  public static void main(String[]args) {} 
		 *    ==> Java 클래스
		 *    ==> Java Application (독립적으로 실행할 수 있는 자바 클래스)
		 *   
		 *  class.My{}
		 *   ==> My.java (소스코드)
		 *   ==> My.class (바이트코드 파일)
		 *   
		 *  My my = new My( );
		 *   ==> My클래스 객체생성 = 메모리 할당
		 *   ==> 메모리 할당된 객체 My클래스를 My 인스턴스라고 지칭함. 
		 *   
		 *   object(객체)
		 *    ==> 포괄적인 개념으로 메모리상의 여려클래스를 표현(A,B,My클래스등)
		 *   
		 */		
		
				
//		  jumsu (가정:0~100의 정수값)
//		  -------------------
//		   90~100     A학점
//		   80~89      B학점
//		   70~79      C학점
//		   60~69      D학점
//		   0~59       F학점
		
		int jumsu1 = 85;
		
		if (jumsu1 >= 90) {
		    System.out.println("A학점입니다.");
		} else if (jumsu1 >= 80) {
		    System.out.println("B학점입니다.");
		} else if (jumsu1 >= 70) {
		    System.out.println("C학점입니다.");
		} else if (jumsu1 >= 60) {
		    System.out.println("D학점입니다.");
		} else {
		    System.out.println("F학점입니다.");
		}

	}

}
