package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ToDoList {
    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void printAllTasks() {
        for(Task task : tasks) {
            System.out.println(task);
        }
    }

    public void sortByPriority() {
        tasks.sort(Comparator.comparing((Task task) -> task.getPriority().ordinal()).reversed() );
    }

    public void removeDoneTasks() {
        tasks.removeIf(t -> t.getIsDone());
    }

    public void markAsDone(int id) {
        for(Task task : tasks)  {
            if(task.getId() == id) {
                task.setIsDone(true);
                System.out.println("Task " + id + " was marked as DONE");
            }
        }
    }

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        Task task1 = new Task(1, "clean apartment", TaskPriority.HIGH, false);
        Task task2 = new Task(2, "buy food", TaskPriority.HIGH, true);
        Task task3 = new Task(3, "go to gym", TaskPriority.MEDIUM, false);
        Task task4 = new Task(4, "meet with freinds", TaskPriority.LOW, false);

        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);

        toDoList.printAllTasks();
        System.out.println("---");

        toDoList.sortByPriority();
        toDoList.printAllTasks();
        System.out.println("---");

        toDoList.printAllTasks();
        toDoList.markAsDone(2);
        System.out.println("---");

        toDoList.removeDoneTasks();
        toDoList.printAllTasks();
        System.out.println("---");
    }
}
