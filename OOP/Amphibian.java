package OOP;

public interface Amphibian extends Goable, Swimable {
    public static final String type = "Goable";
    public static final String type2 = "Swimable";
    void amphibian();
     default double getSwimSpeed(){
         return 8.5;
     }
     default double getRunSpeed(){
         return 3;
     }
}
