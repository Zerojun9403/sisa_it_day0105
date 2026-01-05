package day0105;

public class LoopTest2 {

	public static void main(String[] args) {
		// whlie 문을 사용하여 숫자 1에서 숫자 5까지 화면에 출력하시오

		int i = 1;

		while (i<=5) {
			System.out.println(i);
			i++; // 후위 연산자로 해당 증감식 없으면 무한루프!!!!!
//
//			if (i <= 5) {
//				continue; // while 내의 continue 제어문은 조건식으로 분기
//							// for내의 continue 증감자로 분기
//			} else {
//				break; //break를 감싸는 가장 가까운 반복문 또는 switch문을 벗어나는 역할
//			}
		}

	}

}
