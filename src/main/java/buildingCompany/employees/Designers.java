package buildingCompany.employees;

import buildingCompany.Person;

import java.util.Date;

public class Designers extends Person implements Worker{

    private int salary;
    private String speciality;

    public Designers(int id, String name, String lastName, Date joined, int salary, String speciality) {
        super(id, name, lastName, joined);
        this.salary = salary;
        this.speciality = speciality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void work() {
        System.out.println("Making a buildin plan");
    }

    @Override
    public String toString() {
        return "Designers{" +
                "salary=" + salary +
                ", speciality='" + speciality + '\'' +
                "} " + super.toString();
    }
}
