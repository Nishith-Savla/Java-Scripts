public class AgeDetection {
    static void validate(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be greater than 18");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        try {
            validate(17);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
