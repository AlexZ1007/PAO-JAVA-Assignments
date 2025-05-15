package Lab5_6.Task;

public class OutTask implements Task {
    String message;
    public OutTask(String message) {
        this.message = message;
    }

    @Override
    public void execute(){
        System.out.println(message);
    }

}
