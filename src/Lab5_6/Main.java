package Lab5_6;

import Lab5_6.Container.Container;
import Lab5_6.Container.Queue;
import Lab5_6.Container.Stack;
import Lab5_6.Task.CounterOutTask;
import Lab5_6.Task.OutTask;
import Lab5_6.Task.RandomOutTask;
import Lab5_6.Task.Task;

public class Main {
//    2. Interfaţa Container specifică interfaţa comună pentru colecţii de obiecte Task, în care se pot adăuga și din care se pot elimina elemente.
//    Creaţi si testati două tipuri de containere care implementează această interfata:
//
//    a. Stack - care implementează o strategie de tip LIFO
//    b. Queue - care implementează o strategie de tip FIFO
//
//    Evitaţi codul similar în locuri diferite si utilizati array-uri (nu API-ul de colectii).

    public static void main(String[] args) {
//        1.
        Task randomOutTask =  new RandomOutTask();
        Task counterOutTask =  new CounterOutTask();
        Task outTask =  new OutTask("Task-ul se executa!");

        outTask.execute();
        randomOutTask.execute();
        counterOutTask.execute();
        counterOutTask.execute();

//        2.
        Container stack = new Stack();
        stack.insertTask(new OutTask("Task 1 - Stack"));
        stack.insertTask(new RandomOutTask());
        stack.insertTask(new CounterOutTask());
        stack.insertTask(new CounterOutTask());
        stack.insertTask(new OutTask("Task 3 - Stack"));

        System.out.println("\nStack:");
        while (!stack.isEmpty()) {
            stack.removeTask().execute();
        }

        // Queue Test
        Container queue = new Queue();
        queue.insertTask(new OutTask("Task 1 - Queue"));
        queue.insertTask(new RandomOutTask());
        queue.insertTask(new OutTask("Task 3 - Queue"));

        System.out.println("\nQueue:");
        while (!queue.isEmpty()) {
            queue.removeTask().execute();
        }


    }
}
