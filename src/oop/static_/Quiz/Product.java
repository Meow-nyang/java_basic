package oop.static_.Quiz;

public class Product {

    String productName;
    int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }


    public void sellProduct() {
        Store.addSale(this.price);

    }

}
