package buildingCompany.assembly;

public class Restaurant extends AssemblyBuilding{

    private int kitchen;
    private int drinkBar;

    public Restaurant(String address, int floors, boolean garage, int capacity, int toilets, int kitchen, int drinkBar) {
        super(address, floors, garage, capacity, toilets);
        this.kitchen = kitchen;
        this.drinkBar = drinkBar;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }

    public int getDrinkBar() {
        return drinkBar;
    }

    public void setDrinkBar(int drinkBar) {
        this.drinkBar = drinkBar;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "capacity=" + capacity +
                ", toilets=" + toilets +
                ", address='" + address + '\'' +
                ", floors=" + floors +
                ", garage=" + garage +
                ", drinkBar=" + drinkBar +
                '}';
    }
}
