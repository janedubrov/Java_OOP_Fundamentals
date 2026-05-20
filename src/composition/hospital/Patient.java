package composition.hospital;

public class Patient {
    private String name;
    private int id;
    private String diagnosis;

    public Patient(String name, int id, String diagnosis) {
        this.name = name;
        this.id = id;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        String patientString = "";
        patientString += "\nPatient ID: " + id;
        patientString += "\nName: " + name;
        patientString += "\nDiagnosis: " + diagnosis;

        return patientString;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
