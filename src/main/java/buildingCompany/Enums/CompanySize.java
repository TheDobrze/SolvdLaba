package buildingCompany.Enums;

public enum CompanySize {
    MICRO("Up to: 25"),
    SMALL("Up to: 100"),
    MEDIUM("Up to: 2500"),
    BIG("Up to: 1000"),
    ENNORMUS("Over: 1000");

    private String size;

    CompanySize(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    @Override
    public String toString() {
        switch (this){
            case SMALL:
                System.out.println("Small company "+ size);
                break;
            case MICRO:
                System.out.println("Micro company "+size);
                break;
            case BIG:
                System.out.println("Big company "+size);
                break;
            case MEDIUM:
                System.out.println("Medium company "+size);
                break;
            case ENNORMUS:
                System.out.println("Ennormus company "+size);
                break;
        }
        return super.toString();
    }
}
