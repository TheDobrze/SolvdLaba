package buildingCompany.residental;

public class House extends ResidentalBuilding{

    private boolean attic;
    private boolean basement;
    private boolean garden;
    private boolean SwimmingPool;

    public House(String address, int floors, boolean garage, int capacity, boolean attic, boolean basement, boolean garden, boolean swimmingPool) {
        super(address, floors, garage, capacity);
        this.attic = attic;
        this.basement = basement;
        this.garden = garden;
        SwimmingPool = swimmingPool;
    }

    public boolean isAttic() {
        return attic;
    }

    public void setAttic(boolean attic) {
        this.attic = attic;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isSwimmingPool() {
        return SwimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        SwimmingPool = swimmingPool;
    }

    @Override
    public void build() {

    }

    @Override
    public String toString() {
        return "House : " +
                "attic=" + attic +
                ", basement=" + basement +
                ", garden=" + garden +
                ", SwimmingPool= " + SwimmingPool  + super.toString();
    }
}
