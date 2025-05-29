package Lab9_11;

import java.util.Collection;
import java.util.HashSet;

public class CustomHashSet extends HashSet<Integer> {
    private int totalAdaugate = 0;

    @Override
    public boolean add(Integer i) {
        boolean added = super.add(i);
        totalAdaugate ++;
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modified = false;
        for (Integer i : c) {
            if(this.add(i)){
                modified = true;
            }
        }
        return modified;
    }

    public int getTotalAdaugate() {
        return totalAdaugate;
    }
}
