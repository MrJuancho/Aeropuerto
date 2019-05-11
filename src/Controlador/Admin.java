package Controlador;

<<<<<<< HEAD
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Spliterator;

=======
>>>>>>> parent of c160520... Files 1.0.1
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
<<<<<<< HEAD


    @Override
    public String toString() {
        return String.format("Usuario: %s\r\nContraseña: %s\r\n",Username,password);
    }
    
    public void GuardarObjeto(boolean sobreescribir){
        File file=new File("Admins.txt");
        try{
            FileWriter fw=new FileWriter(file.getAbsoluteFile(),sobreescribir);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(this.Username);
            bw.newLine();
            bw.write(this.password);
            bw.newLine();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Admin> LeerObjetos(){
        try{
            Scanner lectura = new Scanner(new File("Admins.txt"));
            lectura.useDelimiter("-|\n");

            ArrayList<Admin> admins = new ArrayList<>();
            while (lectura.hasNext()) {
                String username = lectura.next();
                String pass = lectura.next();

                Admin tmp = new Admin(username,pass);
                admins.add(tmp);
            }
            return admins;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
        
    }
=======
>>>>>>> parent of c160520... Files 1.0.1
}
