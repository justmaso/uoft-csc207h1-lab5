package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    private final String username;

    public LogoutInputData(String username) {
        // saves the current username in an instance variable and add a getter.
        this.username = username;
    }

    /**
     * Returns the username that is loggin out.
     * @return the current username.
     */
    public String getUsername() {
        return this.username;
    }

}
