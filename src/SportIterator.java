import Labor2.Sport;

import java.util.Iterator;
import java.util.List;

public class SportIterator implements Iterator {
    private List<Sport> sport;
    int cursor=0;

    public SportIterator(List<Sport> sport) {
        this.sport = sport;
    }

    @Override

    public boolean hasNext() {
        if(this.cursor>=this.sport.size())
            return false;
        return true;
    }

    @Override
    public Object next() {
        this.cursor+=1;
        return this.sport.get(this.cursor-1);
    }
}
