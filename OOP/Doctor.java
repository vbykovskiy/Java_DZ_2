package OOP;

import java.time.LocalDate;

public class Doctor {

    private String name;
    private LocalDate birthDate;
    private int yearsExperience;
    private String specialization;


    public Doctor(String name, LocalDate birthDate, int yearsExperience, String specialization) {
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
        return "Doctor{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", yearsExperience=" + yearsExperience +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public void treatPatient() {
        System.out.println("Doctor treats the animal");
    }

    public void takeRest() {
        System.out.println("Doctor takes a rest");
    }
    
    public void giveTask() {
        System.out.println("Doctor gives a task");
    }
}

