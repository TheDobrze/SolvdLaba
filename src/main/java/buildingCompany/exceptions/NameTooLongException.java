package buildingCompany.exceptions;

public class NameTooLongException extends Exception{

    public NameTooLongException(String errorMsg) {
        super(errorMsg);
    }
}
