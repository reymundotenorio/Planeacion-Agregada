/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Reymundo Tenorio
 */
public class ObtenerIcono {

   
    public Image ObtenerIcono(String NombreIcono) {
        
          return new ImageIcon(getClass().getResource(NombreIcono)).getImage();
        
    }
    
}
