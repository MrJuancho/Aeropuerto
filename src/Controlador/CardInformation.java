package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CardInformation implements Serializable{
    private String CardNumber;
    private String expDate;
    private String CCV;
    private int Fondos;

    public CardInformation() {
    }

    public CardInformation(String cardNumber, String expDate, String CCV, int fondos) {
        CardNumber = cardNumber;
        this.expDate = expDate;
        this.CCV = CCV;
        this.Fondos = fondos;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCCV() {
        return CCV;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }

    public int getFondos() {
        return Fondos;
    }

    public void setFondos(int Fondos) {
        this.Fondos = Fondos;
    }
    
    public void setFileCard(){
        String archivo = "credit_cards.dat";
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
    
    public CardInformation getFileCard(){
        String archivo = "credit_cards.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            CardInformation salida = (CardInformation) lectura.readObject();
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
