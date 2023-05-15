package buildingCompany.clients;

import buildingCompany.Building;
import buildingCompany.Person;
import buildingCompany.interfaces.Owner;
import buildingCompany.interfaces.Requestor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndividualClient extends Person implements Requestor, Owner {

    private int budget;
    private List<Building> clientBuilding = new ArrayList<Building>();

    public IndividualClient(int id, String name, String lastName, Date joined, int budget, List<Building> clientBuilding) {
        super(id, name, lastName, joined);
        this.budget = budget;
        this.clientBuilding = clientBuilding;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public List<Building> getClientBuilding() {
        return clientBuilding;
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

    @Override
    public void addBuilding(Building building) {
        clientBuilding.add(building);
    }
}
