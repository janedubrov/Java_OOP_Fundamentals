package enums;

public enum Planet {
    MERCURY(57),
    VENUS(108),
    EARTH(150),
    MARS(228);

    private int distance;

    Planet (int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
