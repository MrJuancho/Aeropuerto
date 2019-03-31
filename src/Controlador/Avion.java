package Controlador;

import java.util.List;

public class Avion {
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
}
