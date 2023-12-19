package at.mow.test.petstore;

public class Cat implements Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(getName() + " the cat, is running");
    }
}
