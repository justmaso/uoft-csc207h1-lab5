package use_case.logout;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {
    private LogoutUserDataAccessInterface userDataAccessObject;
    private LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        // saves the DAO and Presenter in the instance variables.
        this.userDataAccessObject = userDataAccessInterface;
        this.logoutPresenter = logoutOutputBoundary;
        // Which parameter is the DAO and which is the presenter?
    }

    @Override
    public void execute(LogoutInputData logoutInputData) {
        // implement the logic of the Logout Use Case (depends on the LogoutInputData.java)
        // gets the username out of the input data,
        final String username = logoutInputData.getUsername();
        // sets the username to null in the DAO
        this.userDataAccessObject.setCurrentUsername(null);
        // instantiates the `LogoutOutputData`, which needs to contain the username.
        final LogoutOutputData logoutOutputData = new LogoutOutputData(username, false);
        // tells the presenter to prepare a success view.
        logoutPresenter.prepareSuccessView(logoutOutputData);
    }
}

