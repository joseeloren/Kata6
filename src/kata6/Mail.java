package kata6;

public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getEmail() {
        return mail;
    }
    
    public String getDominio () {
        return this.mail.substring(this.mail.indexOf("@")+1);
    }
}
