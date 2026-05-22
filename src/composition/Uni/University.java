package composition.Uni;

public class University {
    private String name;
    private int totalFaculties;
    private Faculty[] faculties;
    private int index;

    public University(String name, int totalFaculties) {
        this.name = name;
        this.totalFaculties = totalFaculties;
    }


    public void addFaculty(Faculty faculty) {
        if(this.faculties == null) {
            this.faculties = new Faculty[this.totalFaculties];

        } if(this.index < this.faculties.length) {
            this.faculties[index] = faculty;
            index++;
        }
    }
    @Override
    public String toString() {
        String universityString = "\n********************\n";
        universityString += "\tUNIVERSITY\n";
        universityString += "\n" + name;
        universityString += "\nTotal faculties:" + totalFaculties;
        universityString += "\n********************\n";

        for(int i = 0; i < index; i++) {
            universityString += this.faculties[i].toString();

        }
        return universityString;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTotalFaculties() {
        return totalFaculties;
    }
    public void setTotalFaculties(int totalFaculties) {
        this.totalFaculties = totalFaculties;
    }
}
