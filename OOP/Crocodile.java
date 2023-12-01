package OOP;

import java.time.LocalDate;

public class Crocodile extends Animal implements Amphibian{

    public Crocodile(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void swim() {
        System.out.println("hell yeah!");
    }

    @Override
    public void fly() {
        System.out.println("When no one is watching");
    }

    @Override
    public void run() {
        System.out.println("low rider");
    }

    @Override
    public void amphibian() {
        System.out.println("I am crocodile");
    }


}
