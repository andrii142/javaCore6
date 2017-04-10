package module10.webinare;

/**
 * Created by citsym on 10.04.17.
 */
public class LoginService {

    // Dao

    public void login(String userName, String password) {

        // if user exists
        // save to db
        if (password.length() < 4){
            throw new InvalidPasswordException("YOUR password is invalid");
        }

        System.out.println("Login successes");
    }

}
