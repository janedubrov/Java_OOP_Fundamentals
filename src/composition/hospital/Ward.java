package composition.hospital;

public class Ward {
    private String wardName;
    private Patient[] patients;
    private Doctor[] doctors;
    private int capacity;
    private int index;
    private int totalDoctors;
    private int docIndex;

    public Ward(String wardName, int capacity,int totalDoctors) {
        this.wardName = wardName;
        this.capacity = capacity;
        this.totalDoctors = totalDoctors;
    }

    public void addPatient(Patient patient) {
        if(this.patients == null) {
            this.patients = new Patient[capacity];

        } if(this.index < this.patients.length) {
            this.patients[index] = patient;
            index++;
        }
        else {
            System.out.println("This ward is full");
        }
    }

    public void addDoctor(Doctor doctor) {
        if(this.doctors == null) {
            this.doctors = new Doctor[totalDoctors];

        } if(this.docIndex < this.doctors.length) {
            this.doctors[docIndex] = doctor;
            docIndex++;
        }
    }

    @Override
    public String toString() {
        String wardString = "";
        wardString += "\n---------------";
        wardString += "\nWard: " + wardName;
        wardString += "\ncapacity: " + capacity;
        wardString += "\nTotal doctors: " + totalDoctors;
        wardString += "\n---------------";



        for(int i = 0; i < index; i++) {
            wardString += this.patients[i].toString();
        }

        for(int i = 0; i < docIndex; i++) {
            wardString += this.doctors[i].toString();
        }

        return wardString;
    }

    public String getWardName() {
        return wardName;
    }
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTotalDoctors() {
        return totalDoctors;
    }
    public void setTotalDoctors(int totalDoctors) {
        this.totalDoctors = totalDoctors;
    }

}
