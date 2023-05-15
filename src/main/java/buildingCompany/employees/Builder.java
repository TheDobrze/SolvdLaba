package buildingCompany.employees;

import buildingCompany.Person;
import buildingCompany.interfaces.Payment;
import buildingCompany.interfaces.Testable;
import buildingCompany.interfaces.Worker;

import java.util.Date;

public class Builder extends Person implements Worker, Payment, Testable {

    private int salary;
    private boolean forklift_certificate;
    private boolean ableToWork;

    public Builder(int id, String name, String lastName, Date joined, int salary, boolean forklift_certificate, boolean ableToWork) {
        super(id, name, lastName, joined);
        this.salary = salary;
        this.forklift_certificate = forklift_certificate;
        this.ableToWork = ableToWork;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isForklift_certificate() {
        return forklift_certificate;
    }

    public void setForklift_certificate(boolean forklift_certificate) {
        this.forklift_certificate = forklift_certificate;
    }

    @Override
    public void work() {
        System.out.println("Working on construction work");
    }

    @Override
    public String toString() {
        return "Builders{" +
                "salary=" + salary +
                ", forklift_certificate=" + forklift_certificate +
                "} " + super.toString();
    }

    public final void introduce(){
        System.out.println("Hi, my name is "+ getName());
    }

    public static void whatCompany(){
        System.out.println("Our company name is ŁęcinaBud");
    }

    @Override
    public void getPaid() {

    }

    @Override
    public void blow() {
    }
}
