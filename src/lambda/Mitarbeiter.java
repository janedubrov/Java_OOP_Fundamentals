package lambda;

public class Mitarbeiter {


        private String name;
        private String abteilung;
        private double gehalt;

    public String getName() {
        return name;
    }
    public String getAbteilung() {
        return abteilung;
    }
    public double getGehalt() {
        return gehalt;
    }

    public Mitarbeiter(String name,String abteilung,double gehalt) {
        this.name = name;
        this.abteilung = abteilung;
        this.gehalt = gehalt;
    }

    @Override
        public String toString() {
        String mitarbeiterString = "";
        mitarbeiterString += name + "(" + abteilung + ")" + " - " + gehalt + " Euro";
        return mitarbeiterString;

    }

}
