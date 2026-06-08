package arrayList.airport;

import java.util.PriorityQueue;

public class AirportQueue_Main {
    public static void main(String[] args) {

        PriorityQueue<Passenger> passengers = new PriorityQueue<>();

        passengers.add(new Passenger("Anna Smith", 3, 1));
        passengers.add(new Passenger("Jacob Crane", 2, 2));
        passengers.add(new Passenger("Jane Dubrov", 1, 3));
        passengers.add(new Passenger("Hannes Soul", 2, 4));
        passengers.add(new Passenger("Olaf Henry", 3, 5));

        int totalPassengers = passengers.size();

        for(int i = 0; i < totalPassengers; i++) {
            System.out.println(passengers.poll());
        }


    }

}
