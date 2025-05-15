package Lab5_6.Task;

import Lab5_6.Container.Container;

public abstract class  AbstractContainer implements Container {
    protected Task[] tasks;
    protected int count=0;
    public AbstractContainer() {
        tasks = new Task[100];
    }

    @Override
    public void insertTask(Task task){
        if(count<tasks.length){
            tasks[count] = task;
            count++;
        } else {
            System.out.println("The container is full");
        }
    }

    @Override
    public boolean isEmpty(){
        return count==0;
    }


}
