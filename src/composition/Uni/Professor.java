package composition.Uni;

public class Professor {
    private String name;
    private int id;
    private String subject;

    public Professor(String name, int id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public String toString() {
        String professorString = "";
        professorString += "\nProfessor: " + name;
        professorString += "\nID: " + id;
        professorString += "\nsubject: " + subject;
        professorString += "\n----------------\n";

        return professorString;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.id = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
