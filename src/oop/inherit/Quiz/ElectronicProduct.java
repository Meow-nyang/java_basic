package oop.inherit.Quiz;

public class ElectronicProduct {

    String productName;
    double price;
    String manufacturer;

    // 생성자
    public ElectronicProduct(String productName, double price, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }
    // displayInfo 메서드
    public void displayInfo() {
        System.out.printf("%s, 가격 : %.0f원, 제조사 : %s\n"
                , this.productName, this.price, this.manufacturer);

    }


}
