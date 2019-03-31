package Modelo;

import Controlador.*;
import javax.swing.*;
import java.util.List;

public class Aeropuerto {
    private List<Avion> aviones;
    private List<Vuelos> vuelos;
    private List<Usuario> usuario;
    private List<VuelosVuelta> regreso;
    private List<Admin> admin;
    private List<Lugar> lugares;
    private String admin1 = "CarlosCata";
    private String admin2 = "Juancho";

    public void RegistrarUsuario(String nombre, String apellido, String mail, String password,String userName)
    {
        Usuario nuevo = new Usuario(usuario.size()+1,nombre,apellido,0,mail,password,null,userName,null,null);
        usuario.add(nuevo);
    }

    public void EliminarUsuario(int ID)
    {
        Usuario eliminar = new Usuario();
        for (int i = 0; i < usuario.size(); i++) {
            if(ID-1 == usuario.get(i).getID())
            {
                usuario.remove(ID-1);
            }
        }
    }

    public void ModificarUsuario(int ID, String nombre, String apellido, double ACoins, String mail, String password, ImageIcon profilePhoto, String userName, CardInformation cardInformation, ElectronicPayment electronicPayment)
    {
        Usuario modificado = new Usuario();
        modificado = new Usuario(usuario.get(ID-1).getID(),nombre,apellido,ACoins,mail,password,profilePhoto,userName,cardInformation,electronicPayment);
        usuario.add(modificado);
    }

    public void RegistrarAvion(String modelo, int noVuelos, String placa,Lugar lugar)
    {
        Avion nuevo = new Avion(modelo,noVuelos,placa);
        aviones.add(nuevo);
    }

    public void EliminarAvion(String Placa)
    {
        Avion eliminar= new Avion();
        for (int i = 0; i < aviones.size(); i++) {
            if(eliminar.getPlaca().equals(Placa))
            {
                aviones.remove(Placa);
            }
        }
    }

    public void RegistrarVuelo(String flightCode, String destino, Avion avionAsignado)
    {
        Vuelos registrar = new Vuelos(vuelos.size()+1,flightCode,destino,avionAsignado);
        vuelos.add(registrar);
    }

    public void CancelarVuelo(int id) {
        Vuelos cancelar = new Vuelos();
        for (int i = 0; i < vuelos.size(); i++) {
            if (id-1 == vuelos.get(i).getId()) {
                vuelos.remove(id-1);
            }
        }
    }

    public void ModificarVuelo(int id, String flightCode, String destino, Avion avionAsignado)
    {
        Vuelos modificar = new Vuelos();
        modificar = new Vuelos(vuelos.get(id-1).getId(),flightCode,destino,avionAsignado);
        vuelos.add(modificar);
    }

    public void VueloRegreso(String horaLLegada,Avion ALlegada, String procedencia)
    {
        VuelosVuelta regreso = new VuelosVuelta();
        regreso = new VuelosVuelta(horaLLegada,this.regreso.size()+1,ALlegada,procedencia);
        this.regreso.add(regreso);
    }

    public void BajaVueloVuelta(int id)
    {
        VuelosVuelta baja = new VuelosVuelta();
        for (int i = 0; i < regreso.size(); i++) {
            if(id == regreso.get(i).getID())
            {
                regreso.remove(id);
            }
        }
    }

    public void AltaCata()
    {
        Admin niu = new Admin(admin1,"123456",true);
        admin.add(niu);
    }
    
    public void AltaJuan()
    {
        Admin niu = new Admin(admin2,"123456",true);
        admin.add(niu);
    }

    public void Registrarlugares(int ID, int clase, int precio, boolean isAvailable)
    {
        Lugar lugar = new Lugar(ID,clase,precio,isAvailable);
        lugares.add(lugar);
    }

    public void BajaLugares(int ID){
        Lugar lugar = new Lugar();
        for (int i = 0; i < lugares.size(); i++) {
            if(ID == lugares.get(i).getID())
            {
                lugares.remove(ID);
            }
        }
    }

    public String getAdmin1() {
        return admin1;
    }

    public String getAdmin2() {
        return admin2;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public List<Vuelos> getVuelos() {
        return vuelos;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public List<VuelosVuelta> getRegreso() {
        return regreso;
    }

    public List<Admin> getAdmin() {
        return admin;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }
    
    
}
