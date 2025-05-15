package Lab5_6.Task;

public class RandomOutTask implements Task{
    int randomNum;

    public RandomOutTask() {
        randomNum = (int) (Math.random() * 100);
    }

    @Override
    public void execute(){
        System.out.println("Random Number: " + randomNum);
    }
}
