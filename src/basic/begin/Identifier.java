package basic.begin;

import java.util.logging.XMLFormatter;

public class Identifier {

    public static void main(String[] args) {

        // 1. 식별자는 대/소문자를 철저하게 구분함!
        int age = 35;
        int Age = 40;

        // 2. 식별자는 숫자로만 이루어지거나 숫자로 시작 X
//        int 700 = 365; X
        int number7 = 7;
        int num7ber = 7;
        // 3. 식별자에 공백 X
//        int my birth day (X)
        int myBirthDay = 1999; // camel case 표기법

        // 4. 식별자 특수기호는 언더바 ( _ ) , 달러기호 ( $ ) 뿐.
        // 사용 권장은 되지 않음.
        String $hello_ = "안녕";

        // 5. 키워드 (예약어)는 식별자로 사용할 수 없음
        // 키워드란 이미 어떠한 기능을 내포하고 있는 단어.
        //String class = "8반";
        String Class = "8반"; // 대문자를 넣으면 되지만 권장 X

        // 6. 한글이나 한자 같은 식별자도 권장 X
        //int 숫자 = 10;
        //int sagwa = 20;

    }

}
