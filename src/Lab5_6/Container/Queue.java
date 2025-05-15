package Lab5_6.Container;

import Lab5_6.Task.AbstractContainer;
import Lab5_6.Task.Task;

public class Queue extends AbstractContainer {
    @Override
    public Task removeTask(){
        if(count!=0){
            Task task = tasks[0];
            for(int i=1;i<count;i++){
                tasks[i-1] = tasks[i];
            }
            count--;
            return task;
        } else {
            System.out.println("Queue is empty");
            return null;
        }
    }
}
