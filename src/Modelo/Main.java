package Modelo;

import Controlador.Admin;
import Controlador.CardInformation;
import Controlador.ElectronicPayment;
import Controlador.Usuario;
import Vista.Principal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Main{
    
    public static void main(String[] args) {
        Admin Juan = new Admin();
        Admin Cata = new Admin();
        Juan.setUsername("MrJuancho");
        Cata.setUsername("CarlosKta27");
        Juan.setPassword("140198");
        Cata.setPassword("270700");
        
        Juan.GuardarObjeto(false);
        Cata.GuardarObjeto(true);
        
        ArrayList<Admin> a = Juan.LeerObjetos();
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        
        Usuario Alan = new Usuario(0,"Alan","Gamboa",1000,"alan@gmail.com","123456","","Kingag09",null,null);
        
        Alan.GuardarObjeto(false);
        ArrayList<Usuario> u = Alan.LeerObjetos();
        Alan.toString();
    }
}