package composition.Uni;

public class Faculty {
    private String facultyName;
    private Student[] students;
    private Professor[] professors;
    private int totalStudents;
    private int totalProfessors;
    private int studentIndex;
    private int professorIndex;

    public Faculty(String facultyName, int totalStudents, int totalProfessors) {
        this.facultyName = facultyName;
        this.totalStudents = totalStudents;
        this.totalProfessors = totalProfessors;
    }

    public void addProfessor(Professor professor) {
        if(this.professors == null) {
            this.professors = new Professor[this.totalProfessors];

        } if(this.professorIndex < this.professors.length) {
            this.professors[professorIndex] = professor;
            professorIndex++;
        }

    }

    public void addStudent(Student student) {
        if(this.students == null) {
            this.students = new Student[this.totalStudents];
        } if(this.studentIndex < this.students.length) {
            this.students[studentIndex] = student;
            studentIndex++;
        }

    }
    @Override
    public String toString() {
        String facultyString = "";
        facultyString += "\nFaculty: " + facultyName;
        facultyString += "\nTotal Professors: " + totalProfessors;
        facultyString += "\nTotal Students: " + totalStudents;

        for(int i = 0; i < studentIndex; i++) {
            facultyString += this.students[i].toString();
        }
        for(int j = 0; j < professorIndex; j++) {
            facultyString += this.professors[j].toString();
        }

        return facultyString;
    }

    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName){
        this.facultyName = facultyName;
    }
    public int getTotalStudents() {
        return totalStudents;
    }
    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
    public int getTotalProfessors() {
        return totalProfessors;
    }
    public void setProfessors(int totalProfessors){
        this.totalProfessors = totalProfessors;
    }




}
