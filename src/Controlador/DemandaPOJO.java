/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author reymundo
 */
public class DemandaPOJO {
    
    
    private String Nombre;
    private float DemandaP;
    private int DiasLaborables;

    public DemandaPOJO() {
    }

    public DemandaPOJO(String Nombre, float DemandaP, int DiasLaborables) {
        this.Nombre = Nombre;
        this.DemandaP = DemandaP;
        this.DiasLaborables = DiasLaborables;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getDemandaP() {
        return DemandaP;
    }

    public void setDemandaP(float DemandaP) {
        this.DemandaP = DemandaP;
    }

    public int getDiasLaborables() {
        return DiasLaborables;
    }

    public void setDiasLaborables(int DiasLaborables) {
        this.DiasLaborables = DiasLaborables;
    }
    
    
}
