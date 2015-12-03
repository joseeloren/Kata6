package kata6;

import java.util.ArrayList;

public class MailHistogramBuilder {
    public static Histogram<T> build(ArrayList<T> mailList)  {
        Histogram<T> histogram = new Histogram<>();
        for (T mail: mailList) 
              histogram.increment((new Mail(mail)).getDominio());
        return histogram;
    }
}
