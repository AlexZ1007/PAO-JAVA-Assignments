package Lab9_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Catalog  extends TreeMap<Integer, List<Student>> {
    public Catalog(Comparator<Integer> comparator)
    {
        super(comparator);
    }

    public void add(Student student){
        float medieS = student.getMedie();
        int medieRotunjita = Math.round(medieS);

        if( medieRotunjita < 0 || medieRotunjita > 10){
            System.out.println(student + " are media invalida");
            return;
        }

            List<Student> studenti = this.get(medieRotunjita);
            if(studenti == null){
                studenti = new ArrayList<Student>();
                this.put(medieRotunjita, studenti);
            }
            studenti.add(student);
    }
}
