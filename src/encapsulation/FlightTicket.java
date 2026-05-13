package encapsulation;

public class FlightTicket {
    private String passengerName;
    private String flightNumber;
    private double price;
    private boolean isPaid = false;

    public FlightTicket(String passengerName, String flightNumber, double price){
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        if(price < 0){
            this.price = 100;
        } else{
            this.price = price;
        }
    }
    String getPassengerName(){
        return this.passengerName;
    }
    String getFlightNumber() {
        return this.flightNumber;
    }
    double getPrice(){
        return this.price;
    }
    boolean getIsPaid() {
        return this.isPaid;
    }


    void pay() {
        if(isPaid == false){
            this.isPaid = true;
            System.out.println("Ticket for name " + passengerName + " is successfully paid");

        }

    }

    void changeFlight(String newFlight){
        if(isPaid == false){
            this.flightNumber = newFlight;
        }else {
            System.out.println("The ticket is already paid and can not be changed");
        }
    }

    void applyDiscount(int percent) {
        if (!isPaid && percent > 1 && percent <= 50) {
            price = price - (price * percent / 100);
        } else {
            System.out.println("Discount can not be used");
        }
    }


    }


