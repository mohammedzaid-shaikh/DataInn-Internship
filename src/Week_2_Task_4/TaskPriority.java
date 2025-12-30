// Manage tasks by priority

package Week_2_Task_4;

import java.util.PriorityQueue;

class Task {
    String name;
    int priority; // Higher number = higher priority

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (Priority " + priority + ")";
    }
}

public class TaskPriority {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                (t1, t2) -> t2.priority - t1.priority // descending order of priority
        );

        taskQueue.add(new Task("Low priority task", 1));
        taskQueue.add(new Task("High priority task", 4));
        taskQueue.add(new Task("Medium priority task", 2));
        taskQueue.add(new Task("Urgent task", 5));
        taskQueue.add(new Task("Normal task", 3));

        System.out.println("\nTask Processing Order (by Priority):");
        while (!taskQueue.isEmpty()) {
            Task currentTask = taskQueue.poll();
            System.out.println("Processing: " + currentTask);
        }
    }
}
