package OOP;

public interface SuperDuck extends Goable, Swimable, Flyable {
    public static final String type = "Goable";
    public static final String type2 = "Swimable";
    public static final String type3 = "Flyable";
    void superDuck();
     default double getSwimSpeed(){
         return 100500;
     }
     default double getRunSpeed(){
         return 100500;
     }

     default double getFlySpeed(){
         return 100500;
     }
}