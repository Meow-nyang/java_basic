package oop.poly.player;

public class Hunter extends Player {

    String pet;

    public Hunter(String nickName, String pet) {
        super(nickName);
        this.pet = pet;

    }

    public void magicArrow(Player p) {
        System.out.printf("%s님이 %s님에게 매직 에로우를 시전했습니다!\n", this.nickName, p.nickName);
        //int damage; String jop;
        if (p instanceof Warrior) {

            System.out.printf("%s님(전사) 10의 피해를 입었습니다.\n", p.nickName);
            p.hp -= 10;
            System.out.printf("%s님의 남은 체력 : %d\n",p.nickName, p.hp);
        } else if (p instanceof Mage) {
            System.out.printf("%s님(마법사) 20의 피해를 입었습니다.\n", p.nickName);
            p.hp -= 20;
            System.out.printf("%s님의 남은 체력 : %d\n",p.nickName, p.hp);
        } else if (p instanceof Hunter) {
            System.out.printf("%s님(사냥꾼) 15의 피해를 입었습니다.\n", p.nickName);
            p.hp -= 15;
            System.out.printf("%s님의 남은 체력 : %d\n",p.nickName, p.hp);
        }

    }


}
