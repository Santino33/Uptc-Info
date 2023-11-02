package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaFormularioAdministrativo extends JFrame implements IVista{
    private JPanel panelTitulo;
    private JLabel lblTitulo;
    private JPanel panelCampos;
    private JLabel lblCampo;
    private InputText input;
    private String tipografia;
    private JPanel panelBoton;
    private JButton boton;

    public VentanaFormularioAdministrativo(){
        this.setTitle("Crear Usuario");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        //panel titulo
        panelTitulo = new JPanel();
        panelTitulo.setBackground(Color.orange);
        lblTitulo = new JLabel("Ingrese los datos del nuevo funcionario");
        panelTitulo.add(lblTitulo);

        //panel inputs
        panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(8, 2));
        tipografia = "Dialog";

        for (int i = 0; i < 7; i++){
            input = new InputText();
            lblCampo = new JLabel();
            lblCampo.setFont(new Font(tipografia, Font.PLAIN, 12));
            switch (i){
                case 0 -> lblCampo.setText("Cedula :");
                case 1 -> lblCampo.setText("Contraseña :");
                case 2 -> lblCampo.setText("Nombre :");
                case 3 -> lblCampo.setText("Apellido :");
                case 4 -> lblCampo.setText("Genero :");
                case 5 -> lblCampo.setText("Cargo :");
                case 6 -> lblCampo.setText("Sueldo :");
            }
            panelCampos.add(lblCampo);
            panelCampos.add(input);
        }

        //Panel boton
        panelBoton = new JPanel();
        boton = new JButton("Crear usuario");
        boton.setActionCommand("crear administrativo");
        panelBoton.add(boton);

        this.add(panelTitulo, BorderLayout.NORTH);
        this.add(panelCampos, BorderLayout.CENTER);
        this.add(panelBoton, BorderLayout.SOUTH);

        pack();
    }

    @Override
    public void mostrar(boolean visible) {
        this.setVisible(visible);
    }

    public JButton getBoton() {
        return boton;
    }

    public InputText getInput() {
        return input;
    }
}
