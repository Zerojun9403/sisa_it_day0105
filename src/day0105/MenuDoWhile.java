package day0105;
import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;     // 검색 대상 값
        int menu;        // 메뉴 선택 번호

        do {
            System.out.println("<<메뉴>>");
            System.out.println("1.검색 2.증가 3.감소 4.종료");
            System.out.print("번호==> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("#검색결과:" + num);
                    break;

                case 2:
                    num++;
                    System.out.println("#1증가하였습니다.");
                    break;

                case 3:
                    num--;
                    System.out.println("#1감소하였습니다.");
                    break;

                case 4:
                    // 종료 → 아무 출력 없음
                    break;

                default:
                    System.out.println("잘못된 번호입니다.");
            }

            System.out.println(); // 줄바꿈

        } while (menu != 4);

        System.out.println("-- END --");

        sc.close();
    }
}
