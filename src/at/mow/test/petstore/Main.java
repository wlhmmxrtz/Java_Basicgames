package at.mow.test.petstore;

public class Main {

    public static void main(String[] args) {
        Person Hans = new Person();
        Hans.setName("Hans","Lagner");

        Petstore Laden = new Petstore(Hans);

        Dog Hund = new Dog();
        Hund.setName("Samy");
        Cat Katze = new Cat();
        Katze.setName("Mizi");

        Laden.getOwner();
        Hund.run();
        Katze.run();

    }
}