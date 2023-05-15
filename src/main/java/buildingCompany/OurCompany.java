package buildingCompany;

import java.util.List;
import java.util.Set;

public class OurCompany {

    public static final String NAME = "ŁęcinaBud";
    private List<Person> employees;
    private String adress;
    private Set<String> clients;

    public OurCompany(List<Person> employees, String adress, Set<String> clients) {
        this.employees = employees;
        this.adress = adress;
        this.clients = clients;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Set<String> getClients() {
        return clients;
    }

    public void setClients(Set<String> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "OurCompany{" +
                "employees=" + employees +
                ", adress='" + adress + '\'' +
                ", clients=" + clients +
                '}';
    }
}
