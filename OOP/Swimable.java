package OOP;

public interface Swimable {
    public static final String type = "Swimable";
    void swim();
     default double getSwimSpeed(){
         return 4.33;
     }
}
