package composition.hospital;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Charite", 140);

        Ward ward01 = new Ward("Cardiology", 15);
        Ward ward02 = new Ward("Orthopaedics", 25);

        Patient pat001 = new Patient("Jonh Selly", 2884, "Heart problems");
        Patient pat002 = new Patient("Bob Salmon", 9815, "Headacke");

        hospital.addWard(ward01);
        hospital.addWard(ward02);

        ward01.addPatient(pat001);
        ward02.addPatient(pat002);

        System.out.println(hospital);

    }
}
