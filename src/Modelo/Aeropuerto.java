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

    public void RegistrarUsuario(String nombre, String apellido, String mail, String password, ImageIcon profilePhoto, String userName)
    {
        Usuario nuevo = new Usuario(usuario.size()+1,nombre,apellido,0,mail,password,profilePhoto,userName,null,null);
        usuario.add(nuevo);
    }

    public void EliminarUsuario(int ID)
    {
        Usuario eliminar = new Usuario();
        for (int i = 0; i < usuario.size(); i++) {
            if(ID == usuario.get(i).getID())
            {
                usuario.remove(ID);
            }
        }
    }

    public void ModificarUsuario(int ID, String nombre, String apellido, double ACoins, String mail, String password, ImageIcon profilePhoto, String userName, CardInformation cardInformation, ElectronicPayment electronicPayment)
    {
        Usuario modificado = new Usuario();
        modificado = new Usuario(modificado.getID(),nombre,apellido,ACoins,mail,password,profilePhoto,userName,cardInformation,electronicPayment);
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

    public void RegistrarVuelo(int id, String flightCode, String destino, Avion avionAsignado)
    {
        Vuelos registrar = new Vuelos(vuelos.size()+1,flightCode,destino,avionAsignado);
        vuelos.add(registrar);
    }

    public void CancelarVuelo(int id) {
        Vuelos cancelar = new Vuelos();
        for (int i = 0; i < vuelos.size(); i++) {
            if (id == vuelos.get(i).getId()) {
                vuelos.remove(id);
            }
        }
    }

    public void ModificarVuelo(int id, String flightCode, String destino, Avion avionAsignado)
    {
        Vuelos modificar = new Vuelos();
        modificar = new Vuelos(modificar.getId(),flightCode,destino,avionAsignado);
    }

    public void VueloRegreso(String horaLLegada,Avion ALlegada, String procedencia)
    {
        VuelosVuelta regreso = new VuelosVuelta();
        regreso = new VuelosVuelta(horaLLegada,regreso.getID(),ALlegada,procedencia);
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

    public void AltaCata(String username, String password)
    {
        Admin niu = new Admin("CarlosCata","123456",true);
        admin.add(niu);
    }
    
    public void AltaJuan(String username, String password)
    {
        Admin niu = new Admin("Juancho","123456",true);
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


}
