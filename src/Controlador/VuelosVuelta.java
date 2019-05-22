package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class VuelosVuelta implements Serializable {
    private String horaLLegada;
    private int ID;
    private Avion ALlegada;
    private String Procedencia;

    public VuelosVuelta() {
    }

    public VuelosVuelta(String horaLLegada, int ID, Avion ALlegada, String Procedencia) {
        this.horaLLegada = horaLLegada;
        this.ID = ID;
        this.ALlegada = ALlegada;
        this.Procedencia = Procedencia;
    }

    public String getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Avion getALlegada() {
        return ALlegada;
    }

    public void setALlegada(Avion ALlegada) {
        this.ALlegada = ALlegada;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }
    
    public void setFileVVuelata(ArrayList<VuelosVuelta> vuelosVuelta){
        String archivo = "admins.dat";
        vuelosVuelta.add(this);
        try{
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream(archivo));
            escritura.writeObject(vuelosVuelta);
            escritura.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<VuelosVuelta> getFileVVuelta(){
        String archivo = "admins.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            ArrayList<VuelosVuelta> salida = (ArrayList<VuelosVuelta>) lectura.readObject();
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
