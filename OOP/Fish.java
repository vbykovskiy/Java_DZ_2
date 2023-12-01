package OOP;

import java.time.LocalDate;

public class Fish extends Animal implements FlyingFish{

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void fly() {
        System.out.println("not every");
    }

    @Override
    public void toGo() {
        System.out.println("I would like to, but I can't");
    }

    @Override
    public void flyingFish() {
        System.out.println("I am flying fish");
    }



}
