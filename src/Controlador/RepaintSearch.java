/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Reymundo Tenorio
 */
public class RepaintSearch {
    
     public TableCellRenderer getRenderer(JTextField txtbusc) {
        return new TableCellRenderer() {
            JTextField f = new JTextField();

            @Override
            public Component getTableCellRendererComponent(JTable arg0, Object arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
                if (arg1 != null) {
                    f.setText(arg1.toString());
                    String string = arg1.toString().toLowerCase();
                    String Buscar = txtbusc.getText().toLowerCase();
                    if (string.contains(Buscar)) {
                        int indexOf = string.indexOf(Buscar);
                        try {
                            f.getHighlighter().addHighlight(indexOf, indexOf + Buscar.length(), new javax.swing.text.DefaultHighlighter.DefaultHighlightPainter(Color.CYAN));
                        } catch (BadLocationException e) {
                        }
                    }
                } else {
                    f.setText("");
                    f.getHighlighter().removeAllHighlights();
                }
                f.setFont(new java.awt.Font("Tahoma", 0, 14));
                return f;
            }
        };
    }

}
