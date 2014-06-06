/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

/**
 *
 * @author adsi
 */
public class Devolucion_Producto {
    int referencia;
    int nrm_producto_d;
    String fch_devolucion;
    String Descripcion;

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getNrm_producto_d() {
        return nrm_producto_d;
    }

    public void setNrm_producto_d(int nrm_producto_d) {
        this.nrm_producto_d = nrm_producto_d;
    }

    public String getFch_devolucion() {
        return fch_devolucion;
    }

    public void setFch_devolucion(String fch_devolucion) {
        this.fch_devolucion = fch_devolucion;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public void registrar_devolucion(){
        
    }
}
