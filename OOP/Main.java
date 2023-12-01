package OOP;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Murzik",new Chumka("chumka"),"Vasya", LocalDate.of(6,10,23));
        Dog dog = new Dog("Sharik",new Chumka("chumka"),"petr", LocalDate.of(3,12,21));
        Duck duck = new Duck("Donald Duck",new Chumka("chumka"),"Vasya", LocalDate.of(6,10,23));
        Fish fish = new Fish("Nemo",new Chumka("chumka"),"Vasya", LocalDate.of(6,10,23));
        Crocodile crocodile = new Crocodile("Crocs",new Chumka("chumka"),"Vasya", LocalDate.of(3,1,3));
        Doctor doctor = new Doctor("Bob", LocalDate.of(1980, 8, 1), 6, "Veterinary");
        Nurse nurse = new Nurse("Jessica", LocalDate.of(2001, 6, 3), 2, "Nurse");

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Nurse> nurses = new ArrayList<>();

        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(fish);
        animals.add(crocodile);
        doctors.add(doctor);
        nurses.add(nurse);

        System.out.println("--------------------------------");
        System.out.println(doctors);
        System.out.println("--------------------------------");
        System.out.println(nurses);
        System.out.println("--------------------------------");
        doctor.giveTask();
        nurse.injectAnimal();

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(fish).addPatient(crocodile);

        System.out.println("--------------------------------");
        System.out.println("getFlyable: " + clinic.getFlyable());
        System.out.println("--------------------------------");
        System.out.println("getSwimable: " + clinic.getSwimable());
        System.out.println("--------------------------------");
        System.out.println("getGoable: " + clinic.getGoable());
        System.out.println("--------------------------------");
        System.out.println("getAmphibians: " + clinic.getAmphibians());
        System.out.println("--------------------------------");
        System.out.println("getFlyingFish: " + clinic.getFlyingFish());
        System.out.println("--------------------------------");
        System.out.println("getSuper " + clinic.getSuperDuck());
        System.out.println("--------------------------------");


   

    }
}
