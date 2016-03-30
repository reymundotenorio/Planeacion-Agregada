/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author reymundo
 */
public class DemandaRPOJO {

    private String DemandaP;
    private String DiasLaborables;

    public DemandaRPOJO() {
    }

    public DemandaRPOJO(String DemandaP, String DiasLaborables) {
        this.DemandaP = DemandaP;
        this.DiasLaborables = DiasLaborables;
    }

    public String getDemandaP() {
        return DemandaP;
    }

    public void setDemandaP(String DemandaP) {
        this.DemandaP = DemandaP;
    }

    public String getDiasLaborables() {
        return DiasLaborables;
    }

    public void setDiasLaborables(String DiasLaborables) {
        this.DiasLaborables = DiasLaborables;
    }

}
