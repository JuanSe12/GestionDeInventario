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
    int producto_id;
    int nrm_producto_devuelto;
    String fch_devolucion;
    String Descripcion;

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getNrm_producto_devuelto() {
        return nrm_producto_devuelto;
    }

    public void setNrm_producto_devuelto(int nrm_producto_devuelto) {
        this.nrm_producto_devuelto = nrm_producto_devuelto;
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
