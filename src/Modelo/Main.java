package Modelo;

import Controlador.Admin;
import Controlador.CardInformation;
import Controlador.ElectronicPayment;
import Vista.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Main{
    
    static Scanner teclado = new Scanner(System.in);
    static List<Admin> admin = new ArrayList<Admin>();
    static String admin1 = "CarlosCata";
    static String admin2 = "Juancho";
    
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
        
        Admin Cata = new Admin(admin1,"270798",true);
        admin.add(Cata);
        
        Admin Juan = new Admin(admin2,"140198",true);
        admin.add(Juan);
        
        do
        {
            System.out.println("APEX FLIGHTS");
            System.out.println("Login");
            System.out.println("Inserte su nombre de usuario");
            usuario = teclado.nextLine();
            System.out.println("Contraseña:");
            password = teclado.nextLine();
            
            if(usuario.equals(admin1)||usuario.equals(admin2))
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
                            bandera = false;
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
            
        }while(!bandera);
    }
}