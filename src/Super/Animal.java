package Super;

public class Animal {
    private String name;
    private int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("This animal is " + age + " years old");
    }

    public void speak() {
        System.out.println("Animal is making a sound... ");
    }

}
