package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ElectronicPayment implements Serializable{
    private String provider;
    private String mail;
    private String password;
    private int fondos; 

    public ElectronicPayment() {
    }

    public ElectronicPayment(String provider, String mail, String password, int fondos) {
        this.provider = provider;
        this.mail = mail;
        this.password = password;
        this.fondos = fondos;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }
    
    public void setFileEPayment(ArrayList<ElectronicPayment> electronicPayment){
        String archivo = "electronicos.dat";
        electronicPayment.add(this);
        try{
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream(archivo));
            escritura.writeObject(electronicPayment);
            escritura.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<ElectronicPayment> getFileEPayment(){
        String archivo = "electronicos.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            ArrayList<ElectronicPayment> salida = (ArrayList<ElectronicPayment>) lectura.readObject();
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
