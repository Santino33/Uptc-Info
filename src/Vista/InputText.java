package Vista;

import javax.swing.*;
public class InputText extends JTextField {
    public InputText() {
        this.setSize(50, 20);
    }
    public void setAction(String action){
        this.setActionCommand(action);
    }
}
