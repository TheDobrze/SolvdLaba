package buildingCompany.mercantile;

public class Mall extends MercantileBuilding{

    private int elevators;
    private boolean buffets;
    private int toilets;

    public Mall(String address, int floors, boolean garage, int supplyBase, int elevators, boolean buffets, int toilets) {
        super(address, floors, garage, supplyBase);
        this.elevators = elevators;
        this.buffets = buffets;
        this.toilets = toilets;
    }

    public int getElevators() {
        return elevators;
    }

    public void setElevators(int elevators) {
        this.elevators = elevators;
    }

    public boolean isBuffets() {
        return buffets;
    }

    public void setBuffets(boolean buffets) {
        this.buffets = buffets;
    }

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    @Override
    public void build() {
        System.out.println("Building mall:)");
    }

    @Override
    public String toString() {
        return "Mall{" +
                "elevators=" + elevators +
                ", buffets=" + buffets +
                ", toilets=" + toilets +
                "} " + super.toString();
    }
}
