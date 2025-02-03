package _13_exception_handling;

//checked exception
public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
    }

    public InvalidAgeException(String str) {
        super(str);
    }
}
