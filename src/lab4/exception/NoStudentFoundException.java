package lab4.exception;

public class NoStudentFoundException extends RuntimeException {
    public NoStudentFoundException(String message) {
        super(message);
    }
}
