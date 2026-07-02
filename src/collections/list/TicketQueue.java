package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TicketQueue {

    private List<Ticket> tickets = new ArrayList<>();

    //ADD Ticket to List:
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    // PRINT all tickets:
    public void printAllTickets() {
        for(Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    // SORT by priority:
    public void sortByPriority() {
        tickets.sort(Comparator.comparing((Ticket ticket) -> ticket.getPriority().ordinal()).reversed());
    }

    //DELETE closed Tickets:
    public void removeClosedTickets() {
        tickets.removeIf((Ticket ticket) -> ticket.getStatus() == Status.CLOSED);
    }

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(1, "Keine Internet Verbindung", Priority.MEDIUM, Status.OPEN);
        Ticket ticket2 = new Ticket(2, "PC funktioniert nicht", Priority.HIGH, Status.IN_PROGRESS);
        Ticket ticket3 = new Ticket(3, "Keine Internet Verbindung", Priority.MEDIUM, Status.CLOSED);
        Ticket ticket4 = new Ticket(4, "Printer einschaltet nicht", Priority.LOW, Status.OPEN);

        TicketQueue ticketQueue = new TicketQueue();
        ticketQueue.addTicket(ticket1);
        ticketQueue.addTicket(ticket2);
        ticketQueue.addTicket(ticket3);
        ticketQueue.addTicket(ticket4);

        ticketQueue.sortByPriority();
        ticketQueue.printAllTickets();
        ticketQueue.removeClosedTickets();
        ticketQueue.printAllTickets();
    }
}
