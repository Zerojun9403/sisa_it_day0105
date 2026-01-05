package day0105;

public class JumsuTest {
	public static void main(String[] args) {
		int jumsu = 85;
		char grade;
//  switch (비교 기준데이터 => 정수, 문자, 문자열) {
//		case 비교할 데이터1 : 실행할 문장 1;
//		case 비교할 데이터2 : 실행할 문장 2;
//		}

		switch (jumsu / 10) {
		case 10: //  서로 다른 케이스의 실행할 문장들이 같다면 
		case 9:  // 공통으로 실행할 문장을 아래 케이스에만 정의한다!! 
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println(grade + "학점입니다!!");
	}

}
