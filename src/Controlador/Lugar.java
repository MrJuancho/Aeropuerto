package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Lugar implements Serializable {
    private int ID;
    private int Clase;
    private int precio;
    private boolean isAvailable;

    public Lugar() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getClase() {
        return Clase;
    }

    public void setClase(int clase) {
        Clase = clase;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Lugar(int ID, int clase, int precio, boolean isAvailable) {
        this.ID = ID;
        Clase = clase;
        this.precio = precio;
        this.isAvailable = isAvailable;
    }
    
    public void setFileLugar(ArrayList<Lugar> lugar){
        String archivo = "lugares.dat";
        lugar.add(this);
        try{
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream(archivo));
            escritura.writeObject(lugar);
            escritura.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Lugar> getFileLugar(){
        String archivo = "lugares.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            ArrayList<Lugar> salida = (ArrayList<Lugar>) lectura.readObject();
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
