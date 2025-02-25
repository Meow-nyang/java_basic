package basic.loop;

public class LoopNesting2 {

    public static void main(String[] args) {
        /*

         *
         **
         ***
         ****
         *****

         */

        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
             *
            **
           ***
          ****
         *****
         */

        for (int i=1; i<=5; i++){
            // 별 찍기 전에 공백부터 만드는 for 문
            for (int k=4; k >= i; k--){
                System.out.print(" ");
            }

            // 별 찍는 for 문
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *****
         ****
          ***
           **
            *
         */

        for (int i=1; i<=5; i++){
            // 별 찍기 전에 공백부터 만드는 for 문
            for (int k=0; k < i-1; k++){
                System.out.print(" ");
            }

            // 별 찍는 for 문
            for (int j=5; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
