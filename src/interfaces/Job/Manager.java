package interfaces.Job;

public class Manager implements Employee {

    public Manager() {}

    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public void introduce() {
        System.out.println("I am a MANAGER and my position is: " + getRole());
    }
}
