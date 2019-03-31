package Modelo;

import Controlador.Avion;
import java.util.Scanner;

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
                    System.out.println("Codigo de Vuelo:");
                    flightcode = teclado.nextLine();
                    System.out.println("Destino:");
                    destino = teclado.nextLine();
                    System.out.println("Avion Asignado:");
                    avionA = new Avion();
                    break;
                    
                case "2":
                    System.out.println("  # de Vuelo  ||  Destino  ");
                    for (int i = 0; i < aeropuerto.getVuelos().size(); i++) {
                        System.out.println(""+aeropuerto.getVuelos().get(i));
                    }
                    System.out.println("Numero de vuelo");
                    id = teclado.nextInt();
                    System.out.println("Codigo de Vuelo:");
                    flightcode = teclado.nextLine();
                    System.out.println("Destino:");
                    destino = teclado.nextLine();
                    System.out.println("Avion Asignado:");
                    avionA = new Avion();
                    aeropuerto.ModificarVuelo(id, flightcode, destino, avionA);
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
    
    public static void adminusuarios()
    {
        String m,nombre,apellido,mail,password,userName;
        
        int ID;
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
                    
                    
                    break;
                    
                case "0":
                    break;
                   
                default: 
                    System.out.println("");
            }
        }while(m!="0");
    }
}

