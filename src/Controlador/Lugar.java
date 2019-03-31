package Controlador;

public class Lugar {
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
}
