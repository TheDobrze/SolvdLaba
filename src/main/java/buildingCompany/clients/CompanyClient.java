package buildingCompany.clients;

public class CompanyClient implements Requestor{

    private String name;
    private CompanySize size;
    private int budget;

    public CompanyClient(String name, CompanySize size, int budget) {
        this.name = name;
        this.size = size;
        this.budget = budget;
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

    @Override
    public void Request() {

    }

    @Override
    public String toString() {
        return "CompanyClient{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", budget=" + budget +
                '}';
    }
}
