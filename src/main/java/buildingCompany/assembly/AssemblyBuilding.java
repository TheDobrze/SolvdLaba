package buildingCompany.assembly;

import buildingCompany.Building;

abstract class AssemblyBuilding extends Building {

    private int capacity;
    private int toilets;

    public AssemblyBuilding(String address, int floors, boolean garage, int capacity,int toilets) {
        super(address, floors, garage);
        this.capacity = capacity;
        this.toilets = toilets;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    @Override
    public String toString() {
        return "AssemblyBuilding{" +
                "capacity=" + capacity +
                ", toilets=" + toilets +
                "} " + super.toString();
    }
}
