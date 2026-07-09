package collections.list;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private double pricePerNight;
    private boolean isOccupied;
    private int capacity;

    public Room(int roomNumber, RoomType roomType, double pricePerNight, boolean isOccupied, int capacity) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isOccupied = isOccupied;
        this.capacity = capacity;
    }

    public String toString() {
        return "{ROOM #" + roomNumber  + ", room type: " + roomType + ", capacity - " + capacity + " person/s. Price per night: "  + pricePerNight + " euro, is occupied: " + isOccupied + "}";
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public RoomType getRoomType() {
        return roomType;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
