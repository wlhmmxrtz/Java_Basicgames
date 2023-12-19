package at.mow.test.petstore;
public class Petstore {

    private String owner;

    public Petstore(Person owner) {
        this.owner = owner.getFullName();
    }

    public void getOwner() {
        System.out.println(owner);
    }

    public String printNameOfAnimals(Animal animal) {
        return animal.getName();
    }
}
