package Set.PesquisaComSet.TaskListExample;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskList {
    private static Set<Task> taskList = new HashSet<Task>();

    public static Set<Task> getTaskList() {
        return taskList;
    }
    /**/

    public static void addTask(Task task) {
        taskList.add(task);
    }

    public static void removeTask(Task task) {
        taskList.removeIf(t -> t.getDescription().equalsIgnoreCase(task.getDescription()));
    }

    public static void showTaskList() {
        taskList.forEach(System.out::println);
    }

    public static int countTasks(){
        return taskList.size();
    }

    public static Set<Task> getCompleteTasks() {
        return taskList.stream()
                .filter(Task::isDone)
                .collect(Collectors.toSet());
    }

    public static Set<Task> getIncompleteTasks() {
        return taskList.stream()
                .filter(t -> !t.isDone())
                .collect(Collectors.toSet());
    }

    public static void completeTask(String description) {
        Optional<Task> taskOp = taskList.stream()
                .filter(t -> t.getDescription().equalsIgnoreCase(description))
                .findFirst();

        taskOp.ifPresent(Task::setComplete);
    }

    public static void incompleteTask(String description) {
        Optional<Task> taskOp = taskList.stream()
                .filter(t -> t.getDescription().equalsIgnoreCase(description))
                .findFirst();

        taskOp.ifPresent(Task::setIncomplete);
    }

    public static void removeAllTasks() {
        taskList.clear();
    }
}
