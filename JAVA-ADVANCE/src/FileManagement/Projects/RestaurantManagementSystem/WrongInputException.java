package FileManagement.Projects.RestaurantManagementSystem;

public class WrongInputException extends RuntimeException{
    public WrongInputException(String message){
        super(message);
    }
}
