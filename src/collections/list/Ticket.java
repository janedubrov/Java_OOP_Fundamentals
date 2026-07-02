package collections.list;

public class Ticket {

    private int id;
    private String subject;
    private Priority priority;
    private Status status;

    public Ticket(int id, String subject, Priority priority, Status status) {
        this.id = id;
        this.subject = subject;
        this.priority = priority;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + getId() + ", Subject: " + getSubject() + ", Priority: " + getPriority() + ". STATUS: " + getStatus();
    }

    public int getId() {
        return id;
    }
    public String getSubject() {
        return subject;
    }
    public Priority getPriority() {
        return priority;
    }
    public Status getStatus() {
        return status;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
