package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;



    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData users_id) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsers_id(users_id.getUser_id());
        System.out.println(users_id.getUser_id());
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();
    }
}
