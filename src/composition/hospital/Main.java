package composition.hospital;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Charite", 140);

        Ward ward01 = new Ward("Cardiology", 15, 2);
        Ward ward02 = new Ward("Orthopaedics", 25, 2);

        Patient pat001 = new Patient("Jonh Selly", 2884, "Heart problems", 14);
        Patient pat002 = new Patient("Bob Salmon", 9815, "Headache", 5);

        Doctor doc01 = new Doctor("Dr. Martin Holl" , 154, "Cardiologist");
        Doctor  doc02 = new Doctor("Dr.Anna Bum", 25, "Pediatrician");

        hospital.addWard(ward01);
        hospital.addWard(ward02);

        ward01.addDoctor(doc01);
        ward02.addDoctor(doc02);

        ward01.addPatient(pat001);
        ward02.addPatient(pat002);

        System.out.println(hospital);

    }
}
