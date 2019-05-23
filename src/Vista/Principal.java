package Vista;

import Controlador.Admin;
import Controlador.Avion;
import Controlador.Usuario;
import Controlador.Vuelos;
import Controlador.VuelosVuelta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Principal extends JFrame {
    Usuario master = new Usuario();
    Admin masterAd = new Admin();
    Avion masterAvion = new Avion();
    Vuelos marterVuelo = new Vuelos();
    VuelosVuelta masterLLegadas = new VuelosVuelta();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Admin> admins = new ArrayList<Admin>();
    ArrayList<Avion> aviones = new ArrayList<Avion>();
    ArrayList<Vuelos> salidas = new ArrayList<Vuelos>();
    ArrayList<VuelosVuelta> llegadas = new ArrayList<VuelosVuelta>();
    Usuario actual;
    Admin adminactual;
    String entrada,newname,newapellido,newmail,newpassw;
    
    public Principal() {
        initComponents();
        myComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ACoins = new javax.swing.JDialog();
        PanelPrincipal1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        IconoSuperior1 = new javax.swing.JLabel();
        PanelBotones1 = new javax.swing.JPanel();
        SalirACoins = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ACoinsdisp = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BotonRegistrarACoins = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        IconoSuperior = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        AdminPanel = new javax.swing.JPanel();
        ToolBarAdmin = new javax.swing.JPanel();
        NavegacionAdmin = new javax.swing.JPanel();
        EditSalidas = new javax.swing.JLabel();
        EditLlegadas = new javax.swing.JLabel();
        EditAviones = new javax.swing.JLabel();
        EditUsuarios = new javax.swing.JLabel();
        OpcionesUsuarioAdmin = new javax.swing.JPanel();
        nombreuser = new javax.swing.JLabel();
        imguser = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        AdminName2 = new javax.swing.JLabel();
        ImagenBienvenidaAdmin = new javax.swing.JLabel();
        EditarSalidas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BotonRegistrarSalidas = new javax.swing.JButton();
        ScrollSalidas = new javax.swing.JScrollPane();
        TablaSalidas = new javax.swing.JTable();
        LabelNoSalidas = new javax.swing.JLabel();
        fodoESalidas = new javax.swing.JLabel();
        EditarLlegadas = new javax.swing.JPanel();
        labelLLegadas = new javax.swing.JLabel();
        BotonRegistrarLLegada = new javax.swing.JButton();
        ScrollLLegadas = new javax.swing.JScrollPane();
        TablaLLegadas = new javax.swing.JTable();
        noLLegadas = new javax.swing.JLabel();
        fondoELlegadas = new javax.swing.JLabel();
        EditarUsuarios = new javax.swing.JPanel();
        LabelEUsuarios = new javax.swing.JLabel();
        ScrollUsuarios = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        textoNoUsers = new javax.swing.JLabel();
        fondoEditA1 = new javax.swing.JLabel();
        EditarAviones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonRegistrarAvion = new javax.swing.JButton();
        ScrollAviones = new javax.swing.JScrollPane();
        TablaAviones = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        fondoEditA = new javax.swing.JLabel();
        UsuarioPanel = new javax.swing.JPanel();
        ToolBarUser = new javax.swing.JPanel();
        Navegacion = new javax.swing.JPanel();
        SalidasB = new javax.swing.JLabel();
        LlegadasB = new javax.swing.JLabel();
        DestinosB = new javax.swing.JLabel();
        OpcionesUsuario = new javax.swing.JPanel();
        ApexCoins = new javax.swing.JLabel();
        ApexCoinsImg = new javax.swing.JLabel();
        nombreUser = new javax.swing.JLabel();
        nombreAdmin = new javax.swing.JLabel();
        CerrarSesionUser = new javax.swing.JLabel();
        PanelOpUser = new javax.swing.JPanel();
        Imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FondoOpciones = new javax.swing.JLabel();
        Opciones = new javax.swing.JPanel();
        MarcoUser = new javax.swing.JLabel();
        UserImage = new javax.swing.JLabel();
        PagoElectronico = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        Informaciondetarjeta = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        lapiznom_user = new javax.swing.JLabel();
        lapiz_pagoelec = new javax.swing.JLabel();
        lapiz_nom = new javax.swing.JLabel();
        lapiz_apellido = new javax.swing.JLabel();
        lapiz_acoins = new javax.swing.JLabel();
        lapiz_mail = new javax.swing.JLabel();
        Acoins1 = new javax.swing.JLabel();
        Mail1 = new javax.swing.JLabel();
        Contraseña1 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        lapiz_mail1 = new javax.swing.JLabel();
        lapiz_passw = new javax.swing.JLabel();
        lapiz_inforcard = new javax.swing.JLabel();
        TituloEditar = new javax.swing.JLabel();
        NombreUsuario1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lapiz_passw1 = new javax.swing.JLabel();
        PanelLlegadas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TablaConsultaLLegadas = new javax.swing.JScrollPane();
        TablaLlegadas = new javax.swing.JTable();
        FondoLLegadas = new javax.swing.JLabel();
        PanelSalidas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        BotonComprarVuelo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FondouserSalidas = new javax.swing.JLabel();
        PanelDestinos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel12 = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        PanelRegistro = new javax.swing.JPanel();
        separadorPassR = new javax.swing.JSeparator();
        separadorNombreR = new javax.swing.JSeparator();
        separadorApellidosR = new javax.swing.JSeparator();
        separadorMail = new javax.swing.JSeparator();
        SeparadorUsername = new javax.swing.JSeparator();
        TextoPass2 = new javax.swing.JLabel();
        TextoPass1 = new javax.swing.JLabel();
        TextoRegistro = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        TextoPass3 = new javax.swing.JLabel();
        TextoPass4 = new javax.swing.JLabel();
        TextoPass5 = new javax.swing.JLabel();
        PassReg = new javax.swing.JPasswordField();
        UserReg = new javax.swing.JTextField();
        NombreReg = new javax.swing.JTextField();
        ApellidosReg = new javax.swing.JTextField();
        MailReg = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        ErrorRegN = new javax.swing.JLabel();
        ErrorRegPass = new javax.swing.JLabel();
        ErrorRegU = new javax.swing.JLabel();
        ErrorRegC = new javax.swing.JLabel();
        ErrorRegA = new javax.swing.JLabel();
        PanelEntrada = new javax.swing.JPanel();
        TextoLogin1 = new javax.swing.JLabel();
        TextoPass = new javax.swing.JLabel();
        separadorPassword = new javax.swing.JSeparator();
        TextoUser = new javax.swing.JLabel();
        separadorNombre = new javax.swing.JSeparator();
        BotonLogin = new javax.swing.JButton();
        Registro = new javax.swing.JLabel();
        TextoLogin2 = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        ErrorPass = new javax.swing.JLabel();
        ErrorName = new javax.swing.JLabel();
        PanelPresentacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        ACoins.setUndecorated(true);
        ACoins.setPreferredSize(new java.awt.Dimension(500, 300));

        PanelPrincipal1.setBackground(new java.awt.Color(25, 118, 210));
        PanelPrincipal1.setLayout(new java.awt.BorderLayout(40, 15));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 7, 5));

        IconoSuperior1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        IconoSuperior1.setForeground(new java.awt.Color(255, 255, 255));
        IconoSuperior1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/apexFlightsIcon.png"))); // NOI18N
        IconoSuperior1.setText("Agregar ACoins");
        IconoSuperior1.setAlignmentX(3.0F);
        IconoSuperior1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IconoSuperior1.setFocusable(false);
        IconoSuperior1.setIconTextGap(3);
        jPanel3.add(IconoSuperior1);

        PanelPrincipal1.add(jPanel3, java.awt.BorderLayout.WEST);

        PanelBotones1.setBackground(new java.awt.Color(25, 118, 210));

        SalirACoins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_clear_white_24dp.png"))); // NOI18N
        SalirACoins.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirACoins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirACoinsMouseClicked(evt);
            }
        });
        PanelBotones1.add(SalirACoins);

        PanelPrincipal1.add(PanelBotones1, java.awt.BorderLayout.LINE_END);

        ACoins.getContentPane().add(PanelPrincipal1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Ingresa tu codigo: ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Tus ACoins actuales");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, -1));

        ACoinsdisp.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        ACoinsdisp.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(ACoinsdisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, 20));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 180, -1));

        BotonRegistrarACoins.setBackground(new java.awt.Color(124, 77, 255));
        BotonRegistrarACoins.setFont(new java.awt.Font("Montserrat Alternates", 1, 24)); // NOI18N
        BotonRegistrarACoins.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarACoins.setText("Canjear");
        BotonRegistrarACoins.setBorder(null);
        BotonRegistrarACoins.setBorderPainted(false);
        BotonRegistrarACoins.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrarACoins.setFocusable(false);
        BotonRegistrarACoins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarACoinsMouseClicked(evt);
            }
        });
        BotonRegistrarACoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarACoinsActionPerformed(evt);
            }
        });
        jPanel4.add(BotonRegistrarACoins, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 130, -1));

        ACoins.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("ApexFlights");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("principalframe"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        PanelPrincipal.setBackground(new java.awt.Color(25, 118, 210));
        PanelPrincipal.setLayout(new java.awt.BorderLayout(40, 15));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 7, 5));

        IconoSuperior.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        IconoSuperior.setForeground(new java.awt.Color(255, 255, 255));
        IconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/apexFlightsIcon.png"))); // NOI18N
        IconoSuperior.setText(" Apex Flights");
        IconoSuperior.setAlignmentX(3.0F);
        IconoSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IconoSuperior.setFocusable(false);
        IconoSuperior.setIconTextGap(3);
        jPanel2.add(IconoSuperior);

        PanelPrincipal.add(jPanel2, java.awt.BorderLayout.WEST);

        PanelBotones.setBackground(new java.awt.Color(25, 118, 210));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_expand_more_white_24dp.png"))); // NOI18N
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.S_RESIZE_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        PanelBotones.add(Minimizar);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_clear_white_24dp.png"))); // NOI18N
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        PanelBotones.add(Salir);

        PanelPrincipal.add(PanelBotones, java.awt.BorderLayout.LINE_END);

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.PAGE_START);

        AdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        AdminPanel.setLayout(new java.awt.BorderLayout());

        ToolBarAdmin.setBackground(new java.awt.Color(33, 150, 243));
        ToolBarAdmin.setMinimumSize(new java.awt.Dimension(169, 52));
        ToolBarAdmin.setPreferredSize(new java.awt.Dimension(169, 52));
        ToolBarAdmin.setLayout(new java.awt.BorderLayout());

        NavegacionAdmin.setOpaque(false);
        NavegacionAdmin.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        EditSalidas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EditSalidas.setForeground(new java.awt.Color(255, 255, 255));
        EditSalidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_flight_takeoff_white_24dp.png"))); // NOI18N
        EditSalidas.setToolTipText("Salidas");
        EditSalidas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        EditSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditSalidasMouseClicked(evt);
            }
        });
        NavegacionAdmin.add(EditSalidas);

        EditLlegadas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EditLlegadas.setForeground(new java.awt.Color(255, 255, 255));
        EditLlegadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_flight_land_white_24dp.png"))); // NOI18N
        EditLlegadas.setToolTipText("Llegadas");
        EditLlegadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditLlegadasMouseClicked(evt);
            }
        });
        NavegacionAdmin.add(EditLlegadas);

        EditAviones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EditAviones.setForeground(new java.awt.Color(255, 255, 255));
        EditAviones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_local_airport_white_24dp.png"))); // NOI18N
        EditAviones.setToolTipText("Destinos");
        EditAviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAvionesMouseClicked(evt);
            }
        });
        NavegacionAdmin.add(EditAviones);

        EditUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_assignment_ind_white_24dp.png"))); // NOI18N
        EditUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditUsuariosMouseClicked(evt);
            }
        });
        NavegacionAdmin.add(EditUsuarios);

        ToolBarAdmin.add(NavegacionAdmin, java.awt.BorderLayout.WEST);

        OpcionesUsuarioAdmin.setOpaque(false);
        OpcionesUsuarioAdmin.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 3));

        nombreuser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreuser.setForeground(new java.awt.Color(255, 255, 255));
        OpcionesUsuarioAdmin.add(nombreuser);

        imguser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_account_circle_white_24dp.png"))); // NOI18N
        imguser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imguser.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imguser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imguserMouseClicked(evt);
            }
        });
        OpcionesUsuarioAdmin.add(imguser);

        ToolBarAdmin.add(OpcionesUsuarioAdmin, java.awt.BorderLayout.LINE_END);

        AdminPanel.add(ToolBarAdmin, java.awt.BorderLayout.PAGE_START);

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bienvenido de Vuelta");
        Inicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 540, -1));

        AdminName2.setFont(new java.awt.Font("Montserrat Alternates Light", 1, 70)); // NOI18N
        AdminName2.setForeground(new java.awt.Color(255, 255, 255));
        AdminName2.setToolTipText("");
        AdminName2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Inicio.add(AdminName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 460, 80));
        Inicio.add(ImagenBienvenidaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 633));

        AdminPanel.add(Inicio, java.awt.BorderLayout.CENTER);

        EditarSalidas.setBackground(new java.awt.Color(255, 255, 255));
        EditarSalidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Editar Vuelos de Salida");
        EditarSalidas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        BotonRegistrarSalidas.setBackground(new java.awt.Color(124, 77, 255));
        BotonRegistrarSalidas.setFont(new java.awt.Font("Montserrat Alternates", 1, 24)); // NOI18N
        BotonRegistrarSalidas.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarSalidas.setText("Agregar un vuelo de Salida");
        BotonRegistrarSalidas.setBorder(null);
        BotonRegistrarSalidas.setBorderPainted(false);
        BotonRegistrarSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrarSalidas.setFocusable(false);
        BotonRegistrarSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarSalidasMouseClicked(evt);
            }
        });
        EditarSalidas.add(BotonRegistrarSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 420, 40));

        ScrollSalidas.setBackground(new java.awt.Color(255, 255, 255));
        ScrollSalidas.setForeground(new java.awt.Color(255, 255, 255));

        TablaSalidas.setBackground(new java.awt.Color(33, 150, 243));
        TablaSalidas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TablaSalidas.setForeground(new java.awt.Color(255, 255, 255));
        TablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Flight Code", "Avion", "Lugares", "Destino", "Hora de Abordaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaSalidas.setToolTipText("");
        TablaSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaSalidas.setGridColor(new java.awt.Color(255, 255, 255));
        TablaSalidas.setRowHeight(20);
        ScrollSalidas.setViewportView(TablaSalidas);
        if (TablaSalidas.getColumnModel().getColumnCount() > 0) {
            TablaSalidas.getColumnModel().getColumn(0).setResizable(false);
            TablaSalidas.getColumnModel().getColumn(1).setResizable(false);
            TablaSalidas.getColumnModel().getColumn(2).setResizable(false);
            TablaSalidas.getColumnModel().getColumn(3).setResizable(false);
            TablaSalidas.getColumnModel().getColumn(4).setResizable(false);
            TablaSalidas.getColumnModel().getColumn(5).setResizable(false);
        }

        EditarSalidas.add(ScrollSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, 440));

        LabelNoSalidas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelNoSalidas.setText("No hay salidas registrados");
        LabelNoSalidas.setFocusTraversalPolicyProvider(true);
        EditarSalidas.add(LabelNoSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        fodoESalidas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fodoESalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/llegadas_edit.jpg"))); // NOI18N
        fodoESalidas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        EditarSalidas.add(fodoESalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        AdminPanel.add(EditarSalidas, java.awt.BorderLayout.CENTER);

        EditarLlegadas.setBackground(new java.awt.Color(255, 255, 255));
        EditarLlegadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLLegadas.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        labelLLegadas.setForeground(new java.awt.Color(255, 255, 255));
        labelLLegadas.setText("Editar Vuelos de Vuelta");
        EditarLlegadas.add(labelLLegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        BotonRegistrarLLegada.setBackground(new java.awt.Color(124, 77, 255));
        BotonRegistrarLLegada.setFont(new java.awt.Font("Montserrat Alternates", 1, 24)); // NOI18N
        BotonRegistrarLLegada.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarLLegada.setText("Agregar Avion");
        BotonRegistrarLLegada.setBorder(null);
        BotonRegistrarLLegada.setBorderPainted(false);
        BotonRegistrarLLegada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrarLLegada.setFocusable(false);
        BotonRegistrarLLegada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarLLegadaMouseClicked(evt);
            }
        });
        EditarLlegadas.add(BotonRegistrarLLegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 420, 40));

        ScrollLLegadas.setBackground(new java.awt.Color(255, 255, 255));
        ScrollLLegadas.setForeground(new java.awt.Color(255, 255, 255));

        TablaLLegadas.setBackground(new java.awt.Color(33, 150, 243));
        TablaLLegadas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TablaLLegadas.setForeground(new java.awt.Color(255, 255, 255));
        TablaLLegadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hora de llegada", "Avion Asignado", "Procedencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaLLegadas.setToolTipText("");
        TablaLLegadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaLLegadas.setGridColor(new java.awt.Color(255, 255, 255));
        TablaLLegadas.setRowHeight(20);
        ScrollLLegadas.setViewportView(TablaLLegadas);
        if (TablaLLegadas.getColumnModel().getColumnCount() > 0) {
            TablaLLegadas.getColumnModel().getColumn(0).setResizable(false);
            TablaLLegadas.getColumnModel().getColumn(1).setResizable(false);
            TablaLLegadas.getColumnModel().getColumn(2).setResizable(false);
            TablaLLegadas.getColumnModel().getColumn(3).setResizable(false);
        }

        EditarLlegadas.add(ScrollLLegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, 440));

        noLLegadas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        noLLegadas.setText("No hay llegadas registradas");
        noLLegadas.setFocusTraversalPolicyProvider(true);
        EditarLlegadas.add(noLLegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        fondoELlegadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoELlegadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salidas.jpg"))); // NOI18N
        fondoELlegadas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        EditarLlegadas.add(fondoELlegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        AdminPanel.add(EditarLlegadas, java.awt.BorderLayout.CENTER);

        EditarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        EditarUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelEUsuarios.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        LabelEUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        LabelEUsuarios.setText("Editar Usuarios");
        EditarUsuarios.add(LabelEUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        ScrollUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        ScrollUsuarios.setForeground(new java.awt.Color(255, 255, 255));

        TablaUsuarios.setBackground(new java.awt.Color(33, 150, 243));
        TablaUsuarios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TablaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Correo", "N_Usuario", "Password", "ApexCoins"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaUsuarios.setToolTipText("");
        TablaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        TablaUsuarios.setRowHeight(20);
        ScrollUsuarios.setViewportView(TablaUsuarios);
        if (TablaUsuarios.getColumnModel().getColumnCount() > 0) {
            TablaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            TablaUsuarios.getColumnModel().getColumn(1).setResizable(false);
            TablaUsuarios.getColumnModel().getColumn(2).setResizable(false);
            TablaUsuarios.getColumnModel().getColumn(3).setResizable(false);
            TablaUsuarios.getColumnModel().getColumn(4).setResizable(false);
            TablaUsuarios.getColumnModel().getColumn(6).setResizable(false);
        }

        EditarUsuarios.add(ScrollUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 80, 590, 480));

        textoNoUsers.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textoNoUsers.setText("No hay usuarios registrados");
        textoNoUsers.setFocusTraversalPolicyProvider(true);
        EditarUsuarios.add(textoNoUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        fondoEditA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondoEditA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/persona_editar.jpg"))); // NOI18N
        fondoEditA1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondoEditA1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        EditarUsuarios.add(fondoEditA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        AdminPanel.add(EditarUsuarios, java.awt.BorderLayout.CENTER);

        EditarAviones.setBackground(new java.awt.Color(255, 255, 255));
        EditarAviones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Editar Aviones");
        EditarAviones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        BotonRegistrarAvion.setBackground(new java.awt.Color(124, 77, 255));
        BotonRegistrarAvion.setFont(new java.awt.Font("Montserrat Alternates", 1, 24)); // NOI18N
        BotonRegistrarAvion.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarAvion.setText("Agregar Avion");
        BotonRegistrarAvion.setBorder(null);
        BotonRegistrarAvion.setBorderPainted(false);
        BotonRegistrarAvion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrarAvion.setFocusable(false);
        BotonRegistrarAvion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarAvionMouseClicked(evt);
            }
        });
        EditarAviones.add(BotonRegistrarAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 420, 40));

        ScrollAviones.setBackground(new java.awt.Color(255, 255, 255));
        ScrollAviones.setForeground(new java.awt.Color(255, 255, 255));

        TablaAviones.setBackground(new java.awt.Color(33, 150, 243));
        TablaAviones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TablaAviones.setForeground(new java.awt.Color(255, 255, 255));
        TablaAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Modelo", "Lugares", "No Vuelos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaAviones.setToolTipText("");
        TablaAviones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaAviones.setGridColor(new java.awt.Color(255, 255, 255));
        TablaAviones.setRowHeight(20);
        ScrollAviones.setViewportView(TablaAviones);
        if (TablaAviones.getColumnModel().getColumnCount() > 0) {
            TablaAviones.getColumnModel().getColumn(0).setResizable(false);
            TablaAviones.getColumnModel().getColumn(1).setResizable(false);
            TablaAviones.getColumnModel().getColumn(2).setResizable(false);
            TablaAviones.getColumnModel().getColumn(3).setResizable(false);
        }

        EditarAviones.add(ScrollAviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, 440));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("No hay aviones registrados");
        jLabel3.setFocusTraversalPolicyProvider(true);
        EditarAviones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        fondoEditA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fondoEditA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plane_Edit.jpg"))); // NOI18N
        fondoEditA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        EditarAviones.add(fondoEditA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        AdminPanel.add(EditarAviones, java.awt.BorderLayout.CENTER);

        getContentPane().add(AdminPanel, java.awt.BorderLayout.CENTER);

        UsuarioPanel.setBackground(new java.awt.Color(255, 255, 255));
        UsuarioPanel.setLayout(new java.awt.BorderLayout());

        ToolBarUser.setBackground(new java.awt.Color(33, 150, 243));
        ToolBarUser.setMinimumSize(new java.awt.Dimension(169, 52));
        ToolBarUser.setPreferredSize(new java.awt.Dimension(169, 52));
        ToolBarUser.setLayout(new java.awt.BorderLayout());

        Navegacion.setOpaque(false);
        Navegacion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        SalidasB.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        SalidasB.setForeground(new java.awt.Color(255, 255, 255));
        SalidasB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalidasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_flight_takeoff_white_24dp.png"))); // NOI18N
        SalidasB.setToolTipText("Salidas");
        SalidasB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SalidasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalidasBMouseClicked(evt);
            }
        });
        Navegacion.add(SalidasB);

        LlegadasB.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        LlegadasB.setForeground(new java.awt.Color(255, 255, 255));
        LlegadasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_flight_land_white_24dp.png"))); // NOI18N
        LlegadasB.setToolTipText("Llegadas");
        LlegadasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LlegadasBMouseClicked(evt);
            }
        });
        Navegacion.add(LlegadasB);

        DestinosB.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        DestinosB.setForeground(new java.awt.Color(255, 255, 255));
        DestinosB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_terrain_white_24dp.png"))); // NOI18N
        DestinosB.setToolTipText("Destinos");
        DestinosB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DestinosBMouseClicked(evt);
            }
        });
        Navegacion.add(DestinosB);

        ToolBarUser.add(Navegacion, java.awt.BorderLayout.WEST);

        OpcionesUsuario.setOpaque(false);
        OpcionesUsuario.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 3));

        ApexCoins.setFont(new java.awt.Font("Montserrat", 3, 18)); // NOI18N
        ApexCoins.setForeground(new java.awt.Color(255, 255, 255));
        OpcionesUsuario.add(ApexCoins);

        ApexCoinsImg.setBackground(new java.awt.Color(255, 153, 153));
        ApexCoinsImg.setPreferredSize(new java.awt.Dimension(25, 25));
        OpcionesUsuario.add(ApexCoinsImg);

        nombreUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreUser.setForeground(new java.awt.Color(255, 255, 255));
        OpcionesUsuario.add(nombreUser);

        nombreAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_account_circle_white_24dp.png"))); // NOI18N
        nombreAdmin.setToolTipText("Opciones");
        nombreAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nombreAdmin.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        nombreAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreAdminMouseClicked(evt);
            }
        });
        OpcionesUsuario.add(nombreAdmin);

        CerrarSesionUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_exit_to_app_white_24dp.png"))); // NOI18N
        CerrarSesionUser.setToolTipText("Cerrar Sesion");
        CerrarSesionUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionUserMouseClicked(evt);
            }
        });
        OpcionesUsuario.add(CerrarSesionUser);

        ToolBarUser.add(OpcionesUsuario, java.awt.BorderLayout.LINE_END);

        UsuarioPanel.add(ToolBarUser, java.awt.BorderLayout.PAGE_START);

        PanelOpUser.setLayout(new java.awt.BorderLayout());

        Imagen.setMaximumSize(new java.awt.Dimension(640, 631));
        Imagen.setMinimumSize(new java.awt.Dimension(640, 631));
        Imagen.setPreferredSize(new java.awt.Dimension(640, 631));
        Imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Datos");
        Imagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        FondoOpciones.setBackground(new java.awt.Color(153, 51, 255));
        FondoOpciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FondoOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/persona_editar.jpg"))); // NOI18N
        FondoOpciones.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        FondoOpciones.setOpaque(true);
        FondoOpciones.setPreferredSize(new java.awt.Dimension(640, 631));
        Imagen.add(FondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        PanelOpUser.add(Imagen, java.awt.BorderLayout.LINE_START);

        Opciones.setBackground(new java.awt.Color(187, 222, 251));
        Opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MarcoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imagenMarco.png"))); // NOI18N
        Opciones.add(MarcoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        UserImage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UserImage.setForeground(new java.awt.Color(0, 0, 0));
        UserImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserImage.setText("SIn Imagen");
        UserImage.setMaximumSize(new java.awt.Dimension(100, 100));
        UserImage.setMinimumSize(new java.awt.Dimension(100, 100));
        UserImage.setPreferredSize(new java.awt.Dimension(100, 100));
        Opciones.add(UserImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, -1));

        PagoElectronico.setBackground(new java.awt.Color(0, 0, 0));
        PagoElectronico.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        PagoElectronico.setForeground(new java.awt.Color(0, 0, 0));
        PagoElectronico.setText("Pago Electronico");
        Opciones.add(PagoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 170, -1));

        NombreUsuario.setBackground(new java.awt.Color(124, 77, 255));
        NombreUsuario.setFont(new java.awt.Font("Montserrat Alternates ExLight", 1, 18)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuario.setOpaque(true);
        Opciones.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, 30));

        Apellido.setBackground(new java.awt.Color(124, 77, 255));
        Apellido.setFont(new java.awt.Font("Montserrat Alternates ExLight", 1, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setOpaque(true);
        Opciones.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 270, 30));

        Mail.setBackground(new java.awt.Color(124, 77, 255));
        Mail.setFont(new java.awt.Font("Montserrat Alternates ExLight", 1, 18)); // NOI18N
        Mail.setForeground(new java.awt.Color(255, 255, 255));
        Mail.setOpaque(true);
        Opciones.add(Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 270, 30));

        Informaciondetarjeta.setBackground(new java.awt.Color(0, 0, 0));
        Informaciondetarjeta.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        Informaciondetarjeta.setForeground(new java.awt.Color(0, 0, 0));
        Informaciondetarjeta.setText("Informacion de Tarjeta");
        Opciones.add(Informaciondetarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 220, -1));

        Contraseña.setBackground(new java.awt.Color(124, 77, 255));
        Contraseña.setFont(new java.awt.Font("Montserrat Alternates ExLight", 1, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setOpaque(true);
        Opciones.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 270, 30));

        Nombre.setBackground(new java.awt.Color(124, 77, 255));
        Nombre.setFont(new java.awt.Font("Montserrat Alternates ExLight", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setOpaque(true);
        Opciones.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, 30));

        lapiznom_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        lapiznom_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapiznom_userMouseClicked(evt);
            }
        });
        Opciones.add(lapiznom_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        lapiz_pagoelec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        Opciones.add(lapiz_pagoelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        lapiz_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        lapiz_nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapiz_nomMouseClicked(evt);
            }
        });
        Opciones.add(lapiz_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        lapiz_apellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        lapiz_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapiz_apellidoMouseClicked(evt);
            }
        });
        Opciones.add(lapiz_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        lapiz_acoins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        lapiz_acoins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapiz_acoinsMouseClicked(evt);
            }
        });
        Opciones.add(lapiz_acoins, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        lapiz_mail.setBackground(new java.awt.Color(0, 0, 0));
        lapiz_mail.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lapiz_mail.setForeground(new java.awt.Color(0, 0, 0));
        lapiz_mail.setText("Apellidos:");
        Opciones.add(lapiz_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, -1));

        Acoins1.setBackground(new java.awt.Color(0, 0, 0));
        Acoins1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        Acoins1.setForeground(new java.awt.Color(0, 0, 0));
        Acoins1.setText("ACoins");
        Opciones.add(Acoins1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 70, -1));

        Mail1.setBackground(new java.awt.Color(0, 0, 0));
        Mail1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        Mail1.setForeground(new java.awt.Color(0, 0, 0));
        Mail1.setText("E-Mail:");
        Opciones.add(Mail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 260, -1));

        Contraseña1.setBackground(new java.awt.Color(0, 0, 0));
        Contraseña1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        Contraseña1.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña1.setText("Contraseña:");
        Opciones.add(Contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 250, -1));

        Nombre1.setBackground(new java.awt.Color(0, 0, 0));
        Nombre1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(0, 0, 0));
        Nombre1.setText("Nombre:");
        Opciones.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        lapiz_mail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        lapiz_mail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapiz_mailMouseClicked(evt);
            }
        });
        Opciones.add(lapiz_mail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        lapiz_passw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        lapiz_passw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapiz_passwMouseClicked(evt);
            }
        });
        Opciones.add(lapiz_passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        lapiz_inforcard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        Opciones.add(lapiz_inforcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));

        TituloEditar.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        TituloEditar.setForeground(new java.awt.Color(51, 51, 51));
        TituloEditar.setText("Editar mis Datos");
        Opciones.add(TituloEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        NombreUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        NombreUsuario1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        NombreUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        NombreUsuario1.setText("Nombre Usuario:");
        Opciones.add(NombreUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Informacion Avanzada:");
        Opciones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        lapiz_passw1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        lapiz_passw1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapiz_passw1MouseClicked(evt);
            }
        });
        Opciones.add(lapiz_passw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        PanelOpUser.add(Opciones, java.awt.BorderLayout.CENTER);

        UsuarioPanel.add(PanelOpUser, java.awt.BorderLayout.CENTER);

        PanelLlegadas.setBackground(new java.awt.Color(255, 255, 255));
        PanelLlegadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Proximas llegadas al aeropuerto");
        PanelLlegadas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        TablaConsultaLLegadas.setPreferredSize(new java.awt.Dimension(950, 720));

        TablaLlegadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Procedencia", "Hora de Llegada", "Numero de Vuelo"
            }
        ));
        TablaLlegadas.setMaximumSize(new java.awt.Dimension(950, 720));
        TablaLlegadas.setMinimumSize(new java.awt.Dimension(950, 720));
        TablaLlegadas.setPreferredSize(new java.awt.Dimension(950, 720));
        TablaConsultaLLegadas.setViewportView(TablaLlegadas);

        PanelLlegadas.add(TablaConsultaLLegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 770, 400));

        FondoLLegadas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        FondoLLegadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/llegadas_edit.jpg"))); // NOI18N
        PanelLlegadas.add(FondoLLegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        UsuarioPanel.add(PanelLlegadas, java.awt.BorderLayout.CENTER);

        PanelSalidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Proxima Salidas");
        PanelSalidas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Para comprar un vuelo,\nSeleccionalo en la tabla y presiona\ncomprar.");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        PanelSalidas.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 60));

        BotonComprarVuelo.setBackground(new java.awt.Color(124, 77, 255));
        BotonComprarVuelo.setFont(new java.awt.Font("Montserrat Alternates", 1, 24)); // NOI18N
        BotonComprarVuelo.setForeground(new java.awt.Color(255, 255, 255));
        BotonComprarVuelo.setText("Comprar Vuelo");
        BotonComprarVuelo.setBorder(null);
        BotonComprarVuelo.setBorderPainted(false);
        BotonComprarVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonComprarVuelo.setFocusable(false);
        BotonComprarVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonComprarVueloMouseClicked(evt);
            }
        });
        PanelSalidas.add(BotonComprarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 420, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FlightCorde", "Destino", "Lugares", "Avion", "Hora de Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        PanelSalidas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 740, 450));

        FondouserSalidas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FondouserSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salidas.jpg"))); // NOI18N
        PanelSalidas.add(FondouserSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        UsuarioPanel.add(PanelSalidas, java.awt.BorderLayout.CENTER);

        PanelDestinos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cielo_cool2.jpg"))); // NOI18N
        jScrollPane2.setViewportView(jLabel12);

        PanelDestinos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        UsuarioPanel.add(PanelDestinos, java.awt.BorderLayout.CENTER);

        getContentPane().add(UsuarioPanel, java.awt.BorderLayout.CENTER);

        PanelLogin.setBackground(new java.awt.Color(33, 150, 243));
        PanelLogin.setLayout(new java.awt.BorderLayout());

        PanelRegistro.setBackground(new java.awt.Color(33, 150, 243));
        PanelRegistro.setForeground(new java.awt.Color(33, 150, 243));
        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separadorPassR.setBackground(new java.awt.Color(33, 150, 243));
        separadorPassR.setForeground(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(separadorPassR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 420, 10));

        separadorNombreR.setBackground(new java.awt.Color(33, 150, 243));
        separadorNombreR.setForeground(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(separadorNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 420, 10));

        separadorApellidosR.setBackground(new java.awt.Color(33, 150, 243));
        separadorApellidosR.setForeground(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(separadorApellidosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 420, 10));

        separadorMail.setBackground(new java.awt.Color(33, 150, 243));
        separadorMail.setForeground(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(separadorMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 420, 10));

        SeparadorUsername.setBackground(new java.awt.Color(33, 150, 243));
        SeparadorUsername.setForeground(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(SeparadorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 420, 10));

        TextoPass2.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        TextoPass2.setForeground(new java.awt.Color(255, 255, 255));
        TextoPass2.setText("Nombre:");
        PanelRegistro.add(TextoPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        TextoPass1.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        TextoPass1.setForeground(new java.awt.Color(255, 255, 255));
        TextoPass1.setText("Contraseña:");
        PanelRegistro.add(TextoPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        TextoRegistro.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        TextoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        TextoRegistro.setText("Registrate");
        PanelRegistro.add(TextoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_label_white_24dp.png"))); // NOI18N
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        PanelRegistro.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        TextoPass3.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        TextoPass3.setForeground(new java.awt.Color(255, 255, 255));
        TextoPass3.setText("Apellidos:");
        PanelRegistro.add(TextoPass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        TextoPass4.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        TextoPass4.setForeground(new java.awt.Color(255, 255, 255));
        TextoPass4.setText("Correo:");
        PanelRegistro.add(TextoPass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        TextoPass5.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        TextoPass5.setForeground(new java.awt.Color(255, 255, 255));
        TextoPass5.setText("Nombre de usuario:");
        PanelRegistro.add(TextoPass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        PassReg.setBackground(new java.awt.Color(33, 150, 243));
        PassReg.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        PassReg.setForeground(new java.awt.Color(255, 255, 255));
        PassReg.setBorder(null);
        PassReg.setCaretColor(new java.awt.Color(255, 255, 255));
        PassReg.setOpaque(false);
        PanelRegistro.add(PassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 420, 30));

        UserReg.setBackground(new java.awt.Color(33, 150, 243));
        UserReg.setFont(new java.awt.Font("Montserrat Alternates", 0, 18)); // NOI18N
        UserReg.setForeground(new java.awt.Color(255, 255, 255));
        UserReg.setBorder(null);
        UserReg.setCaretColor(new java.awt.Color(255, 255, 255));
        UserReg.setOpaque(false);
        PanelRegistro.add(UserReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 420, 30));

        NombreReg.setBackground(new java.awt.Color(33, 150, 243));
        NombreReg.setFont(new java.awt.Font("Montserrat Alternates", 0, 18)); // NOI18N
        NombreReg.setForeground(new java.awt.Color(255, 255, 255));
        NombreReg.setBorder(null);
        NombreReg.setCaretColor(new java.awt.Color(255, 255, 255));
        NombreReg.setOpaque(false);
        PanelRegistro.add(NombreReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 420, 30));

        ApellidosReg.setBackground(new java.awt.Color(33, 150, 243));
        ApellidosReg.setFont(new java.awt.Font("Montserrat Alternates", 0, 18)); // NOI18N
        ApellidosReg.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosReg.setBorder(null);
        ApellidosReg.setCaretColor(new java.awt.Color(255, 255, 255));
        ApellidosReg.setOpaque(false);
        PanelRegistro.add(ApellidosReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 420, 30));

        MailReg.setBackground(new java.awt.Color(33, 150, 243));
        MailReg.setFont(new java.awt.Font("Montserrat Alternates", 0, 18)); // NOI18N
        MailReg.setForeground(new java.awt.Color(255, 255, 255));
        MailReg.setBorder(null);
        MailReg.setCaretColor(new java.awt.Color(255, 255, 255));
        MailReg.setOpaque(false);
        PanelRegistro.add(MailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 420, 30));

        BotonRegistrar.setBackground(new java.awt.Color(124, 77, 255));
        BotonRegistrar.setFont(new java.awt.Font("Montserrat Alternates", 1, 24)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.setBorder(null);
        BotonRegistrar.setBorderPainted(false);
        BotonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrar.setFocusable(false);
        BotonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarMouseClicked(evt);
            }
        });
        PanelRegistro.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 420, 40));

        ErrorRegN.setForeground(new java.awt.Color(239, 83, 80));
        PanelRegistro.add(ErrorRegN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, -1));

        ErrorRegPass.setForeground(new java.awt.Color(239, 83, 80));
        PanelRegistro.add(ErrorRegPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 160, 10));

        ErrorRegU.setForeground(new java.awt.Color(239, 83, 80));
        PanelRegistro.add(ErrorRegU, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 160, -1));

        ErrorRegC.setForeground(new java.awt.Color(239, 83, 80));
        PanelRegistro.add(ErrorRegC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 190, -1));

        ErrorRegA.setForeground(new java.awt.Color(239, 83, 80));
        PanelRegistro.add(ErrorRegA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 170, -1));

        PanelLogin.add(PanelRegistro, java.awt.BorderLayout.CENTER);

        PanelEntrada.setBackground(new java.awt.Color(255, 255, 255));
        PanelEntrada.setOpaque(false);
        PanelEntrada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoLogin1.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        TextoLogin1.setForeground(new java.awt.Color(255, 255, 255));
        TextoLogin1.setText("Inicia Sesion");
        PanelEntrada.add(TextoLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        TextoPass.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        TextoPass.setForeground(new java.awt.Color(255, 255, 255));
        TextoPass.setText("Contraseña:");
        PanelEntrada.add(TextoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        separadorPassword.setBackground(new java.awt.Color(255, 255, 255));
        separadorPassword.setForeground(new java.awt.Color(255, 255, 255));
        separadorPassword.setOpaque(true);
        PanelEntrada.add(separadorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 388, 420, -1));

        TextoUser.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        TextoUser.setForeground(new java.awt.Color(255, 255, 255));
        TextoUser.setText("Nombre de Usuario:");
        PanelEntrada.add(TextoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        separadorNombre.setBackground(new java.awt.Color(255, 255, 255));
        separadorNombre.setForeground(new java.awt.Color(255, 255, 255));
        separadorNombre.setOpaque(true);
        PanelEntrada.add(separadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 288, 420, -1));

        BotonLogin.setBackground(new java.awt.Color(124, 77, 255));
        BotonLogin.setFont(new java.awt.Font("Montserrat Alternates", 1, 24)); // NOI18N
        BotonLogin.setForeground(new java.awt.Color(255, 255, 255));
        BotonLogin.setText("Acceder");
        BotonLogin.setBorder(null);
        BotonLogin.setBorderPainted(false);
        BotonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLoginMouseClicked(evt);
            }
        });
        PanelEntrada.add(BotonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 420, 40));

        Registro.setFont(new java.awt.Font("Montserrat", 3, 24)); // NOI18N
        Registro.setForeground(new java.awt.Color(124, 77, 255));
        Registro.setText("Regitrate ahora");
        Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMouseClicked(evt);
            }
        });
        PanelEntrada.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        TextoLogin2.setFont(new java.awt.Font("Montserrat Alternates", 2, 18)); // NOI18N
        TextoLogin2.setForeground(new java.awt.Color(255, 255, 255));
        TextoLogin2.setText("¿No tienes una cuenta?");
        PanelEntrada.add(TextoLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        UserField.setBackground(new java.awt.Color(33, 150, 243));
        UserField.setFont(new java.awt.Font("Montserrat Alternates", 0, 18)); // NOI18N
        UserField.setForeground(new java.awt.Color(255, 255, 255));
        UserField.setToolTipText("");
        UserField.setActionCommand("<Not Set>");
        UserField.setBorder(null);
        UserField.setCaretColor(new java.awt.Color(255, 255, 255));
        UserField.setOpaque(false);
        UserField.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        PanelEntrada.add(UserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 420, 30));

        PassField.setBackground(new java.awt.Color(33, 150, 243));
        PassField.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        PassField.setForeground(new java.awt.Color(255, 255, 255));
        PassField.setBorder(null);
        PassField.setCaretColor(new java.awt.Color(255, 255, 255));
        PassField.setOpaque(false);
        PanelEntrada.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 420, 30));

        ErrorPass.setBackground(new java.awt.Color(239, 83, 80));
        ErrorPass.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        ErrorPass.setForeground(new java.awt.Color(239, 83, 80));
        PanelEntrada.add(ErrorPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        ErrorName.setBackground(new java.awt.Color(239, 83, 80));
        ErrorName.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        ErrorName.setForeground(new java.awt.Color(239, 83, 80));
        PanelEntrada.add(ErrorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        PanelLogin.add(PanelEntrada, java.awt.BorderLayout.CENTER);

        PanelPresentacion.setOpaque(false);
        PanelPresentacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/apexFlights2.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PanelPresentacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apex Flights");
        PanelPresentacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("\"Feel top of the Sky\"");
        PanelPresentacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel4.setMaximumSize(new java.awt.Dimension(640, 688));
        jLabel4.setMinimumSize(new java.awt.Dimension(640, 688));
        jLabel4.setPreferredSize(new java.awt.Dimension(640, 688));
        PanelPresentacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 686));

        PanelLogin.add(PanelPresentacion, java.awt.BorderLayout.LINE_START);

        getContentPane().add(PanelLogin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
         this.processWindowEvent(
                new WindowEvent(
                      this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_SalirMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
         this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void BotonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLoginMouseClicked
        Usuario entrada = new Usuario();
        if(PassField.getPassword().length == 0){
            separadorPassword.setBackground(new Color(239,83,80));
            separadorPassword.setForeground(new Color(239,83,80));
            ErrorPass.setText("Ingresa una Contraseña...");
        }else
            entrada.setPassword(PassField.getText());
        if(UserField.getText().equals("")){
            separadorNombre.setBackground(new Color(239,83,80));
            separadorNombre.setForeground(new Color(239,83,80));
            ErrorName.setText("Ingresa tu Username...");
            
        }else
            entrada.setUserName(UserField.getText());
        
        usuarios = master.getFileUser();
        admins = masterAd.getFileAdmin();
         for (int i = 0; i < admins.size(); i++) {
            if(admins.get(i).getUsername().contains(entrada.getUserName()) && admins.get(i).getPassword().contains(entrada.getPassword())){
                remove(PanelLogin);
                repaint();
                revalidate();
                
                add(AdminPanel,BorderLayout.CENTER);
                repaint();
                revalidate();
                adminactual = admins.get(i);
                nombreuser.setText(adminactual.getUsername());
                AdminName2.setText(adminactual.getUsername());
            }else{
               if(!usuarios.get(i).getPassword().contains(entrada.getPassword())){
                    separadorPassword.setBackground(new Color(239,83,80));
                    separadorPassword.setForeground(new Color(239,83,80));
                    ErrorPass.setText("Contraseña Incorrecta...");
                }
                if(!usuarios.get(i).getUserName().contains(entrada.getUserName())){
                    separadorNombre.setBackground(new Color(239,83,80));
                    separadorNombre.setForeground(new Color(239,83,80));
                    ErrorName.setText("Username Incorrecto...");
                }
            }
        }
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getUserName().contains(entrada.getUserName()) && usuarios.get(i).getPassword().contains(entrada.getPassword())){
                remove(PanelLogin);
                repaint();
                revalidate();
                
                add(UsuarioPanel,BorderLayout.CENTER);
                repaint();
                revalidate();
                actual = usuarios.get(i);
                System.out.println(actual.getID());
                nombreUser.setText(actual.getNombre());
                ApexCoins.setText(String.valueOf(actual.getACoins()));
                NombreUsuario.setText(actual.getUserName());
                Apellido.setText(actual.getApellido());
                Nombre.setText(actual.getNombre());
                Mail.setText(actual.getMail());
                Contraseña.setText(actual.getPassword());
            }else{
               if(!usuarios.get(i).getPassword().contains(entrada.getPassword())){
                    separadorPassword.setBackground(new Color(239,83,80));
                    separadorPassword.setForeground(new Color(239,83,80));
                    ErrorPass.setText("Contraseña Incorrecta...");
                }
                if(!usuarios.get(i).getUserName().contains(entrada.getUserName())){
                    separadorNombre.setBackground(new Color(239,83,80));
                    separadorNombre.setForeground(new Color(239,83,80));
                    ErrorName.setText("Username Incorrecto...");
                }
            }
        }
    }//GEN-LAST:event_BotonLoginMouseClicked

    private void RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseClicked
        PanelLogin.remove(PanelEntrada);
        PanelLogin.repaint();
        PanelLogin.revalidate();
        
        PanelLogin.add(PanelRegistro,BorderLayout.CENTER);
        PanelLogin.repaint();
        PanelLogin.revalidate();
    }//GEN-LAST:event_RegistroMouseClicked

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        PanelLogin.remove(PanelRegistro);
        PanelLogin.repaint();
        PanelLogin.revalidate();
        
        PanelLogin.add(PanelEntrada,BorderLayout.CENTER);
        PanelLogin.repaint();
        PanelLogin.revalidate();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BotonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMouseClicked
        Usuario registrado = new Usuario();
        usuarios = master.getFileUser();
        if(PassReg.getPassword().length == 0){
            separadorPassR.setBackground(new Color(239,83,80));
            separadorPassR.setForeground(new Color(239,83,80));
            ErrorRegPass.setText("Ingresa una Contraseña...");
        }else{
            registrado.setPassword(PassReg.getText().toString());
            separadorPassR.setBackground(new Color(255,255,255));
            separadorPassR.setForeground(new Color(255,255,255));
            ErrorRegPass.setText("");
        }
        if(NombreReg.getText().equals("")){
            separadorNombreR.setBackground(new Color(239,83,80));
            separadorNombreR.setForeground(new Color(239,83,80));
            ErrorRegN.setText("Ingresa un nombre...");
        }else{
            registrado.setNombre(NombreReg.getText());
            separadorNombreR.setBackground(new Color(255,255,255));
            separadorNombreR.setForeground(new Color(255,255,255));
            ErrorRegN.setText("");
        }
        if(ApellidosReg.getText().equals("")){
            separadorPassR.setBackground(new Color(239,83,80));
            separadorPassR.setForeground(new Color(239,83,80));
            ErrorRegA.setText("Ingresa un apellido...");
        }else{
            registrado.setApellido(ApellidosReg.getText());
            separadorPassR.setBackground(new Color(255,255,255));
            separadorPassR.setForeground(new Color(255,255,255));
            ErrorRegA.setText("");
        }
        if(MailReg.getText().equals("")){
            separadorMail.setBackground(new Color(239,83,80));
            separadorMail.setForeground(new Color(239,83,80));
            ErrorRegC.setText("Ingresa un correo...");
        }else if(!MailReg.getText().contains("@") && !MailReg.getText().contains(".")){
            separadorMail.setBackground(new Color(239,83,80));
            separadorMail.setForeground(new Color(239,83,80));
            ErrorRegC.setText("Ingresa bien el correo...");
        }else{
            registrado.setMail(MailReg.getText());
            separadorMail.setBackground(new Color(255,255,255));
            separadorMail.setForeground(new Color(255,255,255));
            ErrorRegC.setText("");
        }
        if(UserReg.getText().equals("")){
            separadorNombreR.setBackground(new Color(239,83,80));
            separadorNombreR.setForeground(new Color(239,83,80));
            ErrorRegU.setText("Ingresa un nombre...");
        }else{
           registrado.setUserName(UserReg.getText());
           separadorNombreR.setBackground(new Color(255,255,255));
           separadorNombreR.setForeground(new Color(255,255,255));
           ErrorRegU.setText("");
        }
        registrado.setACoins(0);
        registrado.setID(usuarios.size());
        if(!registrado.getNombre().equals("") && !registrado.getApellido().equals("") && !registrado.getMail().equals("") 
                && !registrado.getUserName().equals("") && !registrado.getPassword().equals("")){
            registrado.setFileUser(usuarios);
            JOptionPane.showMessageDialog(null,"El Usuario se ha registrado con Exito");
            PanelLogin.remove(PanelRegistro);
            PanelLogin.repaint();
            PanelLogin.revalidate();

            PanelLogin.add(PanelEntrada,BorderLayout.CENTER);
            PanelLogin.repaint();
            PanelLogin.revalidate();
        }else{
            System.out.println("Faltan Datos");
        }
    }//GEN-LAST:event_BotonRegistrarMouseClicked

    private void DestinosBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DestinosBMouseClicked
        UsuarioPanel.removeAll();
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(ToolBarUser,BorderLayout.NORTH);
        UsuarioPanel.add(PanelDestinos,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_DestinosBMouseClicked

    private void EditAvionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAvionesMouseClicked
        AdminPanel.removeAll();
        AdminPanel.repaint();
        AdminPanel.revalidate();
        
        AdminPanel.add(ToolBarAdmin,BorderLayout.NORTH);
        AdminPanel.add(EditarAviones,BorderLayout.CENTER);
        AdminPanel.repaint();
        AdminPanel.revalidate();
    }//GEN-LAST:event_EditAvionesMouseClicked

    private void LlegadasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LlegadasBMouseClicked
        UsuarioPanel.removeAll();
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(ToolBarUser,BorderLayout.NORTH);
        UsuarioPanel.add(PanelLlegadas,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_LlegadasBMouseClicked

    private void SalidasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidasBMouseClicked
        UsuarioPanel.removeAll();
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(ToolBarUser,BorderLayout.NORTH);
        UsuarioPanel.add(PanelSalidas,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_SalidasBMouseClicked

    private void nombreAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreAdminMouseClicked
        UsuarioPanel.removeAll();
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(ToolBarUser,BorderLayout.NORTH);
        UsuarioPanel.add(PanelOpUser,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_nombreAdminMouseClicked

    private void lapiznom_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiznom_userMouseClicked
        boolean g;
        do
        {
            entrada = JOptionPane.showInputDialog("Ingresa tu nuevo nombre de usuario: ");
            if(entrada.length() >0)
                g = true;
            else
                g=false;
        }while(g!=true);
        actual.setUserName(entrada);
        NombreUsuario.setText(entrada);
        usuarios.get(actual.getID()).setUserName(entrada);
        master.editFileUser(usuarios);
    }//GEN-LAST:event_lapiznom_userMouseClicked

    private void lapiz_nomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiz_nomMouseClicked
        boolean g;
        do
        {
            newname = JOptionPane.showInputDialog("Ingresa tu Nombre: ");
            if(newname.length() >0)
                g = true;
            else
                g=false;
        }while(g!=true);
        actual.setNombre(newname);
        Nombre.setText(newname);
        usuarios.get(actual.getID()).setNombre(newname);
        master.editFileUser(usuarios);
    }//GEN-LAST:event_lapiz_nomMouseClicked

    private void lapiz_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiz_apellidoMouseClicked
        boolean g;
        do
        {
            newapellido = JOptionPane.showInputDialog("Ingresa tu Apellido: ");
            if(newapellido.length() >0)
                g = true;
            else
                g=false;
        }while(g!=true);
        actual.setNombre(newapellido);
        Apellido.setText(newapellido);
        usuarios.get(actual.getID()).setApellido(newapellido);
        master.editFileUser(usuarios);
    }//GEN-LAST:event_lapiz_apellidoMouseClicked

    private void lapiz_passwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiz_passwMouseClicked
        boolean g;
        do
        {
            newpassw = JOptionPane.showInputDialog("Ingresa tu nuevo password: ");
            if(newpassw.length() >0)
                g = true;
            else
                g=false;
        }while(g!=true);
        actual.setNombre(newpassw);
        Contraseña.setText(newpassw);
        usuarios.get(actual.getID()).setPassword(newpassw);
        master.editFileUser(usuarios);
    }//GEN-LAST:event_lapiz_passwMouseClicked
    private void EditSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditSalidasMouseClicked
        AdminPanel.removeAll();
        AdminPanel.repaint();
        AdminPanel.revalidate();
        
        AdminPanel.add(ToolBarAdmin,BorderLayout.NORTH);
        AdminPanel.add(EditarSalidas,BorderLayout.CENTER);
        AdminPanel.repaint();
        AdminPanel.revalidate();
    }//GEN-LAST:event_EditSalidasMouseClicked

    private void EditLlegadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditLlegadasMouseClicked
        AdminPanel.removeAll();
        AdminPanel.repaint();
        AdminPanel.revalidate();
        
        AdminPanel.add(ToolBarAdmin,BorderLayout.NORTH);
        AdminPanel.add(EditarLlegadas,BorderLayout.CENTER);
        AdminPanel.repaint();
        AdminPanel.revalidate();
    }//GEN-LAST:event_EditLlegadasMouseClicked

    private void EditUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditUsuariosMouseClicked
        AdminPanel.removeAll();
        AdminPanel.repaint();
        AdminPanel.revalidate();
        
        AdminPanel.add(ToolBarAdmin,BorderLayout.NORTH);
        AdminPanel.add(EditarUsuarios,BorderLayout.CENTER);
        AdminPanel.repaint();
        AdminPanel.revalidate();
    }//GEN-LAST:event_EditUsuariosMouseClicked

    private void imguserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imguserMouseClicked
        AdminPanel.removeAll();
        AdminPanel.repaint();
        AdminPanel.revalidate();
        
        AdminPanel.add(ToolBarAdmin,BorderLayout.NORTH);
        AdminPanel.add(Inicio,BorderLayout.CENTER);
        AdminPanel.repaint();
        AdminPanel.revalidate();
    }//GEN-LAST:event_imguserMouseClicked


    private void BotonRegistrarAvionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarAvionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarAvionMouseClicked

    private void BotonRegistrarLLegadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarLLegadaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarLLegadaMouseClicked

    private void BotonRegistrarSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarSalidasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarSalidasMouseClicked

    private void lapiz_mailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiz_mailMouseClicked
        boolean g;
        do
        {
            newmail = JOptionPane.showInputDialog("Ingresa tu nuevo nombre: ");
            if(newmail.length() >0)
            g = true;
            else
            g=false;
        }while(g!=true);
        actual.setNombre(newmail);
        Mail.setText(newmail);
        usuarios.get(actual.getID()).setMail(newmail);
        master.editFileUser(usuarios);
    }//GEN-LAST:event_lapiz_mailMouseClicked

    private void lapiz_passw1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiz_passw1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lapiz_passw1MouseClicked

    private void BotonComprarVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonComprarVueloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonComprarVueloMouseClicked

    private void SalirACoinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirACoinsMouseClicked
        ACoins.setVisible(false);
        ACoins.dispose();
    }//GEN-LAST:event_SalirACoinsMouseClicked

    private void lapiz_acoinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiz_acoinsMouseClicked
        ACoins.setVisible(true);
        ACoins.setBounds(0, 0, 400, 200);
        ACoins.setLocationRelativeTo(null);
        ACoinsdisp.setText(String.valueOf(actual.getACoins()));
    }//GEN-LAST:event_lapiz_acoinsMouseClicked

    private void BotonRegistrarACoinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarACoinsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarACoinsMouseClicked

    private void BotonRegistrarACoinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarACoinsActionPerformed
        
        
    }//GEN-LAST:event_BotonRegistrarACoinsActionPerformed

    private void CerrarSesionUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionUserMouseClicked
        int opcion = JOptionPane.showConfirmDialog(null, "Estas a punto de Cerrar Sesion...","Saliendo?",JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
        actual = null;
        remove(UsuarioPanel);
        repaint();
        revalidate();

        add(PanelLogin,BorderLayout.CENTER);
        repaint();
        revalidate();
        }else{
            JOptionPane.showMessageDialog(null,"Perfecto Decidiste Quedarte");
        }
    }//GEN-LAST:event_CerrarSesionUserMouseClicked




    private void myComponents(){
            BufferedImage img = null;
            try{
                img = ImageIO.read(getClass().getResource("/Images/apexFlightsIcon.png"));
            } catch (IOException e){
                e.printStackTrace();
            }
            Image dimg = img;
             setIconImage(dimg);
             setLocationRelativeTo(null);
             cambiarsize(jLabel4,"/Images/_recortado.png");
             cambiarsize(ImagenBienvenidaAdmin,"/Images/Cielo1.jpg");
             cambiarsize(ApexCoinsImg,"/Images/ApexCoins.png");
             
             if(aviones.size() == 0){
                 EditarAviones.remove(ScrollAviones);
                 EditarAviones.repaint();
                 EditarAviones.revalidate();
                 System.out.println("No Aviones");
             }else{
                 
             }
             
             if(salidas.size() == 0){
                 EditarSalidas.remove(ScrollSalidas);
                 EditarSalidas.repaint();
                 EditarSalidas.revalidate();
                 System.out.println("No Salidas");
             }else{
                 
             }
             
             if(usuarios.size() == 0){
                 EditarUsuarios.remove(ScrollUsuarios);
                 EditarUsuarios.repaint();
                 EditarUsuarios.revalidate();
                 System.out.println("No Usuarios");
             }else{
                 
             }
             
             if(llegadas.size() == 0){
                 EditarLlegadas.remove(ScrollLLegadas);
                 EditarLlegadas.repaint();
                 EditarLlegadas.revalidate();
                 System.out.println("No Llegadas");
             }else{
                 
             }
    }
    
    private void cambiarsize(JLabel jl,String url_imagen){
          BufferedImage img = null;
            try {
                img = ImageIO.read(getClass().getResource(url_imagen));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(jl.getWidth(), jl.getHeight(),
        Image.SCALE_SMOOTH);
             jl.setIcon(new ImageIcon(dimg));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ACoins;
    private javax.swing.JLabel ACoinsdisp;
    private javax.swing.JLabel Acoins1;
    private javax.swing.JLabel AdminName2;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField ApellidosReg;
    private javax.swing.JLabel ApexCoins;
    private javax.swing.JLabel ApexCoinsImg;
    private javax.swing.JButton BotonComprarVuelo;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonRegistrarACoins;
    private javax.swing.JButton BotonRegistrarAvion;
    private javax.swing.JButton BotonRegistrarLLegada;
    private javax.swing.JButton BotonRegistrarSalidas;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel CerrarSesionUser;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Contraseña1;
    private javax.swing.JLabel DestinosB;
    private javax.swing.JLabel EditAviones;
    private javax.swing.JLabel EditLlegadas;
    private javax.swing.JLabel EditSalidas;
    private javax.swing.JLabel EditUsuarios;
    private javax.swing.JPanel EditarAviones;
    private javax.swing.JPanel EditarLlegadas;
    private javax.swing.JPanel EditarSalidas;
    private javax.swing.JPanel EditarUsuarios;
    private javax.swing.JLabel ErrorName;
    private javax.swing.JLabel ErrorPass;
    private javax.swing.JLabel ErrorRegA;
    private javax.swing.JLabel ErrorRegC;
    private javax.swing.JLabel ErrorRegN;
    private javax.swing.JLabel ErrorRegPass;
    private javax.swing.JLabel ErrorRegU;
    private javax.swing.JLabel FondoLLegadas;
    private javax.swing.JLabel FondoOpciones;
    private javax.swing.JLabel FondouserSalidas;
    private javax.swing.JLabel IconoSuperior;
    private javax.swing.JLabel IconoSuperior1;
    private javax.swing.JPanel Imagen;
    private javax.swing.JLabel ImagenBienvenidaAdmin;
    private javax.swing.JLabel Informaciondetarjeta;
    private javax.swing.JPanel Inicio;
    private javax.swing.JLabel LabelEUsuarios;
    private javax.swing.JLabel LabelNoSalidas;
    private javax.swing.JLabel LlegadasB;
    private javax.swing.JLabel Mail;
    private javax.swing.JLabel Mail1;
    private javax.swing.JTextField MailReg;
    private javax.swing.JLabel MarcoUser;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel Navegacion;
    private javax.swing.JPanel NavegacionAdmin;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JTextField NombreReg;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JLabel NombreUsuario1;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel OpcionesUsuario;
    private javax.swing.JPanel OpcionesUsuarioAdmin;
    private javax.swing.JLabel PagoElectronico;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelBotones1;
    private javax.swing.JPanel PanelDestinos;
    private javax.swing.JPanel PanelEntrada;
    private javax.swing.JPanel PanelLlegadas;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelOpUser;
    private javax.swing.JPanel PanelPresentacion;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelPrincipal1;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JPanel PanelSalidas;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JPasswordField PassReg;
    private javax.swing.JLabel Registro;
    private javax.swing.JLabel SalidasB;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SalirACoins;
    private javax.swing.JScrollPane ScrollAviones;
    private javax.swing.JScrollPane ScrollLLegadas;
    private javax.swing.JScrollPane ScrollSalidas;
    private javax.swing.JScrollPane ScrollUsuarios;
    private javax.swing.JSeparator SeparadorUsername;
    private javax.swing.JTable TablaAviones;
    private javax.swing.JScrollPane TablaConsultaLLegadas;
    private javax.swing.JTable TablaLLegadas;
    private javax.swing.JTable TablaLlegadas;
    private javax.swing.JTable TablaSalidas;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JLabel TextoLogin1;
    private javax.swing.JLabel TextoLogin2;
    private javax.swing.JLabel TextoPass;
    private javax.swing.JLabel TextoPass1;
    private javax.swing.JLabel TextoPass2;
    private javax.swing.JLabel TextoPass3;
    private javax.swing.JLabel TextoPass4;
    private javax.swing.JLabel TextoPass5;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JLabel TextoUser;
    private javax.swing.JLabel TituloEditar;
    private javax.swing.JPanel ToolBarAdmin;
    private javax.swing.JPanel ToolBarUser;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel UserImage;
    private javax.swing.JTextField UserReg;
    private javax.swing.JPanel UsuarioPanel;
    private javax.swing.JLabel fodoESalidas;
    private javax.swing.JLabel fondoELlegadas;
    private javax.swing.JLabel fondoEditA;
    private javax.swing.JLabel fondoEditA1;
    private javax.swing.JLabel imguser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelLLegadas;
    private javax.swing.JLabel lapiz_acoins;
    private javax.swing.JLabel lapiz_apellido;
    private javax.swing.JLabel lapiz_inforcard;
    private javax.swing.JLabel lapiz_mail;
    private javax.swing.JLabel lapiz_mail1;
    private javax.swing.JLabel lapiz_nom;
    private javax.swing.JLabel lapiz_pagoelec;
    private javax.swing.JLabel lapiz_passw;
    private javax.swing.JLabel lapiz_passw1;
    private javax.swing.JLabel lapiznom_user;
    private javax.swing.JLabel noLLegadas;
    private javax.swing.JLabel nombreAdmin;
    private javax.swing.JLabel nombreUser;
    private javax.swing.JLabel nombreuser;
    private javax.swing.JSeparator separadorApellidosR;
    private javax.swing.JSeparator separadorMail;
    private javax.swing.JSeparator separadorNombre;
    private javax.swing.JSeparator separadorNombreR;
    private javax.swing.JSeparator separadorPassR;
    private javax.swing.JSeparator separadorPassword;
    private javax.swing.JLabel textoNoUsers;
    // End of variables declaration//GEN-END:variables
}
