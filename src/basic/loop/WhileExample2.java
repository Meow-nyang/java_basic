package basic.loop;

public class WhileExample2 {

    public static void main(String[] args) {

        // 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
/*
        int i = 48;
        while (i <= 150){
            System.out.print(i + " ");
            i += 8;
        }

 */
        int j = 48;
        while (j <= 150) {
            if (j % 8 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }

        System.out.println(); // 단순 줄 개행

        // 1 ~ 100 까지 정수 중 4의 배수이면서
        // 8의 배수는 아닌 수를 가로로 출력해 보세요.

        int i = 1;
        while (i <= 100) {
            if (i % 4 == 0 && 8 != 0){
                System.out.print(i + " ");
            }

            i ++;

        }

        System.out.println(); // 단순 줄 개행

        // 1 ~ 30000 까지의 정수 중 258의 정수의 갯수를 출력.
        int n = 1;
        int cnt = 0;
        while (n <= 30000) {
            if (n % 258 == 0){
                cnt++;
            }
            n++;
        }
        System.out.println("count = " + cnt);


        System.out.println(); // 단순 줄 개행

        // 1000의 약수의 갯수를 출력하세요.
        int k = 1;
        int count = 0;
        while (k <= 1000){
            if (1000 % k == 0){
                count++;
            }
            k ++;
        }
        System.out.println("약수의 갯수는 : " + count);



    }

}
