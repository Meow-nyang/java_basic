package oop.poly.player;

public class Main {

    public static void main(String[] args) {

        Warrior w1 = new Warrior("전사1");
        Warrior w2 = new Warrior("전사2");
        Mage m1 = new Mage("마법사1");
        Mage m2 = new Mage("마법사2");
        Hunter h1 = new Hunter("사냥꾼1", "멍멍이");
        Hunter h2 = new Hunter("사냥꾼2", "야옹이");

        m2.blizard(w1, w2, m1);  // 세 개를 하나의 변수로 받아야 함

        System.out.println("-------------------------------");
        h1.magicArrow(w1);
        System.out.println("-------------------------------");
        h1.magicArrow(m1);
        System.out.println("-------------------------------");
        h1.magicArrow(h2);
    }


}
