package buildingCompany.mercantile;

public class Supermarket extends MercantileBuilding{

    private boolean warehouse;

    public Supermarket(String address, int floors, boolean garage, int supplyBase, boolean warehouse) {
        super(address, floors, garage, supplyBase);
        this.warehouse = warehouse;
    }

    public boolean isWarehouse() {
        return warehouse;
    }

    public void setWarehouse(boolean warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                ", warehouse=" + warehouse +
                "} " + super.toString();
    }

    @Override
    public void build() {

    }
}
