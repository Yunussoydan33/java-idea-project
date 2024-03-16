import java.util.ArrayList;
import java.util.List;

// Task class representing a task in the task management system
class Task {
    private String name;
    private String description;
    private boolean completed;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }
}

// TaskManager class responsible for managing tasks
class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    // Other methods for task management
}

// Main class serving as the entry point of the application
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Create tasks
        Task task1 = new Task("Task 1", "Description for Task 1");
        Task task2 = new Task("Task 2", "Description for Task 2");

        // Add tasks to the task manager
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        // Mark task 1 as completed
        task1.markAsCompleted();

        // Display tasks
        System.out.println("Tasks:");
        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getName() + " - " + (task.isCompleted() ? "Completed" : "Not completed"));
        }
    }
}