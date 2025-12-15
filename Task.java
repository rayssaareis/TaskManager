public class Task {

    private int id;
    private String description;
    private boolean completed;

    public int getId() {
        return id;
    }
    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    void Completed() {
        this.completed = true;
    }

    void showTask() {
        String status = completed ? "✔\uFE0F" : "❌";
        System.out.println("ID: " + id + " | Description: " + description + " | Status: " + status);
    }

}
