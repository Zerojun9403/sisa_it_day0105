package day0105;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("=========================");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=========================");

		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=========================");
		
		for (int i = 1; i <= 4; i++) {
			System.out.print(i * 3 + " ");
		}
		System.out.println();
		System.out.println("=========================");

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
