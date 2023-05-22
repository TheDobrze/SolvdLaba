package buildingCompany.employees;

import buildingCompany.Enums.Certificate;
import buildingCompany.Enums.Salary;
import buildingCompany.Person;
import buildingCompany.interfaces.Payment;
import buildingCompany.interfaces.Testable;
import buildingCompany.interfaces.Worker;

import java.util.Date;

public class Welder extends Person implements Worker, Payment, Testable {

    private boolean gear;
    private Salary salary;
    private Certificate certificate;

    public Welder(int id, String name, String lastName, Date joined, boolean gear,Salary salary,Certificate certificate) {
        super(id, name, lastName, joined);
        this.gear = gear;
        this.salary = salary;
        this.certificate = certificate;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public boolean isGear() {
        return gear;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    @Override
    public void work() {
    }

    @Override
    public String toString() {
        return "Welder{" +
                "gear=" + gear +
                "} " + super.toString();
    }

    @Override
    public void getPaid() {

    }

    @Override
    public void blow() {

    }
}
