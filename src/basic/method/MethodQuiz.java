package basic.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"chicken", "pasta", "beef"};

    // 배열 내부 한눈에 보기
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // foods 배열에서 특정 데이터의 인덱스를 반환
    // 메서드 이름: indexOf, 매개변수: 음식이름(String)
    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        System.out.println();
        return -1;

    }


    // 특정 요소가 배열에 포함되어 있는지의 여부를 확인하는 메서드를 작성하세요.
    // static boolean isInclude(String searchTarget)

    static boolean isInclude(String searchTarget) {
//        int idx = indexOf(searchTarget);
//        if(idx == -1) return false;
//        else return true;
        return indexOf(searchTarget) != -1;

        /* 내가 작성한 코드, 위에 동일한게 있어서 인덱스를 사용함
        for (int i = 0; i < foods.length; i++) {
            if(searchTarget.equals(foods[i])){
                System.out.println("포함되어 있음");
                System.out.println("인덱스 : " + i + "번");
                return true;
            }
        }
        System.out.println("포함되어 있지 않음");
        return false;
        */

    }



    // foods 배열에 데이터를 끝에 추가하는 메서드를 작성하세요.
    // static void push(String newFood)

    static void push(String newFood){
        String[] temp = copy(1);
        temp[temp.length-1] = newFood;
        foods = temp; temp = null;
        
    }
    // 원본 배열의 값을 새 배열로 복사하는 메서드
    static String[] copy(int size) {
        // 원본 배열의 값을 복사하는 행위는 새 배열을 만들어서 진행하는 것이기 때문에
        // copy 해서 새 배열을 만드는 것을 대신 해 주자.
        String[] temp = makeNewArray(size);

        // 반복문의 횟수를 size 로 판단해서 상황에 따라 다르게 지정.
        // size 가 0보다 작다? -> temp가 foods보다 더 작다 -> 끝범위는 temp.length
        // size 가 0보다 크다? -> temp가 foods보다 더 크다 -> 끝범위는 foods.length
        int loopCount = size >= 0 ? foods.length : temp.length;
        for (int i = 0; i < loopCount; i++) {
            temp[i] = foods[i];
        }
        return temp;
    }


    // 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
    // static boolean isOutOfBounds(int targetIndex)
    // 작성이 완료되면 타 메서드에서 활용할 수 있을 것입니다.

    static boolean isOutOfBounds(int targetIndex){
        return targetIndex > foods.length -1 || targetIndex < 0;
//        if (targetIndex < 0 || targetIndex >= foods.length){
//            return true;
//        }
//        return false;
    }
    

    // 원하는 인덱스 위치에 요소를 삽입하는 메서드를 작성하세요.
    // static void insert(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.

    static void insert(int targetIndex, String newFoodName){
        if (isOutOfBounds(targetIndex)) return;

        String[] temp = copy(1);

        for (int i = foods.length; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }
        temp[targetIndex] = newFoodName;
        foods = temp; temp = null;


    }

    // 기존 배열 대비 크기가 다른 새 배열을 리턴해주는 메서든 (temp 만드는 것 메서드화)
    // size에 따라 크기가 큰 or 작은 배열을 리턴.
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }


    // 원하는 인덱스 위치의 요소를 수정하는 메서드를 작성하세요.
    // void modify(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.

    static void modify(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) return;
        foods[targetIndex] = newFoodName;
    }

    // 특정 인덱스의 요소를 삭제하는 메서드를 작성하세요.
    // void remove(String deleteTarget)

    static void remove(String deleteTarget) {
        int index = indexOf(deleteTarget);
        if (index == -1) return;

        // copy 를 호출하기 전에 지우고자 하는 위치를 기준으로
        // 뒤에 있는 값을 한 칸씩 앞으로 땡겨야 한다.
        for (int i = index; i < foods.length-1; i++) {
            foods[i] = foods[i+1];
        }

        String[] temp = copy(-1);
        foods = temp;
    }


    // 배열 내부를 깔끔하게 비워버리는 메서드를 작성하세요. (삭제 반복 x)
    // void clear()
    static  void clear() {
        foods = new String[0];
//        foods = new String[] {};

    }



    public static void main(String[] args) {

        printFoods();
        int idx = indexOf("apple");
        System.out.println("idx = " + idx);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("검색할 이름을 입력 : ");
//        String name = sc.next();

        boolean flag = isInclude("pasta");
        System.out.println("flag = " + flag);

        push("pork");
        push("apple");
        printFoods();

        boolean result = isOutOfBounds(3);
        System.out.println(result);

        insert(2,"ice");
        printFoods();

        modify(1,"burger");
        printFoods();

        remove("beef");
        printFoods();

        clear();
        printFoods();

        push("banana");
        printFoods();



    }

}