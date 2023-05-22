package buildingCompany.residental;

public class Hotel extends ResidentalBuilding{

    private int elevator;
    private int pool;
    private int buffet;

    public Hotel(String address, int floors, boolean garage, int capacity, int elevator, int pool, int buffet) {
        super(address, floors, garage, capacity);
        this.elevator = elevator;
        this.pool = pool;
        this.buffet = buffet;
    }

    public int getElevator() {
        return elevator;
    }

    public void setElevator(int elevator) {
        this.elevator = elevator;
    }

    public int getPool() {
        return pool;
    }

    public void setPool(int pool) {
        this.pool = pool;
    }

    public int getBuffet() {
        return buffet;
    }

    public void setBuffet(int buffet) {
        this.buffet = buffet;
    }

    @Override
    public String toString() {
        return "Hotel{" + getAddress()+ ", floors"+ getFloors()+
                ", elevator=" + elevator +
                ", pool=" + pool +
                ", buffet=" + buffet +
                "} " + super.toString();
    }

    @Override
    public void build() {

    }
}
