package interfaces.Job;

public interface Employee {
    String getRole();

    default void introduce() {
        System.out.println("I am working as a " + getRole());
    }

    default void introduceFormally() {
        System.out.println("Good Day!");
        introduce();
    }
}
