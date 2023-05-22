package buildingCompany.Enums;

public enum Salary {
    SMALL(4000),
    MIDIUM(6000),
    LARGE(8000);

    private int value;

    private Salary(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }
    @Override
    public String toString(){
        switch(this){
            case SMALL:
                System.out.println("Small salary but with benefits"+value);
            break;
            case MIDIUM :
                System.out.println("Medium salary that also comes with benefits"+value);
            break;
            case LARGE :
                System.out.println("Very nice salary"+value);
            break;
        }
        return super.toString();
    }
}
