package kata6;

public class OtherPerson {
    private final Integer id;
    private final String name;
    private final String gender;
    private final String birthdate;
    private final float weight;
    private final String mail;

    public OtherPerson(Integer id, String name, String gender, String birthdate, float weight, String mail) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.weight = weight;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public float getWeight() {
        return weight;
    }

    public String getMail() {
        return mail;
    }
    
            
}
