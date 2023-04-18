package buildingCompany.employees;

import java.util.Date;

public class Builders extends Person{

    private int salary;
    private boolean forklift_certificate;

    public Builders(int id, String name, String lastName, Date joined, int salary, boolean forklift_certificate) {
        super(id, name, lastName, joined);
        this.salary = salary;
        this.forklift_certificate = forklift_certificate;
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
    public String toString() {
        return "Builders{" +
                "salary=" + salary +
                ", forklift_certificate=" + forklift_certificate +
                ", id=" + id +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", joined=" + joined +
                '}';
    }
}
