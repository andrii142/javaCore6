package module10.webinare;

/**
 * Created by citsym on 10.04.17.
 */
public class LoginController {

    LoginService loginService = new LoginService();



    // Security
    public void login(String userName, String password) {


        try {
            loginService.login(userName, password);
        } catch (BussinessException e) {
            System.out.println(e);
            sendEmailToUser();
        }

    }

    private void sendEmailToUser() {
        System.out.println("Email sent");
    }
}
