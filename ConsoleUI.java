import java.util.Scanner;

public class ConsoleUI {
    public static void showMenu() {
        System.out.print("""
            === TASK MANAGER ===
            1 - Add task
            2 - list tasks
            3 - complete task
            4 - remove task
            5 - Exit <3
            Choose an option: """);
    }

        public static int readInt(Scanner scanner) {
            while (true) {
                try {
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.print("⚠\uFE0FInvalid input. Please enter a valid integer: ");
                }
            }
        }

}
