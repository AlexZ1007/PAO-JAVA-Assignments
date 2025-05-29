package Lab9_11;

import java.util.Collection;
import java.util.LinkedList;

public class CustomLinkedList extends LinkedList<Integer> {
    private int totalAdaugate = 0;

    @Override
    public boolean add(Integer x) {
        totalAdaugate++;
        return super.add(x);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        totalAdaugate+= c.size();
        return super.addAll(c);
    }

    public int getTotalAdaugate() {
        return totalAdaugate;
    }
}
