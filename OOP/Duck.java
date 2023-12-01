package OOP;

import java.time.LocalDate;

public class Duck extends Animal implements SuperDuck{

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void run() {
        System.out.println("Duck run");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }

    @Override
    public void superDuck() {
        System.out.println("I am super duck");
    }

    
}
