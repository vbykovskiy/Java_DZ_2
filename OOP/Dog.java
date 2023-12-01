package OOP;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable{

    public Dog(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }



    @Override
    public void fly() {
        System.out.println("do not make it up");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void swim() {
        System.out.println("Dog have swim");
    }
}
