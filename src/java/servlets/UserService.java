package servlets;

/**
 *
 * @author 734972
 */
public class UserService {
    boolean login(String username, String password) {
        return (username != null && password != null && //not nulls
            !username.equals("") &&!password.equals("") && //not empties
            (username.equals("adam") && password.equals("password") || //check adam is right + password
            username.equals("betty") && password.equals("password"))); //check betty is right + password
    }
}
