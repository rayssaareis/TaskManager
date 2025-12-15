import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Task> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int nextId = 1;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        boolean running = true;

        while (running) {
            ConsoleUI.showMenu();
            int option = ConsoleUI.readInt(scanner);

            switch (option) {
                case 1 -> addTask();
                case 2 -> listTasks();
                case 3 -> completeTask();
                case 4 -> removeTask();
                case 5 -> {
                    running = false;
                    System.out.println("Encerrando sistema...");
                }
                default -> System.out.println("⚠\uFE0FOpção inválida.");
            }
        }
    }


    void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        int id = nextId++;
        Task newTask = new Task(id, description);
        tasks.add(newTask);
        System.out.println("Task added with ID: " + id);
    }
    void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("⚠\uFE0FNo tasks available.");
        } else {
            for (Task task : tasks) {
                task.showTask();
            }
        }
    }
    void completeTask() {
        System.out.print("Enter task ID to complete: ");
        int id = ConsoleUI.readInt(scanner);
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.Completed();
                System.out.println("Task ID " + id + " marked as completed.");
                return;
            }
        }
        System.out.println("Task ID not found.");

    }
    void removeTask() {
        System.out.print("Enter task ID to remove: ");
        int id = ConsoleUI.readInt(scanner);
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                System.out.println("Task ID " + id + " removed.");
                return;
            }
        }
        System.out.println("Task ID not found.");
    }
}
