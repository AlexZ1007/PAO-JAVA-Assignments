package Lab5_6.Container;

import Lab5_6.Task.Task;

public interface Container {
    void insertTask(Task task);
    Task removeTask();
    boolean isEmpty();
}
