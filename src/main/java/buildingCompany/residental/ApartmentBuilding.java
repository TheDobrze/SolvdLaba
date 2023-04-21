package buildingCompany.residental;

public class ApartmentBuilding extends ResidentalBuilding{

    private int elevator;
    private boolean rooftopAccess;

    public ApartmentBuilding(String address, int floors, boolean garage, int capacity, int elevator, boolean rooftopAccess) {
        super(address, floors, garage, capacity);
        this.elevator = elevator;
        this.rooftopAccess = rooftopAccess;
    }

    public int getElevator() {
        return elevator;
    }

    public void setElevator(int elevator) {
        this.elevator = elevator;
    }

    public boolean isRooftopAccess() {
        return rooftopAccess;
    }

    public void setRooftopAccess(boolean rooftopAccess) {
        this.rooftopAccess = rooftopAccess;
    }

    @Override
    public String toString() {
        return "ApartmentBuilding{" +
                "elevator=" + elevator +
                ", rooftopAccess=" + rooftopAccess +
                "} " + super.toString();
    }

    @Override
    public void build() {

    }
}
