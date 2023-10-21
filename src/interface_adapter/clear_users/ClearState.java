package interface_adapter.clear_users;

// TODO Complete me

import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> users_id = new ArrayList<String>();

    public ClearState(ClearState copy){
        users_id = copy.users_id;
    }

    public ClearState() {}

    public ArrayList<String> get_users_id(){
        return users_id;
    }

    public void setUsers_id(ArrayList<String> users_id){
        this.users_id = users_id;
    }
}
