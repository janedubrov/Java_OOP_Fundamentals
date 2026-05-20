package composition.hospital;

public class Doctor {
    private String name;
    private int id;
    private String specialization;

    public Doctor(String name, int id, String specialization) {
        this.name = name;
        this.id = id;
        this.specialization = specialization;
    }

    public String toString() {
        String doctorString = "";
        doctorString += "\n---------------";
        doctorString += "\nDoctor: " + name;
        doctorString += "\nSpecialization: " + specialization;
        doctorString += "\nDoc ID: " + id;
        doctorString += "\n---------------";
        return doctorString;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
