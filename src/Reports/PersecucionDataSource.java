/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import POJO.DemandaRPOJO;
import POJO.InfoPOJO;
import POJO.PersecucionPOJO;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Reymundo Tenorio
 */
public class PersecucionDataSource implements JRDataSource {

    private List<PersecucionPOJO> Persecucion = new ArrayList<PersecucionPOJO>();
    private List<DemandaRPOJO> Demanda = new ArrayList<DemandaRPOJO>();
    private List<InfoPOJO> Informacion = new ArrayList<InfoPOJO>();

    private int iterator = -1;

    @Override
    public boolean next() throws JRException {

        return ++iterator < Persecucion.size();

    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;

        //Persecución
        if ("Semana".equals(jrf.getName())) {
            valor = Persecucion.get(iterator).getSemana();
        }
        if ("Prod_req".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getProduccion_requerida();
        }
        if ("Hrs_req".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getHoras_producción_requeridas();
        }

        if ("Hrs_disp".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getHoras_disponibles();
        }

        if ("Trab_req".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getCantidad_trabajadores_requeridos();
        }

        if ("Trab_cont".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getCantidad_trabajadores_contratados();
        }

        if ("Trab_desp".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getCantidad_trabajadores_despedidos();
        }

        if ("Cost_cont".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getCosto_contratación();
        }

        if ("Cost_desp".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getCosto_despido();
        }
        if ("Cost_normal".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getCosto_tiempo_normal();
        }

        if ("Cost_total".equals(jrf.getName())) {

            valor = Persecucion.get(iterator).getCosto_total();
        }

        //Informacion
        if ("Hrs_unid".equals(jrf.getName())) {

            valor = Informacion.get(0).getHrsUnid();
        }
        if ("Cto_hrs_N".equals(jrf.getName())) {

            valor = Informacion.get(0).getHorasN();
        }
        if ("Cto_hrs_E".equals(jrf.getName())) {

            valor = Informacion.get(0).getHorasE();
        }
        if ("Cto_unid".equals(jrf.getName())) {

            valor = Informacion.get(0).getCtoUnid();
        }
        if ("Cant_ini_trab".equals(jrf.getName())) {

            valor = Informacion.get(0).getIniTrab();
        }
        if ("Cto_x_contra".equals(jrf.getName())) {

            valor = Informacion.get(0).getContra();
        }
        if ("Cto_x_desp".equals(jrf.getName())) {

            valor = Informacion.get(0).getDesp();
        }
        if ("Cto_OutS".equals(jrf.getName())) {

            valor = Informacion.get(0).getOutS();
        }
        if ("Inv_ini".equals(jrf.getName())) {

            valor = Informacion.get(0).getInvI();
        }
        if ("Stock_s".equals(jrf.getName())) {

            valor = Informacion.get(0).getSS();
        }
        if ("Cto_mant".equals(jrf.getName())) {

            valor = Informacion.get(0).getMant();
        }

        if ("Total".equals(jrf.getName())) {

            valor = Informacion.get(0).getTotal();
        }

        //Demanda
        if ("DemandaP".equals(jrf.getName())) {

            valor = Demanda.get(iterator).getDemandaP();
        }
        if ("DiasLab".equals(jrf.getName())) {

            valor = Demanda.get(iterator).getDiasLaborables();
        }

//        System.out.println("INTERTOR: " + iterator);

        return valor;
    }

    public void addValor(PersecucionPOJO A) {
        this.Persecucion.add(A);
    }

    public void addValorDemanda(DemandaRPOJO A) {
        this.Demanda.add(A);
    }

    public void addValorInfo(InfoPOJO A) {
        this.Informacion.add(A);
    }

}
