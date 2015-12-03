package kata6;

import java.util.ArrayList;

public interface HistogramBuilder {

    /**
     *
     * @param <T>
     * @param mailList
     * @return
     */
    public Histogram<T> build(ArrayList<String> mailList);
}
