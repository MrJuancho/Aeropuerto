package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Admin implements Serializable {
    private String Username;
    private String password;
    private boolean isAdmin = true;

    public Admin() {
    }

    public Admin(String username, String password) {
        Username = username;
        this.password = password;
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
    
    public void setFileAdmin(){
        String archivo = "admins.dat";
        try{
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream(archivo));
            escritura.writeObject(this);
            escritura.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public Admin getFileAdmin(){
        String archivo = "admins.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            Admin salida = (Admin) lectura.readObject();
            lectura.close();
            return salida;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
            return null;
        }
    } 
}
