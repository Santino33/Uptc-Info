package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaCrearUsuario extends JFrame implements IVista{
    private JPanel panelEncabezado;
    private JLabel lbltitulo;

    private JPanel panelTexto;
    private JLabel lblTexto;

    private JPanel botonesPanel;
    private JButton btnCrearAdministrativo;
    private JButton btnCrearEstudiante;
    private String tipografia;

    public VentanaCrearUsuario(){
        this.setTitle("Crear Usuario");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        GridBagConstraints gbc = new GridBagConstraints();


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
        lblTexto = new JLabel("¿Que tipo de usuario desea crear?");
        lblTexto.setFont(new Font(tipografia, Font.PLAIN, 12));
        panelTexto.add(lblTexto);

        //panel botones y action command
        botonesPanel = new JPanel();
        botonesPanel.setLayout(new GridLayout(1, 2));
        btnCrearEstudiante = new JButton("Estudiante");
        btnCrearEstudiante.setActionCommand("formulario estudiante");

        btnCrearAdministrativo = new JButton("Administrativo");
        btnCrearAdministrativo.setActionCommand("formulario administrativo");

        //
        gbc.gridx = 1; // Posición x
        gbc.gridy = 0; // Posición y
        gbc.weightx = 1; // Espacio horizontal
        gbc.anchor = GridBagConstraints.CENTER; // Alinear al centro
        gbc.insets = new Insets(0, 5, 0, 0);
        botonesPanel.add(btnCrearEstudiante, gbc);
        botonesPanel.add(btnCrearAdministrativo, gbc);


        //agregar panel encabezado y botones
        this.getContentPane().setLayout(new BorderLayout());
        this.add(panelEncabezado, BorderLayout.NORTH);
        this.add(panelTexto, BorderLayout.CENTER);
        this.add(botonesPanel, BorderLayout.SOUTH);

    }

    @Override
    public void mostrar(boolean visible) {
        this.setVisible(visible);
    }

    public JButton getBtnCrearAdministrativo() {
        return btnCrearAdministrativo;
    }

    public JButton getBtnCrearEstudiante() {
        return btnCrearEstudiante;
    }
}
