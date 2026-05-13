package Super;

import java.util.ArrayList;

public class PoliceDog extends Dog implements Trainable {
    private int badgeNumber;
    private ArrayList<String> commands = new ArrayList<>();

    public PoliceDog(String name, int age, String breed,int badgeNumber) {
        super(name, age, breed);
        this.badgeNumber = badgeNumber;
        commands.add("Sit");
        commands.add("Jump");
        commands.add("Run");
        commands.add("Sleep");
    }

    public int getBadgeNumber(){
        return badgeNumber;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Badge Number is : " + badgeNumber);
    }

    @Override
    public void train(String command){
        commands.add(command);
        System.out.println(command + " learned!");
    }

    @Override
    public void showCommands(){
        System.out.println("Trained commands: " + commands);
    }
}
