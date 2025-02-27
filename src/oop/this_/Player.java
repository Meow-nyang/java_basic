package oop.this_;

public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    Player() {
        System.out.println("player의 기본 생성자 호출!");
        level = 1;
        hp =50;
    }

    Player(String nickName) {
        System.out.println("player의 2번 생성자 호출!");
        System.out.println("this가 띄는 주소값:" + this);
        this.nickName = nickName;
        level = 1;
        hp = 50;
    }


//    @Override
//    public String toString() {
//        return "Player{" +
//                "nickName='" + nickName + '\'' +
//                ", level=" + level +
//                ", hp=" + hp +
//                '}';
//    }
}
