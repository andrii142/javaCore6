package module10.webinare;

/**
 * Created by citsym on 10.04.17.
 */
public class Client {

    static LoginController loginController= new LoginController();

    public static void main(String[] args) {

        loginController.login("VASYA", "dfd");

    }
}
