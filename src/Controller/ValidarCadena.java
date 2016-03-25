/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Reymundo Tenorio
 */
public class ValidarCadena {

    public static boolean ValidarCorreo(String Correo, Component Padre) {

        if (!Correo.contains("@") && !Correo.contains(".")) {
            JOptionPane.showMessageDialog(Padre, "Dirección de correo electrónico inválido",
                    "Correo inválido", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        return false;

    }

    public static void ValidarCadena(KeyEvent evt) {

        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())&& evt.getKeyChar()!='.'
                && evt.getKeyChar()!=KeyEvent.VK_SPACE) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }

    public static void ValidarEntero(KeyEvent evt) {

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }

    public static void ValidarFloat(JTextField txtFloat, KeyEvent evt) {

        char a = evt.getKeyChar();

        if (!Character.isDigit(a) && !Character.isISOControl(a) && a != '.') {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        if ("0".equals(txtFloat.getText()) && txtFloat.getCaretPosition() == 1 && a != '.' && !Character.isISOControl(a)) {
            txtFloat.setText(txtFloat.getText() + ".");
//        return;
        }

        if (a == '.' && txtFloat.getText().contains(".")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        String x1 = "";
        if (Character.isDigit(a) || (Character.isISOControl(a) && !"".equals(txtFloat.getText()))) {
            x1 = txtFloat.getText();
        }
        if (Character.isDigit(a) || (a == '.')) {
            x1 = txtFloat.getText().concat(String.valueOf(a));
        }

        if (!"".equals(x1)) {

            try {

                Double x = Double.parseDouble(x1);

                if (x > Double.MAX_VALUE) {
                    Toolkit.getDefaultToolkit().beep();
                    evt.consume();
                }

            } catch (NumberFormatException ex) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }
    }
}
