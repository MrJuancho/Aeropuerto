package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Vuelos implements Serializable{
    private int id;
    private String FlightCode;
    private String Destino;
    private Avion AvionAsignado;
    private int lugaresDisp;
    private String horaAbordaje;

    public Vuelos() {
    }

    public Vuelos(int id, String flightCode, String destino, Avion avionAsignado) {
        this.id = id;
        FlightCode = flightCode;
        Destino = destino;
        AvionAsignado = avionAsignado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightCode() {
        return FlightCode;
    }

    public void setFlightCode(String flightCode) {
        FlightCode = flightCode;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public Avion getAvionAsignado() {
        return AvionAsignado;
    }

    public void setAvionAsignado(Avion avionAsignado) {
        AvionAsignado = avionAsignado;
    }

    public String getHoraAbordaje() {
        return horaAbordaje;
    }

    public void setHoraAbordaje(String horaAbordaje) {
        this.horaAbordaje = horaAbordaje;
    }

    public int getLugaresDisp(){ return AvionAsignado.getLugares().size(); }
    
    public void setFileVuelo(ArrayList<Vuelos> vuelos){
        String archivo = "vuelos.dat";
        vuelos.add(this);
        try{
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream(archivo));
            escritura.writeObject(vuelos);
            escritura.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Vuelos> getFileVuelo(){
        String archivo = "vuelos.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            ArrayList<Vuelos> salida = (ArrayList<Vuelos>) lectura.readObject();
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
