package Modelo;

import Controlador.Avion;
import Controlador.CardInformation;
import Controlador.ElectronicPayment;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Funciones {
   static Scanner teclado = new Scanner(System.in);
   
    public static void adminVuelos()
    {
        String flightcode,destino,avionAsignado,m;
        Avion avionA;
        Aeropuerto aeropuerto = new Aeropuerto();
        int id;
        do
        {
            System.out.println("¿Qué operacion deseas realizar?");
            System.out.println("1 >> Registrar Vuelo");
            System.out.println("2 >> Modificar Vuelo");
            System.out.println("3 >> Cancelar Vuelo");
            System.out.println("0 >> Regresar");
            m = teclado.nextLine();
            
            switch(m){
                case "1":
                    System.out.println("LLena el siguiente Registro...");
                    System.out.print("Code Flight: ");
                    String codeReg = teclado.nextLine();
                    System.out.print("Destino: ");
                    String desReg = teclado.nextLine();
                    System.out.print("Hora de Abordaje: ");
                    String hora = teclado.nextLine();
                    System.out.println("Avion Asignado: ");
                    System.out.println("Selecciona el avion a continuacion...");
                    for (int i = 0; i < aeropuerto.getAviones().size(); i++) {
                        
                    }
                    break;
                case "2":
                    System.out.println(" # de Vuelo  ||  Destino || "
                            + "Hora de Abordaje || Lugares Disponibles || "
                            + "Avion Asignado");
                    for (int i = 0; i < aeropuerto.getVuelos().size(); i++) {
                        System.out.println(" "+aeropuerto.getVuelos().get(i).getFlightCode()+
                                " || "+aeropuerto.getVuelos().get(i).getDestino()+
                                " || "+aeropuerto.getVuelos().get(i).getHoraAbordaje()+
                                " || "+aeropuerto.getVuelos().get(i).getLugaresDisp()+
                                " || "+aeropuerto.getVuelos().get(i).getAvionAsignado().getPlaca());
                    }
                    System.out.println("Codigo de vuelo: ");
                    String nVuelo = teclado.nextLine();
                    System.out.println("Destino: ");
                    String destinoMod = teclado.nextLine();
                    System.out.println("Hora de Abordaje:");
                    String horaMod = teclado.nextLine();
                    break;
                case "3":
                    System.out.println("Vuelo a dar de baja");
                    break;
            }
        }while(m!="0");
    }
    
    public static void adminaviones()
    {
        
    }
    
    public static void adminUsuarios()
    {
        String m,nombre,apellido,mail,password,userName;
        CardInformation cardInformation;
        ElectronicPayment electronicPayment;
        int ID;
        double ACoins;
        Aeropuerto aeropuerto = new Aeropuerto();
        
        do
        {
            System.out.println("¿Que operacion deseas realizar?");
            System.out.println("1 >> Baja de usuario");
            System.out.println("2 >> Modificacion de usuario");
            System.out.println("0 >> Regresar");
            m = teclado.nextLine();
            switch(m)
            {
                case "1":
                    System.out.println("ID || Nombre(s) || Apellidos");
                    for (int i = 0; i < aeropuerto.getUsuario().size(); i++) {
                        System.out.println(""+aeropuerto.getUsuario().get(i).getID()+" || "+aeropuerto.getUsuario().get(i).getNombre()+" || "+aeropuerto.getUsuario().get(i).getApellido()+"");
                    }
                    System.out.println("Numero Identificador");
                    ID = teclado.nextInt();
                    aeropuerto.EliminarUsuario(ID);
                    break;
                    
                case "2":
                    System.out.println("ID || Nombre(s) || Apellidos");
                    for (int i = 0; i < aeropuerto.getUsuario().size(); i++) {
                        System.out.println(""+aeropuerto.getUsuario().get(i).getID()+" || "+aeropuerto.getUsuario().get(i).getNombre()+" || "+aeropuerto.getUsuario().get(i).getApellido()+"");
                    }
                    System.out.println("Numero Identificador");
                    ID = teclado.nextInt();
                    System.out.println("Nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Apellido:");
                    apellido = teclado.nextLine();
                    System.out.println("Apex Coins:");
                    ACoins = teclado.nextDouble();
                    System.out.println("Email:");
                    mail = teclado.nextLine();
                    System.out.println("Password:");
                    password = teclado.nextLine();
                    System.out.println("URL Imagen de perfil:");
                    String URL = teclado.nextLine();
                    ImageIcon ProfilePhoto = new ImageIcon(URL);
                    System.out.println("Nombre de usuario:");
                    userName = teclado.nextLine();
                    aeropuerto.ModificarUsuario(ID, nombre, apellido, ACoins, mail, password, ProfilePhoto, userName, aeropuerto.getUsuario().get(ID).getCardInformation(), aeropuerto.getUsuario().get(ID).getElectronicPayment());
                    break;
                    
                case "0":
                    System.out.println("Regresando");
                    break;
                   
                default: 
                    System.out.println("Inserte una opcion valida");
            }
        }while(m!="0");
    }
    
    public void mortalVuelos()
    {
        Aeropuerto aeropuerto = new Aeropuerto();
        String m;
        do
        {
            System.out.println("¿Qué operacion desea realizar?");
            System.out.println("1 >> Vuelos Salida");
            System.out.println("2 >> Ver Vuelos de Llegada");
            System.out.println("0 >> Regresar");
            m = teclado.nextLine();
            switch(m)
            {
                case "1":
                    System.out.println("Ingrese la opcion deseada");
                    System.out.println("1 >> Ver vuelos de salida");
                    System.out.println("2 >> Comprar Vuelo");
                    System.out.println("0 >> Regresar");
                    m = teclado.nextLine();
                    switch (m)
                    {
                        case "1":
                            System.out.println("  ID  ||  Flight Code || Destino || Avion Asignado");
                            for (int i = 0; i < aeropuerto.getVuelos().size(); i++) {
                                System.out.println(""+aeropuerto.getVuelos().get(i).getId()+"  ||  "+aeropuerto.getVuelos().get(i).getFlightCode()+"  ||  "+aeropuerto.getVuelos().get(i).getDestino()+"  ||  "+aeropuerto.getVuelos().get(i).getAvionAsignado());
                            }
                            break;
                            
                        case "2":
                            
                            break;
                            
                        case "0":
                            break;
                    }
                    break;
                    
                case "2":
                    break;
                    
                case "0":
                    break;
                    
                default:
                    System.out.println("Inserte una opcion valida");
                    break;
            }
        }while(m!="0");
    }
    
    public void mortalPagos()
    {
        
    }
}

