package enums;

public class Week_Main {
    public static void main(String[] args) {

        for(DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day + " " + day.ordinal() + " - ");
            if(day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                System.out.println("Wochenende!");
            }
            else {
                System.out.println("Arbeitstag...");
            }

        }
    }
}
