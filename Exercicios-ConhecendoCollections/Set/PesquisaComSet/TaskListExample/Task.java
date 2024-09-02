package Set.PesquisaComSet.TaskListExample;

public class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setComplete() {
        this.isDone = true;
    }

    public void setIncomplete(){
        this.isDone = false;
    }

    @Override
    public String toString() {
        return "Taks: [Description: %s, Completed: %s]".formatted(description, isDone);
    }
}
