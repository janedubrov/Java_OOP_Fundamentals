package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void printRooms() {
        for(Room room : rooms) {
            System.out.println(room);
        }
    }

    public List<Room> findByType(RoomType type) {
        List<Room> searchByType = new ArrayList<>();
        for(Room room : rooms) {
            if(room.getRoomType() == type) {
                searchByType.add(room);
            }
        }
        return searchByType;
    }

    public boolean checkIn(int roomNumber) {
        for(Room room : rooms) {
            if(room.getRoomNumber() == roomNumber ) {
                if(!room.isOccupied()) {
                    room.setOccupied(true);
                    System.out.println("Check in room " + room.getRoomNumber() +  " is complete!");
                    return true;
                } else {
                    System.out.println("The room " + room.getRoomNumber() + " is not available");
                    return false;
                }
            }
        }
        System.out.println("Room #" + roomNumber + " is already empty");
        return false;
    }

    public boolean checkOut(int roomNumber) {
        for(Room room : rooms) {
            if(room.getRoomNumber() == roomNumber) {
                if(room.isOccupied()) {
                    room.setOccupied(false);
                    System.out.println("Check out from room #" + room.getRoomNumber() + " is successfull!");
                    return true;
                } else {
                    System.out.println("Room #" + room.getRoomNumber() + " is already empty");
                    return false;
                }
            }
        }
        System.out.println("Room # " + roomNumber + " was not found");
        return false;
    }

    public List<Room> findAvailableRooms() {
        List<Room> freeRooms = new ArrayList<>();
        for(Room room : rooms) {
            if(!room.isOccupied()) {
                freeRooms.add(room);
            }
        }
        return freeRooms;
    }

    public double calculateProzentOccupancy() {
        int zaeler = 0;
        for(Room room : rooms) {
            if(room.isOccupied()) {
                System.out.println("The room # " + room.getRoomNumber() + " is busy");
                zaeler++;
            }
        }

        double prozent = (double) zaeler / rooms.size() * 100;
        System.out.println("Percentage of occupied rooms: " + prozent + "%.");
        return prozent;
    }


    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Room r1 = new Room(1, RoomType.SINGLE, 110.0, false, 1);
        Room r2 = new Room(2, RoomType.DOUBLE, 245.0, true, 2);
        Room r3 = new Room(3, RoomType.SUITE, 550.0, false, 4);
        Room r4 = new Room(4, RoomType.PENTHOUSE, 1000.0, true, 5);
        hotel.addRoom(r1);
        hotel.addRoom(r2);
        hotel.addRoom(r3);
        hotel.addRoom(r4);


        System.out.println("-- All rooms --");
        hotel.printRooms();

        System.out.println("-- Specific categories --");
        System.out.println(hotel.findByType(RoomType.SINGLE));
        System.out.println(hotel.findByType(RoomType.PENTHOUSE));

        System.out.println("-- Check in --");
        hotel.checkIn(1);
        hotel.checkIn(2);

        System.out.println("-- Check out --");
        hotel.checkOut(4);

        System.out.println("-- Print all rooms --");
        hotel.printRooms();

        System.out.println("-- Available rooms --");
        hotel.findAvailableRooms().forEach(System.out::println);

        System.out.println("-- Calculate % occupancy--");
        hotel.calculateProzentOccupancy();

    }
}
