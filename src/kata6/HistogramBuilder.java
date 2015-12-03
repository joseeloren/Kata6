package kata6;

import java.util.ArrayList;

public class HistogramBuilder <T> {
    private final ArrayList<T> list;

    public HistogramBuilder(ArrayList<T> list) {
        this.list = list;
    }
    
    public <A> Histogram<A> build(Attribute<T,A> attribute) {
        Histogram<A> histogram = new Histogram<>();
        for (T item : list) {
            A value = attribute.get(item);
            histogram.increment(value);
        }
        return histogram;
    }    
}
