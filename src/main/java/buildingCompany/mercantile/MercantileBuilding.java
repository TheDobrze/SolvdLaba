package buildingCompany.mercantile;

import buildingCompany.Building;

abstract class MercantileBuilding extends Building {

    private int supplyBase;


    public MercantileBuilding(String address, int floors, boolean garage,int supplyBase) {
        super(address, floors, garage);
        this.supplyBase = supplyBase;
    }

    public int getSupplyBase() {
        return supplyBase;
    }

    public void setSupplyBase(int supplyBase) {
        this.supplyBase = supplyBase;
    }

    @Override
    public String toString() {
        return "MercantileBuilding{" +
                "supplyBase=" + supplyBase +
                "} " + super.toString();
    }
}
