package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Avion implements Serializable {
    private String modelo;
    private int NoVuelos;
    private String placa;
    private List<Lugar> lugares;

    public Avion() {
    }

    public Avion(String modelo, int noVuelos, String placa) {
        this.modelo = modelo;
        NoVuelos = noVuelos;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNoVuelos() {
        return NoVuelos;
    }

    public void setNoVuelos(int noVuelos) {
        NoVuelos = noVuelos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }
    
    public void setFileAvion(ArrayList<Avion> avion){
        String archivo = "aviones.dat";
        avion.add(this);
        try{
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream(archivo));
            escritura.writeObject(avion);
            escritura.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Avion> getFileAvion(){
        String archivo = "aviones.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            ArrayList<Avion> salida = (ArrayList<Avion>) lectura.readObject();
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
