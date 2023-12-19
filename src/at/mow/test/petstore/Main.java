package at.mow.test.petstore;

public class Main {

    public static void main(String[] args) {
        Person Hans = new Person();
        Hans.setName("Hans","Lagner");

        Petstore Laden = new Petstore(Hans);

        Dog Hund = new Dog();
        Cat Katze = new Cat();

        Laden.getOwner();
        Dog.run();
        Cat.run();

    }
}