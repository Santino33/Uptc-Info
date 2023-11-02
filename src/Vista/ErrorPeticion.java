package Vista;

import javax.swing.*;
import java.awt.*;

public class ErrorPeticion extends JFrame implements IVista{
    private JPanel panelTitulo;
    private JLabel lblTitulo;
    private JPanel panelError;
    private JLabel lblError;
    private JPanel panelboton;
    private JButton botonVolver;

    public ErrorPeticion(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        panelTitulo = new JPanel();
        lblTitulo = new JLabel("Error");
        panelTitulo.add(lblTitulo);

        panelError = new JPanel();
        lblError = new JLabel("Su usuario o contraseña son incorrectos");
        panelError.add(lblError);

        panelboton = new JPanel();
        botonVolver = new JButton("Ingresar datos nuevamente");
        botonVolver.setActionCommand("volver ingresar datos");
        panelboton.add(botonVolver);

        this.add(panelTitulo, BorderLayout.NORTH);
        this.add(panelError, BorderLayout.CENTER);
        this.add(panelboton, BorderLayout.SOUTH);
    }

    public JButton getBotonVolver() {
        return botonVolver;
    }

    @Override
    public void mostrar(boolean visible) {
        this.setVisible(visible);
    }
}
