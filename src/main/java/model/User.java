package model;

public class User {
    private String username;
    private String password;
   // private int U_id;

    public User(String username, String password) {}

    public User(String username, String password, int userid) {
        this.username = username;
        this.password = password;
       // this.U_id = userid;
    }

    public String getUsername() {
        return username; // no need to create username1 variable
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password; // fixed
    }
//
//    public int getU_id() {
//        return U_id;
//    }
//
//    public void setU_id(int U_id) {
//        this.U_id = U_id;
//    }


}
