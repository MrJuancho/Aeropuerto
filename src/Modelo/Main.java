package Modelo;

import Controlador.CardInformation;
import Controlador.ElectronicPayment;
import Vista.Principal;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Main{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        Principal v = new Principal();
        v.setVisible(true);
        String m,usuario,password,nombre,apellido,mail,UserName;
        int ID;
        double ACoins;
        CardInformation cardInformation;
        ElectronicPayment electronicPayment;
        boolean isAdmin = false;
        boolean bandera = true;
        ImageIcon profilePhoto;
        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.AltaCata();
        aeropuerto.AltaJuan();
        
        do
        {
            System.out.println("APEX FLIGHTS");
            System.out.println("Login");
            System.out.println("Inserte su nombre de usuario");
            usuario = teclado.nextLine();
            System.out.println("Contraseña:");
            password = teclado.nextLine();
            
            if(usuario == aeropuerto.getAdmin1()||usuario == aeropuerto.getAdmin2())
            {
                do
                {
                    System.out.println("Cual es la operacion que deseas realizar:");
                    System.out.println("1 >> Vuelos");
                    System.out.println("2 >> Aviones");
                    System.out.println("3 >> Usuarios");
                    System.out.println("0 >> Salir");
                    m = teclado.nextLine();
                    
                    switch (m)
                    {
                        case "1":
                            funciones.adminVuelos();
                            break;
                            
                        case "2":
                            funciones.adminaviones();
                            break;
                            
                        case "3":
                            funciones.adminUsuarios();
                            break;
                            
                        case "0":
                            System.out.println("Good Lucky");
                            break;
                            
                        default:
                            System.out.println("Inserte una opcion valida");
                            break;
                    }
                }while(m!="0");
            }
            else
            {
                System.out.println("Usuario no registrado, a continuacion inserte sus datos para darlo de alta");
                System.out.println("Nombre:");
                nombre = teclado.nextLine();
                System.out.println("Apellidos:");
                apellido = teclado.nextLine();
                System.out.println("Email:");
                mail = teclado.nextLine();
                System.out.println("Nombre de Usuario:");
                UserName = teclado.nextLine();
                System.out.println("Contraseña:");
                password = teclado.nextLine();
                aeropuerto.RegistrarUsuario(nombre, apellido, mail, password,null, UserName);
                
                do
                {
                    System.out.println("Cual es la operacion que deseas realizar:");
                    System.out.println("1 >> Vuelos");
                    System.out.println("2 >> Aviones");
                    System.out.println("3 >> Usuarios");
                    System.out.println("0 >> Salir");
                    m = teclado.nextLine();
                    
                    switch (m)
                    {
                        case "1":
                            funciones.adminvuelos();
                            break;
                            
                        case "2":
                            funciones.adminaviones();
                            break;
                            
                        case "3":
                            funciones.adminusuarios();
                            break;
                            
                        case "0":
                            System.out.println("Good Lucky");
                            break;
                            
                        default:
                            System.out.println("Inserte una opcion valida");
                            break;
                    }
                }while(m!="0");
            }
            
        }while(!bandera);
    }
    
}

