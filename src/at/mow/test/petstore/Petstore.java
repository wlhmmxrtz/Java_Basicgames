package at.mow.test.petstore;

public class Petstore {

    private String owner;

    public Petstore(Person owner) {
        this.owner = owner.printName();
    }

    public String getOwner() {
        return owner;
    }

    public String printNameOfAnimals(Animal animal) {
        return animal.getName();
    }
}
