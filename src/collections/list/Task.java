package collections.list;

public class Task {
    private int id;
    private String description;
    private TaskPriority priority;
    private boolean isDone;

    public Task(int id, String description, TaskPriority priority,boolean isDone) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.isDone = isDone;
    }

    public String toString() {
        return "{TASK " + id + ", decription: " + description + ", priority: " + priority + ", is it done? - " + isDone +  "}";
    }

    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public TaskPriority getPriority() {
        return priority;
    }
    public boolean getIsDone() {
        return isDone;
    }

     public void setIsDone(boolean isDone) {
        this.isDone = isDone;
     }

}
