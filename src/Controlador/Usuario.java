package Controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Usuario implements Serializable{
    private int ID;
    private String nombre;
    private String apellido;
    private int ACoins;
    private String mail;
    private String password;
    private String profilePhoto;
    private String UserName;
    private CardInformation cardInformation;
    private ElectronicPayment electronicPayment;
    private boolean isAdmin = false;

    public Usuario() {}
    
    public Usuario(int ID, String nombre, String apellido, int ACoins, String mail, String password, String profilePhoto, String userName, CardInformation cardInformation, ElectronicPayment electronicPayment) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ACoins = ACoins;
        this.mail = mail;
        this.password = password;
        this.profilePhoto = profilePhoto;
        UserName = userName;
        this.cardInformation = cardInformation;
        this.electronicPayment = electronicPayment;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getACoins() {
        return ACoins;
    }

    public void setACoins(int ACoins) {
        this.ACoins = ACoins;
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

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public CardInformation getCardInformation() {
        return cardInformation;
    }

    public void setCardInformation(CardInformation cardInformation) {
        this.cardInformation = cardInformation;
    }

    public ElectronicPayment getElectronicPayment() {
        return electronicPayment;
    }

    public void setElectronicPayment(ElectronicPayment electronicPayment) {
        this.electronicPayment = electronicPayment;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
    
    public void setFileUser(){
        String archivo = "users.dat";
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
    
    public Usuario getFileUSer(){
        String archivo = "users.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            
            Usuario salida = (Usuario) lectura.readObject();
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