package OOP;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    // Поля
    private List<Doctor> doctors = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();
    private List<Animal> patients = new ArrayList<>();
    
    // геттеры
    public List<Doctor> getDoctors() {
        return doctors;
    }
    public List<Nurse> getNurses() {
        return nurses;
    }
    public  List<Animal> getPatients(){
        return patients;
    }

    // Методы добавления
    public VeterinaryClinic addDoctor(Doctor doctor){
        doctors.add(doctor);
        return this;
    }
    public VeterinaryClinic addNurse(Nurse nurse){
        nurses.add(nurse);
        return this;
    }
    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }

    // Методы удаления
    public void removeDoctor(Doctor doctor){
        doctors.remove(doctor);
    }
    public void removeNurse(Nurse nurse){
        nurses.remove(nurse);
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }

    // Методы соответствия наследования
    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : patients){
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
    public List<Amphibian> getAmphibians() {
        List<Amphibian> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Amphibian){
                result.add((Amphibian) animal);
            }
        }
        return result;
    }
    public List<FlyingFish> getFlyingFish() {
        List<FlyingFish> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof FlyingFish){
                result.add((FlyingFish) animal);
            }
        }
        return result;
    }
    public List<SuperDuck> getSuperDuck() {
        List<SuperDuck> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof SuperDuck){
                result.add((SuperDuck) animal);
            }
        }
        return result;
    }
}
