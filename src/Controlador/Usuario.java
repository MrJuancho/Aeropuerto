package Controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Usuario {
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

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "ID: "+ID+"\r\n"
                + "Usuario: "+UserName+"\r\n"
                + "Contraseña: "+password+"\r\n"
                + "Nombre(s): "+nombre+"\r\n"
                + "Apellidos: "+apellido+"\r\n"
                + "Correo: "+mail+"\r\n"
                + "URLPhoto: "+profilePhoto+"\r\n"
                + "Card Information: \r\n"
                + "\tCard Number: "+cardInformation.getCardNumber()+"\r\n"
                + "\tCCV: "+cardInformation.getCCV()+"\r\n"
                + "\tExp Date: "+cardInformation.getExpDate()+"\r\n"
                + "\tFondos: "+cardInformation.getFondos()+"\r\n"
                + "Electronic Payment:\r\n"
                + "\tProvider: "+electronicPayment.getProvider()+"\r\n"
                + "\tMail: "+electronicPayment.getMail()+"\r\n"
                + "\tPassword: "+electronicPayment.getPassword()+"\r\n"
                + "\tFondos: "+electronicPayment.getFondos()+"\r\n"
                + "Apex Coins: "+ACoins+"\r\n";
    }
    
   public void GuardarObjeto(boolean sobreescribir){
        File file=new File("Usuarios.txt");
        try{
            FileWriter fw=new FileWriter(file.getAbsoluteFile(),sobreescribir);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(String.format("%d", this.ID));
            bw.newLine();
            bw.write(this.UserName);
            bw.newLine();
            bw.write(this.password);
            bw.newLine();
            bw.write(this.nombre);
            bw.newLine();
            bw.write(this.apellido);
            bw.newLine();
            bw.write(this.mail);
            bw.newLine();
            bw.write(this.profilePhoto);
            bw.newLine();
            if(cardInformation != null){
            bw.write(this.cardInformation.getCardNumber());
            bw.newLine();
            bw.write(this.cardInformation.getCCV());
            bw.newLine();
            bw.write(this.cardInformation.getExpDate());
            bw.newLine();
            bw.write(String.format("%d", this.cardInformation.getFondos()));
            bw.newLine();
            }else{
                bw.write("");
                bw.newLine();
                bw.write("");
                bw.newLine();
                bw.write("");
                bw.newLine();
                bw.write(String.format("%d",0));
                bw.newLine();
            }
            if(electronicPayment != null){
            bw.write(this.electronicPayment.getProvider());
            bw.newLine();
            bw.write(this.electronicPayment.getMail());
            bw.newLine();
            bw.write(this.electronicPayment.getPassword());
            bw.newLine();
            bw.write(String.format("%d", this.electronicPayment.getFondos()));
            bw.newLine();
            }else{
                bw.write("");
                bw.newLine();
                bw.write("");
                bw.newLine();
                bw.write("");
                bw.newLine();
                bw.write(String.format("%d",0));
                bw.newLine();
            }
            bw.write(String.format("%d",this.ACoins));
            bw.newLine();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Usuario> LeerObjetos(){
        try{
            Scanner lectura = new Scanner(new File("Usuarios.txt"));
            lectura.useDelimiter("-|\n");

            ArrayList<Usuario> usuarios = new ArrayList<>();
            while (lectura.hasNext()) {
                String Id = lectura.next();
                String user = lectura.next();
                String pass = lectura.next();
                String name = lectura.next();
                String lname = lectura.next();
                String mail = lectura.next();
                String URLPhoto = lectura.next();
                String CNumber = lectura.next();
                String CCV = lectura.next();
                String ExpD = lectura.next();
                String fondos = lectura.next();
                String prov = lectura.next();
                String maile = lectura.next();
                String passe = lectura.next();
                String felectronic = lectura.next();
                String AC = lectura.next();
                
                int id,fe,fo,ac;
                fe = Integer.parseInt(felectronic.trim());
                fo = Integer.parseInt(fondos.trim());
                id = Integer.parseInt(Id.trim());
                ac = Integer.parseInt(AC.trim());
                
                ElectronicPayment etmp = new ElectronicPayment(prov,maile,passe,fe);
                CardInformation ctmp = new CardInformation(CNumber, ExpD, CCV,fo);
                
                Usuario tmp = new Usuario(id,name,lname,ac,mail,pass,URLPhoto,user,ctmp,etmp);
                usuarios.add(tmp);
            }
            return usuarios;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
        
    }
}