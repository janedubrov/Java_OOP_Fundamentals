package Super;

public class GuideDog extends Dog{
    private String owner;

    public GuideDog(String name, int age, String breed, String owner) {
        super(name, age, breed);
        this.owner = owner;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Owner: " + owner);
    }
}
