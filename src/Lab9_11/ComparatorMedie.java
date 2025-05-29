package Lab9_11;

import java.util.Comparator;

public class ComparatorMedie implements Comparator<Integer> {
    @Override
    public int compare(Integer m1, Integer m2) {
        return m2.compareTo(m1);
    }

}
