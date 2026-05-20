package composition.hospital;

public class Hospital {
    private String name;
    private int totalWards;
    private Ward[] wards;
    private int index;

    public Hospital(String name, int totalWards) {
        this.name = name;
        this.totalWards = totalWards;
    }

    public void addWard(Ward ward) {
        if (this.wards == null) {
            this.wards = new Ward[this.totalWards];

        }
        if (this.index < this.wards.length) {
            this.wards[index] = ward;
            index++;
        } else {
            System.out.println("All wards are full");
        }
    }

    @Override
    public String toString() {
        String hospitalString = "";
        hospitalString += "***************\n";
        hospitalString += "\tHospital";
        hospitalString += "\n***************\n";
        hospitalString += "\t" + name;
        hospitalString += "\nTotal wards: " + totalWards;
        hospitalString += "\n***************";

        for (int i = 0; i < index; i++) {
            hospitalString += this.wards[i].toString();

                    }
        return hospitalString;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTotalWards() {
        return totalWards;
    }
    public void setTotalWards(int totalWards) {
        this.totalWards = totalWards;
    }
}
