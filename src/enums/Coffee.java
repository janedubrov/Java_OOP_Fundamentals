package enums;

public enum Coffee {
    ESPRESSO(200, false),
    LATTE(350, true),
    CAPUCCINO(300, true),
    AMERICANO(250, false);

    private int priceInCents;
    private boolean isMilkAdded;

    Coffee (int priceInCents, boolean isMilkAdded) {
        this.priceInCents = priceInCents;
        this.isMilkAdded = isMilkAdded;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public boolean isMilkAdded() {
        return isMilkAdded;
    }

}
