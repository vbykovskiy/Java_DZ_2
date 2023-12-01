package OOP;

import java.time.LocalDate;

public class Nurse {

    private String name;
    private LocalDate birthDate;
    private int yearsExperience;
    private String specialization;

    public Nurse(String name, LocalDate birthDate, int yearsExperience, String specialization) {

        this.name = name;
        this.birthDate = birthDate;
        this.yearsExperience = yearsExperience;
        this.specialization = specialization;
    }

    public String getName() { return name; }

    public LocalDate getBirthDate() { return birthDate; }

    public int getYearsExperience() { return yearsExperience; }

    public String getSpecialization() { return specialization; }

    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", yearsExperience=" + yearsExperience +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public void dressAnimal() {
        System.out.println("Nurse dress the animal");
    }
    
    public void injectAnimal() {
        System.out.println("Nurse injects the animal");
    }
}
