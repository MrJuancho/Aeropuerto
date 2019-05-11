package Controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Factura implements Serializable {
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
    
    public void setFileFactura(){
        String archivo = "facturas.dat";
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
    
    public Factura getFileFactura(){
        String archivo = "facturas.dat";
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
            Factura salida = (Factura) lectura.readObject();
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
