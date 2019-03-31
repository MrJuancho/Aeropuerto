package Controlador;

public class VuelosVuelta {
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
    
    
}
