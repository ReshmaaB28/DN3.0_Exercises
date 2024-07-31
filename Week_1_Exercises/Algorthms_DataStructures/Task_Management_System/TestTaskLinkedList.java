package Task_Management_System;

public class TestTaskLinkedList {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Task 1", "Incomplete"));
        taskList.addTask(new Task(2, "Task 2", "Incomplete"));
        taskList.addTask(new Task(3, "Task 3", "Complete"));

        // Searching for a task
        Task foundTask = taskList.searchTask(2);
        assert foundTask != null && foundTask.getTaskName().equals("Task 2");

        // Deleting a task
        boolean deleted = taskList.deleteTask(2);
        assert deleted;
        assert taskList.searchTask(2) == null;

        // Traversing tasks
        taskList.traverseTasks();  // Should print Task 1 and Task 3

        System.out.println("All tests passed!");
    }
}

