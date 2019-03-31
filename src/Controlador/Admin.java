package Controlador;

public class Admin {
    private String Username;
    private String password;
    private boolean isAdmin = true;

    public Admin() {
    }

    public Admin(String username, String password, boolean isAdmin) {
        Username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
