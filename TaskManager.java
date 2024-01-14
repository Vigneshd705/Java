import java.util.ArrayList;
import java.util.List;

class Task {
    private String name;
    private String description;
    private int priority;

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}

public class TaskManager {
    public static void main(String[] args) {
        // Create two lists of tasks
        List<Task> personalTasks = new ArrayList<>();
        List<Task> workTasks = new ArrayList<>();

        // Adding tasks to the lists
        personalTasks.add(new Task("Buy groceries", "Milk, bread, eggs", 2));
        personalTasks.add(new Task("Exercise", "Go for a run", 3));
        workTasks.add(new Task("Finish report", "Complete the quarterly report", 1));
        workTasks.add(new Task("Meeting with client", "Discuss project updates", 2));

        // Displaying tasks in each list
        System.out.println("Personal Tasks:");
        displayTasks(personalTasks);

        System.out.println("\nWork Tasks:");
        displayTasks(workTasks);

        // Concatenating the two lists
        List<Task> allTasks = concatenateLists(personalTasks, workTasks);

        // Displaying concatenated tasks
        System.out.println("\nAll Tasks:");
        displayTasks(allTasks);

        // Removing a task from the personal tasks
        personalTasks.remove(0);

        // Displaying personal tasks after removal
        System.out.println("\nPersonal Tasks after removal:");
        displayTasks(personalTasks);
    }

    private static void displayTasks(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    private static List<Task> concatenateLists(List<Task> list1, List<Task> list2) {
        List<Task> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }
}