package web.service;

/**
 * Business logic to handle login functions.
 */
public class LoginService {

    /**
     * Validates username, password, and date of birth.
     */
    public static boolean isValid(String username, String password, String dob) {
        if (username == null || password == null || dob == null) {
            return false;
        }

        return username.equals("ritik") &&
               password.equals("ritik_pass") &&
               dob.equals("2000-01-01");
    }
}
