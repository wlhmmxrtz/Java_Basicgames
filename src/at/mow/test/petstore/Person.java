// Person.java
package at.mow.test.petstore;

public class Person {

    private String firstName;
    private String lastName;
    public void setName(String Vorname,String Nachnanme) {
        this.firstName = Vorname;
        this.lastName = Nachnanme;
    }

    public void printName() {
        System.out.println(firstName + " " + lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
