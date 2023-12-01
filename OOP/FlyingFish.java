package OOP;

public interface FlyingFish extends Swimable, Flyable {
    public static final String type = "Flyable";
    public static final String type2 = "Swimable";
    void flyingFish();
     default double getSwimSpeed(){
         return 6.5;
     }
     default double getFlySpeed(){
         return 6;
     }
}
