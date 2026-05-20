package composition.hospital;

public class Ward {
    private String wardName;
    private Patient[] patients;
    private int capacity;
    private int index;

    public Ward(String wardName, int capacity) {
        this.wardName = wardName;
        this.capacity = capacity;
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
    @Override
    public String toString() {
        String wardString = "";
        wardString += "\n---------------";
        wardString += "\nWard: " + wardName;
        wardString += "\ncapacity: " + capacity;
        wardString += "\n---------------";


        for(int i = 0; i < index; i++) {
            wardString += this.patients[i].toString();
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
}
