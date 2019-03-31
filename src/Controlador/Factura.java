package Controlador;

import java.util.Date;

public class Factura {
    private int ID;
    private Usuario Contribuyente;
    private Date fecha_venta;
    private String Empresa = "ApexFligths S.A. de C.V.";
    private Avion VueloComprado;

    public Factura() {
    }

    public Factura(int ID, Usuario contribuyente, Date fecha_venta, String empresa, Avion vueloComprado) {
        this.ID = ID;
        Contribuyente = contribuyente;
        this.fecha_venta = fecha_venta;
        Empresa = empresa;
        VueloComprado = vueloComprado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getContribuyente() {
        return Contribuyente;
    }

    public void setContribuyente(Usuario contribuyente) {
        Contribuyente = contribuyente;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public Avion getVueloComprado() {
        return VueloComprado;
    }

    public void setVueloComprado(Avion vueloComprado) {
        VueloComprado = vueloComprado;
    }
}
