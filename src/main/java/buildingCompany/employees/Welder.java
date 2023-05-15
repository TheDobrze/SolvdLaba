package buildingCompany.employees;

import buildingCompany.Person;
import buildingCompany.interfaces.Payment;
import buildingCompany.interfaces.Testable;
import buildingCompany.interfaces.Worker;

import java.util.Date;

public class Welder extends Person implements Worker, Payment, Testable {

    private boolean gear;

    public Welder(int id, String name, String lastName, Date joined, boolean gear) {
        super(id, name, lastName, joined);
        this.gear = gear;
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
