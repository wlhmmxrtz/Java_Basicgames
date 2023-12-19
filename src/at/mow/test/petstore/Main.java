package at.mow.test.petstore;

public class Main {

    public static void main(String[] args) {
        Petstore Laden = new Petstore();
        Person Hans = new Person();
        Dog Hund = new Dog();
        Cat Katze = new Cat();

        Laden.getOwner();
        Hans.setName("Hans","Lagner");
        Hund.setName("Samy");
        Katze.setName("Minzi");
        Hund.run();
        Katze.run();
    }
}
