package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

public class Kata6 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        String name = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata6\\data\\emails.txt";
        ArrayList<Person> mailList = MailListReader.read(name);
        HistogramBuilder<Person> builder = new HistogramBuilder<>(mailList);
        ArrayList<OtherPerson> personList = PersonLoader.read();
        HistogramBuilder<OtherPerson> builderPerson = new HistogramBuilder<>(personList);
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {
            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {
            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
        
        Histogram<Character> gender = builderPerson.build(new Attribute<OtherPerson, Character>() {

            @Override
            public Character get(OtherPerson item) {
                return item.getGender().charAt(0);
            }
        });
        Histogram<String> domainsPerson = builderPerson.build(new Attribute<OtherPerson, String>() {

            @Override
            public String get(OtherPerson item) {
                return item.getMail().split("@")[1];
            }
        });
        Histogram<Float> weights = builderPerson.build(new Attribute<OtherPerson, Float>() {

            @Override
            public Float get(OtherPerson item) {
                return item.getWeight();
            }
        });
        
        new HistogramDisplay(domainsPerson,"DOMINIOS").execute();
        new HistogramDisplay(weights,"PESOS").execute();
        new HistogramDisplay(gender,"GENERO").execute();
        
        //new HistogramDisplay(domains,"DOMINIOS").execute();
        //new HistogramDisplay(letters,"CARACTER").execute();
        //new HistogramDisplay(gender,"SEXO").execute();
    }
}
