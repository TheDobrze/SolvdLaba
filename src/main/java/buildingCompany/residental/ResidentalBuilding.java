package buildingCompany.residental;

import buildingCompany.Building;

abstract class ResidentalBuilding extends Building {

    public int capacity;

    public ResidentalBuilding(String address, int floors, boolean garage, int capacity) {
        super(address, floors, garage);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ResidentalBuilding{" +
                "address='" + address + '\'' +
                ", floors=" + floors +
                ", garage=" + garage +
                ", capacity=" + capacity +
                '}';
    }
}
