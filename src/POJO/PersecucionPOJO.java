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
public class PersecucionPOJO {

    private String Semana;
    private String Produccion_requerida;
    private String Horas_producción_requeridas;
    private String Horas_disponibles;
    private String Cantidad_trabajadores_requeridos;
    private String Cantidad_trabajadores_contratados;
    private String Cantidad_trabajadores_despedidos;
    private String Costo_contratación;
    private String Costo_despido;
    private String Costo_tiempo_normal;
    private String Costo_total;

    public PersecucionPOJO() {
    }

    public PersecucionPOJO(String Semana, String Produccion_requerida, String Horas_producción_requeridas, String Horas_disponibles, String Cantidad_trabajadores_requeridas, String Cantidad_trabajadores_contratados, String Cantidad_trabajadores_despedidos, String Costo_contratación, String Costo_despido, String Costo_tiempo_normal, String Costo_total) {
        this.Semana = Semana;
        this.Produccion_requerida = Produccion_requerida;
        this.Horas_producción_requeridas = Horas_producción_requeridas;
        this.Horas_disponibles = Horas_disponibles;
        this.Cantidad_trabajadores_requeridos = Cantidad_trabajadores_requeridas;
        this.Cantidad_trabajadores_contratados = Cantidad_trabajadores_contratados;
        this.Cantidad_trabajadores_despedidos = Cantidad_trabajadores_despedidos;
        this.Costo_contratación = Costo_contratación;
        this.Costo_despido = Costo_despido;
        this.Costo_tiempo_normal = Costo_tiempo_normal;
        this.Costo_total = Costo_total;
    }

    public String getSemana() {
        return Semana;
    }

    public void setSemana(String Semana) {
        this.Semana = Semana;
    }

    public String getProduccion_requerida() {
        return Produccion_requerida;
    }

    public void setProduccion_requerida(String Produccion_requerida) {
        this.Produccion_requerida = Produccion_requerida;
    }

    public String getHoras_producción_requeridas() {
        return Horas_producción_requeridas;
    }

    public void setHoras_producción_requeridas(String Horas_producción_requeridas) {
        this.Horas_producción_requeridas = Horas_producción_requeridas;
    }

    public String getHoras_disponibles() {
        return Horas_disponibles;
    }

    public void setHoras_disponibles(String Horas_disponibles) {
        this.Horas_disponibles = Horas_disponibles;
    }

    public String getCantidad_trabajadores_requeridos() {
        return Cantidad_trabajadores_requeridos;
    }

    public void setCantidad_trabajadores_requeridos(String Cantidad_trabajadores_requeridas) {
        this.Cantidad_trabajadores_requeridos = Cantidad_trabajadores_requeridas;
    }

    public String getCantidad_trabajadores_contratados() {
        return Cantidad_trabajadores_contratados;
    }

    public void setCantidad_trabajadores_contratados(String Cantidad_trabajadores_contratados) {
        this.Cantidad_trabajadores_contratados = Cantidad_trabajadores_contratados;
    }

    public String getCantidad_trabajadores_despedidos() {
        return Cantidad_trabajadores_despedidos;
    }

    public void setCantidad_trabajadores_despedidos(String Cantidad_trabajadores_despedidos) {
        this.Cantidad_trabajadores_despedidos = Cantidad_trabajadores_despedidos;
    }

    public String getCosto_contratación() {
        return Costo_contratación;
    }

    public void setCosto_contratación(String Costo_contratación) {
        this.Costo_contratación = Costo_contratación;
    }

    public String getCosto_despido() {
        return Costo_despido;
    }

    public void setCosto_despido(String Costo_despido) {
        this.Costo_despido = Costo_despido;
    }

    public String getCosto_tiempo_normal() {
        return Costo_tiempo_normal;
    }

    public void setCosto_tiempo_normal(String Costo_tiempo_normal) {
        this.Costo_tiempo_normal = Costo_tiempo_normal;
    }

    public String getCosto_total() {
        return Costo_total;
    }

    public void setCosto_total(String Costo_total) {
        this.Costo_total = Costo_total;
    }

}
