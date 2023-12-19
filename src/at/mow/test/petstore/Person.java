// Person.java
package at.mow.test.petstore;

public class Person {

    private String firstName;
    private String lastName;
    private String fullName;

    public void setName(String Vorname,String Nachnanme) {
        this.firstName = Vorname;
        this.lastName = Nachnanme;
    }

    public String printName() {
        return firstName;

    }
}
