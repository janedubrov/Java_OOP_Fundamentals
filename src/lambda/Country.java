package lambda;

public enum Country {
    GERMANY(84, "Europe"),
    FRANCE(68, "Europe"),
    JAPAN(125, "Asia"),
    USA(331, "America"),
    BRAZIL(215, "America");

    private int population;
    private String continent;

    Country(int population, String continent) {
        this.population = population;
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }


}
