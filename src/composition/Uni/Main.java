package composition.Uni;

public class Main {
    public static void main(String[] args) {

        University uni = new University("Berkley University", 55);

        Faculty fac01 = new Faculty("Mathematics", 1200, 59);
        Faculty fac02 = new Faculty("English language", 580, 31);

        Professor prof01 = new Professor("Henry Bob" , 5415, "Mathematics");
        Professor prof02 = new Professor("Hanna Jilly", 254, "English Language");
        Professor prof03 = new Professor("Smith Jarrod", 4798, "Algebra");

        Student st0001 = new Student("Leon Sonn", 125, 22);
        Student st0002 = new Student("Kate J", 127, 24);
        Student st0003 = new Student("Anna Bruno",  541, 18);

        fac01.addProfessor(prof01);
        fac01.addProfessor(prof02);
        fac02.addProfessor(prof03);

        fac01.addStudent(st0001);
        fac02.addStudent(st0002);
        fac02.addStudent(st0003);

        uni.addFaculty(fac01);
        uni.addFaculty(fac02);

        System.out.println(uni);

    }
}
