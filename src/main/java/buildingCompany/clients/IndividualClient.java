package buildingCompany.clients;

import buildingCompany.Person;
import buildingCompany.interfaces.Requestor;

import java.util.Date;

final class IndividualClient extends Person implements Requestor {

    private int budget;

    public IndividualClient(int id, String name, String lastName, Date joined, int budget) {
        super(id, name, lastName, joined);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public void Request() {

    }

    @Override
    public String toString() {
        return "IndividualClient{" +
                "budget=" + budget +
                "} " + super.toString();
    }
}
