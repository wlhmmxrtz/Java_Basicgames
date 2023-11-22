package at.mow.test.observer;

public class HeatControl implements Observer {

    public HeatControl(){

    }

    @Override
    public void inform() {
        System.out.println("Info an Heizung");
    }
}
