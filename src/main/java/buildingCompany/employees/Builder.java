package buildingCompany.employees;

import buildingCompany.Enums.Certificate;
import buildingCompany.Enums.Salary;
import buildingCompany.Person;
import buildingCompany.interfaces.Payment;
import buildingCompany.interfaces.Testable;
import buildingCompany.interfaces.Worker;

import java.util.Date;

public class Builder extends Person implements Worker, Payment, Testable {

    private Salary salary;
    private Certificate certificate;
    private boolean ableToWork;

    public Builder(int id, String name, String lastName, Date joined, Salary salary, Certificate certificate, boolean ableToWork) {
        super(id, name, lastName, joined);
        this.salary = salary;
        this.certificate = certificate;
        this.ableToWork = ableToWork;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Certificate isForklift_certificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }


    @Override
    public void work() {
        System.out.println("Working on construction work");
    }

    @Override
    public String toString() {
        return "Builders{" +
                "salary=" + salary +
                ", forklift_certificate=" + certificate +
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
