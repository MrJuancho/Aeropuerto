package Modelo;

import Controlador.Admin;
import Controlador.CardInformation;
import Controlador.ElectronicPayment;
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
        
    }
}