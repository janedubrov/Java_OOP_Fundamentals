package lambda;

public enum Car {
    TESLA(80, true),
    BMW(60, false),
    AUDI(55, false),
    TOYOTA(30, false),
    FERRARI(250, false);

    private int price;
    private boolean isElectric;

    Car(int price, boolean isElectric) {
        this.price = price;
        this.isElectric = isElectric;
    }

    public int getPrice() {
        return price;
    }

    public boolean isElectric() {
        return isElectric;
    }
}


