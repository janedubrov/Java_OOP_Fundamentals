package keyword_super;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public  void info() {
        super.info();
        System.out.println("Breed: " + breed);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Woof woof!");
    }


}
