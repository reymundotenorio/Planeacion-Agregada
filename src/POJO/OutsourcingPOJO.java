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
public class OutsourcingPOJO {

    private String Semana;
    private String Prod_req;
    private String Hrs_req;
    private String Hrs_disp;
    private String Hrs_disp_N;
    private String Unids_prod;
    private String Unids_falt;
    private String Unids_sobr;
    private String Cost_normal;
    private String Cost_OS;
    private String Cost_mant;
    private String Cost_total;

    public OutsourcingPOJO() {
    }

    public OutsourcingPOJO(String Semana, String Prod_req, String Hrs_req, String Hrs_disp, String Hrs_disp_N, String Unids_prod, String Unids_falt, String Unids_sobr, String Cost_normal, String Cost_OS, String Cost_mant, String Cost_total) {
        this.Semana = Semana;
        this.Prod_req = Prod_req;
        this.Hrs_req = Hrs_req;
        this.Hrs_disp = Hrs_disp;
        this.Hrs_disp_N = Hrs_disp_N;
        this.Unids_prod = Unids_prod;
        this.Unids_falt = Unids_falt;
        this.Unids_sobr = Unids_sobr;
        this.Cost_normal = Cost_normal;
        this.Cost_OS = Cost_OS;
        this.Cost_mant = Cost_mant;
        this.Cost_total = Cost_total;
    }

    public String getSemana() {
        return Semana;
    }

    public void setSemana(String Semana) {
        this.Semana = Semana;
    }

    public String getProd_req() {
        return Prod_req;
    }

    public void setProd_req(String Prod_req) {
        this.Prod_req = Prod_req;
    }

    public String getHrs_req() {
        return Hrs_req;
    }

    public void setHrs_req(String Hrs_req) {
        this.Hrs_req = Hrs_req;
    }

    public String getHrs_disp() {
        return Hrs_disp;
    }

    public void setHrs_disp(String Hrs_disp) {
        this.Hrs_disp = Hrs_disp;
    }

    public String getHrs_disp_N() {
        return Hrs_disp_N;
    }

    public void setHrs_disp_N(String Hrs_disp_N) {
        this.Hrs_disp_N = Hrs_disp_N;
    }

    public String getUnids_prod() {
        return Unids_prod;
    }

    public void setUnids_prod(String Unids_prod) {
        this.Unids_prod = Unids_prod;
    }

    public String getUnids_falt() {
        return Unids_falt;
    }

    public void setUnids_falt(String Unids_falt) {
        this.Unids_falt = Unids_falt;
    }

    public String getUnids_sobr() {
        return Unids_sobr;
    }

    public void setUnids_sobr(String Unids_sobr) {
        this.Unids_sobr = Unids_sobr;
    }

    public String getCost_OS() {
        return Cost_OS;
    }

    public void setCost_OS(String Cost_OS) {
        this.Cost_OS = Cost_OS;
    }

    public String getCost_mant() {
        return Cost_mant;
    }

    public void setCost_mant(String Cost_mant) {
        this.Cost_mant = Cost_mant;
    }

    public String getCost_normal() {
        return Cost_normal;
    }

    public void setCost_normal(String Cost_normal) {
        this.Cost_normal = Cost_normal;
    }

    public String getCost_total() {
        return Cost_total;
    }

    public void setCost_total(String Cost_total) {
        this.Cost_total = Cost_total;
    }

}
