package day0105;

public class ForTest {

	public static void main(String[] args) {
		System.out.println("문제 1 ");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("=========================");
		System.out.println("문제 2 ");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println("문제 3 ");
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println("문제 4 ");
		for (int i = 1; i <= 4; i++) {
			System.out.print(i * 3 + " ");
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println("문제 5 ");
		System.out.print("[");
		for (int i = 1; i <= 4; i++) {
		    System.out.print(i * 5);
		    if (i < 4) {
		        System.out.print(", ");
		    }
		}
		System.out.print("]");
	}

}
