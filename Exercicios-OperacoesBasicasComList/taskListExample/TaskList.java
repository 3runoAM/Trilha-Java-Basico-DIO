package entities.basicOperationsWithList.taskListExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {
    private static List<Task> taskList = new ArrayList<Task>();

    public static List<Task> getTaskList() {
        return taskList;
    }

    public static void addTask(Task tarefa){
        taskList.add(0, tarefa);
    }

    public static void removeTask(Task task){
        taskList.removeIf(t -> t.getDescription().equals(task.getDescription()));
    }

    public static int getTaskListSize() {
        return taskList.size();
    }

    public static List<String> getListOfTasksDescriptions(){
        return taskList.stream()
                .map(Task::getDescription)
                .collect(Collectors.toList());
    }
}