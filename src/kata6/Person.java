/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

/**
 *
 * @author usuario
 */
public class Person {
    private final Integer id;
    private final String mail;

    public Person(int id, String name) {
        this.id = id;
        this.mail = name;
    }

    public Integer getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }
}
