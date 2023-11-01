package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaSeleccion extends JFrame {
    private JPanel panelEncabezado;
    private JLabel lbltitulo;

    private JPanel panelTexto;
    private JLabel lblTexto;

    private JPanel botonesPanel;
    private JButton btnVerInformacion;
    private JButton btnCrearUsuario;
    private String tipografia;


    public VentanaSeleccion() {
        this.setTitle("Seleccion");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        //Panel encabezado
        panelEncabezado = new JPanel();
        panelEncabezado.setBackground(Color.orange);

        //titulo
        tipografia = "Dialog";
        lbltitulo = new JLabel("Bienvenido a la UPTC");
        lbltitulo.setFont(new Font(tipografia, Font.BOLD, 14));
        panelEncabezado.add(lbltitulo);

        //panel informativo
        panelTexto = new JPanel();
        lblTexto = new JLabel("¿Que desea hacer en la aplicacion?");
        lblTexto.setFont(new Font(tipografia, Font.PLAIN, 12));
        panelTexto.add(lblTexto);

        //panel botones
        botonesPanel = new JPanel();
        botonesPanel.setLayout(new GridLayout(1, 2));
        btnCrearUsuario = new JButton("Crear usuario");
        btnCrearUsuario.setActionCommand("crear usuario");
        btnVerInformacion = new JButton("Ver informacion");
        btnVerInformacion.setActionCommand("ver informacion");
        botonesPanel.add(btnVerInformacion);
        botonesPanel.add(btnCrearUsuario);

        //agregar panel encabezado y botones
        this.getContentPane().setLayout(new BorderLayout());
        this.add(panelEncabezado, BorderLayout.NORTH);
        this.add(panelTexto, BorderLayout.CENTER);
        this.add(botonesPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public JButton getBtnVerInformacion() {
        return btnVerInformacion;
    }

    public JButton getBtnCrearUsuario() {
        return btnCrearUsuario;
    }
}
