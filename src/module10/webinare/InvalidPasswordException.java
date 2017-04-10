package module10.webinare;

/**
 * Created by citsym on 10.04.17.
 */
public class InvalidPasswordException extends BussinessException {

    public InvalidPasswordException() {
    }

    public InvalidPasswordException(String message) {
        super(message);
    }
}
