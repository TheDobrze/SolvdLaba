package buildingCompany.assembly;

public class Stadium  extends AssemblyBuilding{

    private int gates;

    public Stadium(String address, int floors, boolean garage, int capacity, int toilets, int gates) {
        super(address, floors, garage, capacity, toilets);
        this.gates = gates;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
        this.gates = gates;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "capacity=" + capacity +
                ", toilets=" + toilets +
                ", address='" + address + '\'' +
                ", floors=" + floors +
                ", garage=" + garage +
                ", gates=" + gates +
                '}';
    }
}
