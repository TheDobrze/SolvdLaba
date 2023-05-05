package buildingCompany.assembly;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stadium stadium = (Stadium) o;
        return gates == stadium.gates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gates);
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "gates=" + gates +
                "} " + super.toString();
    }

    @Override
    public void build() {

    }
}
