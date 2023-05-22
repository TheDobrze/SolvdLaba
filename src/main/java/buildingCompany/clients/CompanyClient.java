package buildingCompany.clients;

import buildingCompany.Building;
import buildingCompany.Enums.CompanySize;
import buildingCompany.interfaces.Owner;
import buildingCompany.interfaces.Requestor;

import java.util.List;

public class CompanyClient implements Requestor, Owner {

    private String name;
    private CompanySize size;
    private int budget;
    final int krsNumber;
    private List<Building> companyBuildings;

    public CompanyClient(String name, CompanySize size, int budget, int krsNumber, List<Building> companyBuildings) {
        this.name = name;
        this.size = size;
        this.budget = budget;
        this.krsNumber = krsNumber;
        this.companyBuildings = companyBuildings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanySize getSize() {
        return size;
    }

    public void setSize(CompanySize size) {
        this.size = size;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getKrsNumber(){
        return krsNumber;
    }

    public List<Building> getClientBuildings() {
        return companyBuildings;
    }

    @Override
    public void Request() {

    }

    @Override
    public String toString() {
        return "CompanyClient{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", budget=" + budget +
                ", krsNumber=" + krsNumber +
                ", companyBuildings=" + companyBuildings +
                '}';
    }

    @Override
    public void addBuilding(Building building) {
        companyBuildings.add(building);
    }
}
