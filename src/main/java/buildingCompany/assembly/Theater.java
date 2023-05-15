package buildingCompany.assembly;

import java.util.Objects;

public class Theater extends AssemblyBuilding{

    private int screeningRoom;
    private boolean popcornBooth;

    public Theater(String address, int floors, boolean garage, int capacity,int toilets,int screeningRoom,boolean popcornBooth) {
        super(address, floors, garage, capacity,toilets);
        this.screeningRoom = screeningRoom;
        this.popcornBooth=popcornBooth;
    }

    public int getScreeningRoom() {
        return screeningRoom;
    }

    public void setScreeningRoom(int screeningRoom) {
        this.screeningRoom = screeningRoom;
    }

    public boolean isPopcornBooth() {
        return popcornBooth;
    }

    public void setPopcornBooth(boolean popcornBooth) {
        this.popcornBooth = popcornBooth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theater theater = (Theater) o;
        return screeningRoom == theater.screeningRoom && popcornBooth == theater.popcornBooth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(screeningRoom, popcornBooth);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "screeningRoom=" + screeningRoom +
                ", popcornBooth=" + popcornBooth +
                "} " + super.toString();
    }

    @Override
    public void build() {

    }
}
