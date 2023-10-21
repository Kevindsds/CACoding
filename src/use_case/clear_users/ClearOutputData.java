package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private ArrayList<String> user_id;
    public ClearOutputData(ArrayList<String> user_id){
        this.user_id = user_id;
    }

    public ArrayList<String> getUser_id(){
        return user_id;
    }

}
