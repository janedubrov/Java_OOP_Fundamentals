package Encapsulation;

public class Constr_Ticket {
    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket("Jane" , "SW111" , 1210);
        ticket.applyDiscount(20);
        System.out.println(ticket.getPrice());
        ticket.pay();
        ticket.changeFlight("BW12");


    }
}
