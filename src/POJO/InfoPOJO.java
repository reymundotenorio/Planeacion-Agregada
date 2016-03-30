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
public class InfoPOJO {

    private String HrsUnid;
    private String HorasN;
    private String HorasE;
    private String CtoUnid;
    private String IniTrab;
    private String Contra;
    private String Desp;
    private String OutS;
    private String InvI;
    private String SS;
    private String Mant;

    private String Total;

    public InfoPOJO() {
    }

    public InfoPOJO(String HrsUnid, String HorasN, String HorasE, String CtoUnid, String IniTrab, String Contra, String Desp, String OutS, String InvI, String SS, String Mant, String Total) {
        this.HrsUnid = HrsUnid;
        this.HorasN = HorasN;
        this.HorasE = HorasE;
        this.CtoUnid = CtoUnid;
        this.IniTrab = IniTrab;
        this.Contra = Contra;
        this.Desp = Desp;
        this.OutS = OutS;
        this.InvI = InvI;
        this.SS = SS;
        this.Mant = Mant;
        this.Total = Total;
    }

    public String getHrsUnid() {
        return HrsUnid;
    }

    public void setHrsUnid(String HrsUnid) {
        this.HrsUnid = HrsUnid;
    }

    public String getHorasN() {
        return HorasN;
    }

    public void setHorasN(String HorasN) {
        this.HorasN = HorasN;
    }

    public String getHorasE() {
        return HorasE;
    }

    public void setHorasE(String HorasE) {
        this.HorasE = HorasE;
    }

    public String getCtoUnid() {
        return CtoUnid;
    }

    public void setCtoUnid(String CtoUnid) {
        this.CtoUnid = CtoUnid;
    }

    public String getIniTrab() {
        return IniTrab;
    }

    public void setIniTrab(String IniTrab) {
        this.IniTrab = IniTrab;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getDesp() {
        return Desp;
    }

    public void setDesp(String Desp) {
        this.Desp = Desp;
    }

    public String getOutS() {
        return OutS;
    }

    public void setOutS(String OutS) {
        this.OutS = OutS;
    }

    public String getInvI() {
        return InvI;
    }

    public void setInvI(String InvI) {
        this.InvI = InvI;
    }

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS;
    }

    public String getMant() {
        return Mant;
    }

    public void setMant(String Mant) {
        this.Mant = Mant;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

}
