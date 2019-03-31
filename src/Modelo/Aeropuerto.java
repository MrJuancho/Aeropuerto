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
    

    public void RegistrarUsuario(String nombre, String apellido, String mail, String password, ImageIcon profilePhoto, String userName)
    {
        Usuario nuevo = new Usuario(usuario.size(),nombre,apellido,0,mail,password,profilePhoto,userName,null,null);
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
        usuario.get(ID).setNombre(nombre);
        usuario.get(ID).setApellido(apellido);
        usuario.get(ID).setACoins(ACoins);
        usuario.get(ID).setMail(mail);
        usuario.get(ID).setPassword(password);
        usuario.get(ID).setProfilePhoto(profilePhoto);
        usuario.get(ID).setUserName(userName);
        usuario.get(ID).setCardInformation(cardInformation);
        usuario.get(ID).setElectronicPayment(electronicPayment);
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

    public void AltaCata()
    {
        Admin Cata = new Admin(admin1,"271700",true);
        admin.add(Cata);
    }
    
    public void AltaJuan()
    {
        Admin Juan = new Admin(admin2,"140198",true);
        admin.add(Juan);
    }

    public void Registrarlugares(int ID, int clase, int precio, boolean isAvailable)
    {
        Lugar lugar = new Lugar(ID,clase,precio,isAvailable);
        lugares.add(lugar);
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

    public String getAdmin1() {
        return admin1;
    }

    public String getAdmin2() {
        return admin2;
    }
    
    public void MostrarAviones(){
        for (int i = 0; i < aviones.size(); i++) {
            System.out.println("ID >>> "+i);
            System.out.println("➤ Modelo >>"+aviones.get(i).getModelo());
            System.out.println("➤ Placa  >>"+aviones.get(i).getPlaca());
            System.out.println("➤ Lugares>>"+aviones.get(i).getLugares().size());
            System.out.println("➤ Vuelos >>"+aviones.get(i).getNoVuelos());
            System.out.println("");
        }
    }
    
    public void MostrarUsuarios(){
        for (int i = 0; i < usuario.size(); i++) {
            System.out.println("ID >>> "+i);
            System.out.println("➤ Nombre >>"+usuario.get(i).getNombre();
            System.out.println("➤ Apellidos  >>"+usuario.get(i).getApellido();
            System.out.println("➤ Mail >>"+usuario.get(i).getMail();
            System.out.println("➤ UserName >>"+usuario.get(i).getUserName();
            System.out.println("");
        }
    }
    
    public void MostrarVuelos(){
        for (int i = 0; i < vuelos.size(); i++) {
            System.out.println("ID >>> "+i);
            System.out.println("➤ FlightCode >>"+usuario.get(i).getNombre();
            System.out.println("➤ Destino  >>"+usuario.get(i).getApellido();
            System.out.println("➤ AvionAsignado >>"+usuario.get(i).getMail();
            System.out.println("➤ Lugares Disponibles >>"+usuario.get(i).getUserName();
            System.out.println("");
        }
    }
    
    public void MostrarVuelosRegreso(){
        
    }
    
    public void MostrarLugares(){
        
    }
    
}
