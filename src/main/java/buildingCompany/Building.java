package buildingCompany;

import buildingCompany.interfaces.Buildable;

public abstract class Building implements Buildable {

    private String address;
    private int floors;
    private boolean garage;

    public Building(String address, int floors, boolean garage) {
        this.address = address;
        this.floors = floors;
        this.garage = garage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }


    @Override
    public String toString() {
        return "address='" + address + '\'' +
                ", floors=" + floors +
                ", garage= " + garage + ", " ;
    }
}
