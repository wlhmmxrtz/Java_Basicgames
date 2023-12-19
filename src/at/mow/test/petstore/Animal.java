package at.mow.test.petstore;

public interface Animal {

    String getName();

    void setName(String name);

    default void run() {
        System.out.println(getName() + " is running");
    }

    static void staticRun() {
        System.out.println("An animal is running");
    }
}
