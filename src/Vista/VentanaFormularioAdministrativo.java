package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaFormularioAdministrativo extends JFrame implements IVista{
    private JPanel panelTitulo;
    private JLabel lblTitulo;
    private JPanel panelCampos;
    private JLabel lblCampo;
    private InputText inputCedula;
    private InputText inputContrasena;
    private InputText inputNombre;
    private InputText inputApellido;
    private InputText inputGenero;
    private InputText inputCargo;
    private InputText inputSueldo;
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
            lblCampo = new JLabel();
            lblCampo.setFont(new Font(tipografia, Font.PLAIN, 12));
            switch (i){
                case 0 : {
                    lblCampo.setText("Cedula :");
                    inputCedula = new InputText();
                    panelCampos.add(lblCampo);
                    panelCampos.add(inputCedula);
                    break;
                }
                case 1 : {
                    lblCampo.setText("Contraseña :");
                    inputContrasena = new InputText();
                    panelCampos.add(lblCampo);
                    panelCampos.add(inputContrasena);
                    break;
                }
                case 2 : {
                    lblCampo.setText("Nombre :");
                    inputNombre = new InputText();
                    panelCampos.add(lblCampo);
                    panelCampos.add(inputNombre);
                    break;
                }
                case 3 : {
                    lblCampo.setText("Apellido :");
                    inputApellido = new InputText();
                    panelCampos.add(lblCampo);
                    panelCampos.add(inputApellido);
                    break;
                }
                case 4 : {
                    lblCampo.setText("Genero :");
                    inputGenero = new InputText();
                    panelCampos.add(lblCampo);
                    panelCampos.add(inputGenero);
                    break;
                }
                case 5 : {
                    lblCampo.setText("Cargo :");
                    inputCargo = new InputText();
                    panelCampos.add(lblCampo);
                    panelCampos.add(inputCargo);
                    break;
                }
                case 6 : {
                    lblCampo.setText("Sueldo :");
                    inputSueldo = new InputText();
                    panelCampos.add(lblCampo);
                    panelCampos.add(inputSueldo);
                    break;
                }
            }

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

    public InputText getInputCedula() {
        return inputCedula;
    }

    public InputText getInputContrasena() {
        return inputContrasena;
    }

    public InputText getInputNombre() {
        return inputNombre;
    }

    public InputText getInputApellido() {
        return inputApellido;
    }

    public InputText getInputGenero() {
        return inputGenero;
    }

    public InputText getInputCargo() {
        return inputCargo;
    }

    public InputText getInputSueldo() {
        return inputSueldo;
    }
}
