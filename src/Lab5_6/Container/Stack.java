package Lab5_6.Container;

import Lab5_6.Task.AbstractContainer;
import Lab5_6.Task.Task;

public class Stack extends AbstractContainer {
    @Override
    public Task removeTask(){
        if(count!=0){
            Task task = tasks[count-1];
            tasks[count-1] = null;
            count--;
            return task;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

}
