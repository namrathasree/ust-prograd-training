import java.util.Scanner;

class IllegalUsernameException extends Exception{
    public IllegalUsernameException(String message){
        super(message);
    }
}
class IllegalPasswordException extends Exception{
    public IllegalPasswordException(String message){
        super(message);
    }
}

public class Validation {
    public static void main(String[] args) throws IllegalUsernameException, IllegalPasswordException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        String username=sc.nextLine();
        System.out.println("Enter Password");
        String password=sc.nextLine();

        if(username.length() > 8 && username.length() < 15){
            throw new IllegalUsernameException("Username should be from 8-15 characters");
        }
        char first=username.charAt(0);
        if(!(first >= 65 && first <=90)){
            throw new IllegalUsernameException("Username Should start with A-Z");
        }
        if(password.length() > 8 && password.length() < 256){
            throw new IllegalPasswordException("Password should be from 8-256 characters");
        }
        if(username.contains(" ")){
            throw new IllegalUsernameException("Username should not contain spaces");
        }
        if(password.contains(" ")){
            throw new IllegalPasswordException("Password should not contain spaces");
        }
        if(username.contains("(") || username.contains(")") || username.contains("{") || username.contains("}")){
            throw new IllegalUsernameException("Username should not contain paranthesis");
        }
        if(password.contains("(") || username.contains(")") || password.contains("{") || password.contains("}")){
            throw new IllegalPasswordException("Password should not contain paranthesis");
        }
        if(password.contains(username)){
            throw new IllegalPasswordException("Password should not contain or same as Username");
        }

    }
}

