package Vista;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VentanaMuestra extends JFrame{
    private JPanel panelDatos;
    private JScrollPane scrollPane;
    private JLabel lblCampo1;
    private JLabel lblCampo2;
    private String tipografia;
    private JPanel botonPanel;
    private JButton salir;

    public VentanaMuestra(HashMap<String, String> datos){

        this.setTitle("Informacion de usuario");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        //panel datos
        panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(datos.size(), 2));
        tipografia = "Dialog";

        //Se llena con los datos proporcionados
        for (int i = 0; i < datos.size(); i++){
            Map.Entry<String, String> entry = getElementByIndex(datos, i);

            if (entry != null){
                lblCampo1 = new JLabel(entry.getKey());
                lblCampo1.setFont(new Font(tipografia, Font.BOLD, 12));
                panelDatos.add(lblCampo1);

                lblCampo2 = new JLabel(entry.getValue());
                lblCampo2.setFont(new Font(tipografia, Font.PLAIN, 12));
                panelDatos.add(lblCampo2);
            }
        }

        //Se agrega JSCroll en caso de que sean muchos
        scrollPane = new JScrollPane(panelDatos);
        getContentPane().add(scrollPane);

        //Panel boton
        botonPanel = new JPanel();
        salir = new JButton("Volver");
        botonPanel.add(salir);

        //Agregar paneles
        this.add(panelDatos, BorderLayout.CENTER);
        this.add(botonPanel, BorderLayout.SOUTH);

        //Ajustar el tamaño de los componentes automaticamente
        pack();
        this.setVisible(true);
    }

    private <K, V> Map.Entry<K, V> getElementByIndex(HashMap<K, V> hashMap, int index) {
        int counter = 0;
        for (Map.Entry<K, V> entry : hashMap.entrySet()) {
            if (counter == index) {
                return entry;
            }
            counter++;
        }
        return null;
    }

    public JButton getSalir() {
        return salir;
    }
}
