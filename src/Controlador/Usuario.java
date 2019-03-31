package Controlador;

import javax.swing.*;

public class Usuario {
    private int ID;
    private String nombre;
    private String apellido;
    private double ACoins;
    private String mail;
    private String password;
    private ImageIcon profilePhoto;
    private String UserName;
    private CardInformation cardInformation;
    private ElectronicPayment electronicPayment;
    private boolean isAdmin = false;

    public Usuario() {}

    public Usuario(int ID, String nombre, String apellido, double ACoins, String mail, String password, ImageIcon profilePhoto, String userName, CardInformation cardInformation, ElectronicPayment electronicPayment) {
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

    public void setACoins(double ACoins) {
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

    public ImageIcon getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(ImageIcon profilePhoto) {
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

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}