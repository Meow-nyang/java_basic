package basic.loop;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        int total = 0;
        for (int j=1; j<=10; j++) {
            total += j;
        }

        // 1 ~ 200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력
        for (int i = 0; i <= 200; i++) {
            if (i % 6 == 0 && i % 12 != 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n=================================");

        // 정수를 하나 입력받아서
        // 입력받은 정수까지의 팩토리얼 값을 구하세요.

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int k = sc.nextInt();
        int result = 1;

        for (; k > 1; k--) {
            result *= k;

        }
        System.out.println(result);

        sc.close();

        
    }

}
