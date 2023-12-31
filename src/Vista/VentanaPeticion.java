package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPeticion extends JFrame implements IVista{
    private JPanel panelTitulo;
    private JLabel lblTitulo;
    private JPanel panelInputs;
    private InputText inputCedula;
    private InputText inputContrasena;
    private JPanel panelBoton;
    private JButton boton;
    private String tipografia;

    public VentanaPeticion(){
        this.setTitle("Credenciales");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        //Panel Titulo
        panelTitulo = new JPanel();
        panelTitulo.setBackground(Color.orange);

        //Titulo
        lblTitulo = new JLabel("Digite sus datos institucionales");
        tipografia = "Dialog";
        lblTitulo.setFont(new Font(tipografia, Font.BOLD, 14));
        panelTitulo.add(lblTitulo);

        //panel inputs
        panelInputs = new JPanel();
        panelInputs.setLayout(new GridLayout(2, 1));

        //input cedula
        inputCedula = new InputText();
        panelInputs.add(new JLabel("Cédula:"));
        panelInputs.add(inputCedula);

        //input contrasena
        inputContrasena = new InputText();
        panelInputs.add(new JLabel("Contraseña:"));
        panelInputs.add(inputContrasena);

        //boton
        panelBoton = new JPanel();
        boton = new JButton("Ingresar");
        boton.setActionCommand("ver datos");
        panelBoton.add(boton);

        this.add(panelTitulo, BorderLayout.NORTH);
        this.add(panelInputs, BorderLayout.CENTER);
        this.add(panelBoton, BorderLayout.SOUTH);

    }

    @Override
    public void mostrar(boolean visible) {
        this.setVisible(visible);
    }

    public JButton getBoton() {
        return boton;
    }
}
