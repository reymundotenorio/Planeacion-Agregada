/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;

/**
 *
 * @author Reymundo Tenorio
 */
public class ObtenerRutaSistema {

   
    public URL ObtenerRuta(String NombreArchivo) {
        
           System.out.println(getClass().getResource(NombreArchivo));
          return getClass().getResource(NombreArchivo);
        
    }
    
}
