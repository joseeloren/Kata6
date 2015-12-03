package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Kata6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String name = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata6\\data\\emails.txt";
        ArrayList<Person> mailList = MailListReader.read(name);
        //Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        //new HistogramDisplay(histogram).execute();
    }
}
