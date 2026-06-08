package arrayList.airport;

public class Passenger implements Comparable<Passenger>{
    private String name;
    private int boardingClass;
    private int checkInOrder;

    public Passenger(String name, int boardingClass, int checkInOrder) {
        this.name = name;
        this.boardingClass = boardingClass;
        this.checkInOrder = checkInOrder;
    }

    public String toString() {
        return "Passenger " + name + ", boarding class(1-3): " + boardingClass + ", check in order: " + checkInOrder;
    }

    public int compareTo(Passenger newPassanger) {
        if(this.boardingClass == newPassanger.boardingClass) {
           return this.checkInOrder - newPassanger.checkInOrder;
        }
        return this.boardingClass - newPassanger.boardingClass;
    }

    public String getName() {
        return name;
    }

    public int getBoardingClass() {
        return boardingClass;
    }

    public int getCheckInOrder() {
        return checkInOrder;
    }

    public void setBoardingClass(int boardingClass) {
        this.boardingClass = boardingClass;
    }

    public void setCheckInOrder(int checkInOrder) {
        this.checkInOrder = checkInOrder;
    }

}
