package Controlador;

import java.util.Date;

public class Vuelos {
    private int id;
    private String FlightCode;
    private String Destino;
    private Avion AvionAsignado;
    private int lugaresDisp;
    private Date horaAbordaje;

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

    public Date getHoraAbordaje() {
        return horaAbordaje;
    }

    public void setHoraAbordaje(Date horaAbordaje) {
        this.horaAbordaje = horaAbordaje;
    }

    public int getLugaresDisp(){ return AvionAsignado.getLugares().size(); }
}
