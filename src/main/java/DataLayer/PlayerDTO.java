package DataLayer;

public class PlayerDTO {

    int ID;
    String Username;
    String Password;

    public PlayerDTO(int ID, String Username, String Password){
        this.Username = Username;
        this.Password = Password;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
