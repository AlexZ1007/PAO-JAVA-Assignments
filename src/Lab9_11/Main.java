package Lab9_11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        1.
        Catalog catalog = new Catalog(new ComparatorMedie());

        catalog.add(new Student("Ana", 9.3f));
        catalog.add(new Student("Bogdan", 7.6f));
        catalog.add(new Student("Mara", 6.84f));
        catalog.add(new Student("Vlad", 8.82f));
        catalog.add(new Student("Dana", 10.82f)); //  Dana (10.82) are media invalida

        for (Map.Entry<Integer, List<Student>> entry : catalog.entrySet()) {
            System.out.println(entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println(student);
            }
        }


//        2 a+b
//        Observatii: in HashSet se adauga DOAR elementele unice
        CustomHashSet customHashSet = new CustomHashSet();

        customHashSet.add(1);
        customHashSet.add(2);
        customHashSet.add(2);

        customHashSet.addAll(Arrays.asList(3,4,4,5));

        System.out.println("Set: " + customHashSet);
        System.out.println("Size "+ customHashSet.size());
        System.out.println("Total Adaugate " +customHashSet.getTotalAdaugate());


//        2 c
//        Observatii: in LinkedList se adauga toate elementele, PERMITE si duplicate
        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(1);
        customLinkedList.add(2);
        customLinkedList.add(2);

        customLinkedList.addAll(Arrays.asList(3,4,4,5));

        System.out.println("Set: " + customLinkedList);
        System.out.println("Size "+ customLinkedList.size());
        System.out.println("Total Adaugate " +customLinkedList.getTotalAdaugate());
    }
}
