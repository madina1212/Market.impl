package enums;

public enum Product {
    BREAD(25, 0.1),
    BANANA(35, 0.2),
    MILK(80, 0.3),
    GRAPES(220, 0.4),
    TOMATO(150, 0.6),
    ORANGE(320, 0.9),
    CAKE(450, 0.12),
    SALAD(540, 0.15),
    SALT(45, .02),
    SUGAR(125, 0.5),
    SHAMPOO(350, 0.6),
    SOAP(75, 0.3),
    FLOUR(3000, 0.20);

    private int price;
    private double sale;

    Product(int price, double sale) {
        this.price = price;
        this.sale = sale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
