package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupOutputData;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        ArrayList<String> users_id= userDataAccessObject.get_users_id();
        userDataAccessObject.delete();
        ClearOutputData clearOutputData = new ClearOutputData(users_id);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
