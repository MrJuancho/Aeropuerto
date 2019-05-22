package Vista;

import Controlador.Admin;
import Controlador.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
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
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Principal extends JFrame {
    Usuario master = new Usuario();
    Admin masterAd = new Admin();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Admin> admins = new ArrayList<Admin>();
    Usuario actual;
    Admin adminactual;
    
    public Principal() {
        initComponents();
        myComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        UsuarioPanel = new javax.swing.JPanel();
        ToolBarUser = new javax.swing.JPanel();
        Navegacion = new javax.swing.JPanel();
        SalidasB = new javax.swing.JLabel();
        LlegadasB = new javax.swing.JLabel();
        DestinosB = new javax.swing.JLabel();
        OpcionesUsuario = new javax.swing.JPanel();
        nombreUser = new javax.swing.JLabel();
        nombreAdmin = new javax.swing.JLabel();
        PanelLlegadas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLlegadas = new javax.swing.JTable();
        PanelOpUser = new javax.swing.JPanel();
        Imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FondoOpciones = new javax.swing.JLabel();
        Opciones = new javax.swing.JPanel();
        MarcoUser = new javax.swing.JLabel();
        UserImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PanelSalidas = new javax.swing.JPanel();
        PanelDestinos = new javax.swing.JPanel();
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
        PanelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        IconoSuperior = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("ApexFlights");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("principalframe"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

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
        NavegacionAdmin.add(EditSalidas);

        EditLlegadas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EditLlegadas.setForeground(new java.awt.Color(255, 255, 255));
        EditLlegadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_flight_land_white_24dp.png"))); // NOI18N
        EditLlegadas.setToolTipText("Llegadas");
        NavegacionAdmin.add(EditLlegadas);

        EditAviones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EditAviones.setForeground(new java.awt.Color(255, 255, 255));
        EditAviones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_terrain_white_24dp.png"))); // NOI18N
        EditAviones.setToolTipText("Destinos");
        EditAviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAvionesMouseClicked(evt);
            }
        });
        NavegacionAdmin.add(EditAviones);
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
        OpcionesUsuarioAdmin.add(imguser);

        ToolBarAdmin.add(OpcionesUsuarioAdmin, java.awt.BorderLayout.LINE_END);

        AdminPanel.add(ToolBarAdmin, java.awt.BorderLayout.PAGE_START);

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

        nombreUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreUser.setForeground(new java.awt.Color(255, 255, 255));
        OpcionesUsuario.add(nombreUser);

        nombreAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-xhdpi/ic_account_circle_white_24dp.png"))); // NOI18N
        nombreAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nombreAdmin.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        nombreAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreAdminMouseClicked(evt);
            }
        });
        OpcionesUsuario.add(nombreAdmin);

        ToolBarUser.add(OpcionesUsuario, java.awt.BorderLayout.LINE_END);

        UsuarioPanel.add(ToolBarUser, java.awt.BorderLayout.PAGE_START);

        PanelLlegadas.setBackground(new java.awt.Color(255, 255, 255));
        PanelLlegadas.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(950, 720));

        TablaLlegadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Barcelona", "13:45", "65-RBV"},
                {"2", "Puerto Vallarta", "15:50", "376-LW"},
                {"3", "Cancún", "12:30", "78-SDG"},
                {"4", "Munich", "16:15", "DRG-15"},
                {"5", "Paris", "19:35", "MKU-32"}
            },
            new String [] {
                "ID", "Procedencia", "Hora de Llegada", "Numero de Vuelo"
            }
        ));
        TablaLlegadas.setMaximumSize(new java.awt.Dimension(950, 720));
        TablaLlegadas.setMinimumSize(new java.awt.Dimension(950, 720));
        TablaLlegadas.setPreferredSize(new java.awt.Dimension(950, 720));
        jScrollPane1.setViewportView(TablaLlegadas);

        PanelLlegadas.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        UsuarioPanel.add(PanelLlegadas, java.awt.BorderLayout.CENTER);

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
        FondoOpciones.setOpaque(true);
        FondoOpciones.setPreferredSize(new java.awt.Dimension(640, 631));
        Imagen.add(FondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        PanelOpUser.add(Imagen, java.awt.BorderLayout.LINE_START);

        Opciones.setBackground(new java.awt.Color(187, 222, 251));
        Opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MarcoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imagenMarco.png"))); // NOI18N
        Opciones.add(MarcoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        UserImage.setMaximumSize(new java.awt.Dimension(100, 100));
        UserImage.setMinimumSize(new java.awt.Dimension(100, 100));
        UserImage.setPreferredSize(new java.awt.Dimension(100, 100));
        Opciones.add(UserImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" ");
        Opciones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");
        Opciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        Opciones.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre Usuario");
        Opciones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drawable-mdpi/ic_mode_edit_black_24dp.png"))); // NOI18N
        Opciones.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        PanelOpUser.add(Opciones, java.awt.BorderLayout.CENTER);

        UsuarioPanel.add(PanelOpUser, java.awt.BorderLayout.CENTER);

        PanelSalidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        UsuarioPanel.add(PanelSalidas, java.awt.BorderLayout.CENTER);

        PanelDestinos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        UsuarioPanel.add(PanelDestinos, java.awt.BorderLayout.LINE_END);

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
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getUserName().contains(entrada.getUserName()) && usuarios.get(i).getPassword().contains(entrada.getPassword())){
                remove(PanelLogin);
                repaint();
                revalidate();
                
                add(UsuarioPanel,BorderLayout.CENTER);
                repaint();
                revalidate();
                actual = usuarios.get(i);
                nombreUser.setText(actual.getNombre());
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
        for (int i = 0; i < admins.size(); i++) {
            if(admins.get(i).getUsername().contains(entrada.getUserName()) && admins.get(i).getPassword().contains(entrada.getPassword())){
                remove(PanelLogin);
                repaint();
                revalidate();
                
                add(AdminPanel,BorderLayout.CENTER);
                repaint();
                revalidate();
                adminactual = admins.get(i);
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
        if(!registrado.getNombre().equals("") && !registrado.getApellido().equals("") && !registrado.getMail().equals("") 
                && !registrado.getUserName().equals("") && !registrado.getPassword().equals("")){
            registrado.setFileUser(usuarios);
        }else{
            System.out.println("Faltan Datos");
        }
    }//GEN-LAST:event_BotonRegistrarMouseClicked

    private void DestinosBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DestinosBMouseClicked
        UsuarioPanel.remove(PanelOpUser);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(PanelDestinos,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_DestinosBMouseClicked

    private void EditAvionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAvionesMouseClicked
        
    }//GEN-LAST:event_EditAvionesMouseClicked

    private void LlegadasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LlegadasBMouseClicked
        UsuarioPanel.remove(PanelOpUser);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(PanelLlegadas,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_LlegadasBMouseClicked

    private void SalidasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidasBMouseClicked
        UsuarioPanel.remove(PanelOpUser);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(PanelSalidas,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_SalidasBMouseClicked

    private void nombreAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreAdminMouseClicked
        UsuarioPanel.remove(PanelDestinos);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
        
        UsuarioPanel.add(PanelOpUser,BorderLayout.CENTER);
        UsuarioPanel.repaint();
        UsuarioPanel.revalidate();
    }//GEN-LAST:event_nombreAdminMouseClicked

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
             cambiarsize(FondoOpciones,"/Images/_recortado2.png");
             cambiarsize(UserImage,"/Images/milos.jpg");
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
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JTextField ApellidosReg;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel DestinosB;
    private javax.swing.JLabel EditAviones;
    private javax.swing.JLabel EditLlegadas;
    private javax.swing.JLabel EditSalidas;
    private javax.swing.JLabel EditUsuarios;
    private javax.swing.JLabel ErrorName;
    private javax.swing.JLabel ErrorPass;
    private javax.swing.JLabel ErrorRegA;
    private javax.swing.JLabel ErrorRegC;
    private javax.swing.JLabel ErrorRegN;
    private javax.swing.JLabel ErrorRegPass;
    private javax.swing.JLabel ErrorRegU;
    private javax.swing.JLabel FondoOpciones;
    private javax.swing.JLabel IconoSuperior;
    private javax.swing.JPanel Imagen;
    private javax.swing.JLabel LlegadasB;
    private javax.swing.JTextField MailReg;
    private javax.swing.JLabel MarcoUser;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel Navegacion;
    private javax.swing.JPanel NavegacionAdmin;
    private javax.swing.JTextField NombreReg;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel OpcionesUsuario;
    private javax.swing.JPanel OpcionesUsuarioAdmin;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelDestinos;
    private javax.swing.JPanel PanelEntrada;
    private javax.swing.JPanel PanelLlegadas;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelOpUser;
    private javax.swing.JPanel PanelPresentacion;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JPanel PanelSalidas;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JPasswordField PassReg;
    private javax.swing.JLabel Registro;
    private javax.swing.JLabel SalidasB;
    private javax.swing.JLabel Salir;
    private javax.swing.JSeparator SeparadorUsername;
    private javax.swing.JTable TablaLlegadas;
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
    private javax.swing.JPanel ToolBarAdmin;
    private javax.swing.JPanel ToolBarUser;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel UserImage;
    private javax.swing.JTextField UserReg;
    private javax.swing.JPanel UsuarioPanel;
    private javax.swing.JLabel imguser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreAdmin;
    private javax.swing.JLabel nombreUser;
    private javax.swing.JLabel nombreuser;
    private javax.swing.JSeparator separadorApellidosR;
    private javax.swing.JSeparator separadorMail;
    private javax.swing.JSeparator separadorNombre;
    private javax.swing.JSeparator separadorNombreR;
    private javax.swing.JSeparator separadorPassR;
    private javax.swing.JSeparator separadorPassword;
    // End of variables declaration//GEN-END:variables
}
