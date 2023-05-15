package buildingCompany.assembly;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return kitchen == that.kitchen && drinkBar == that.drinkBar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kitchen, drinkBar);
    }



    @Override
    public String toString() {
        return "Restaurant{" +
                "kitchen=" + kitchen +
                ", drinkBar=" + drinkBar +
                "} " + super.toString();
    }

    @Override
    public void build() {

    }
}
