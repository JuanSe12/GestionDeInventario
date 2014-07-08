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
public class Salida_Producto {
    boolean Tipo_Salida;
    int producto_id;
    int nrm_producto_salida;
    int precio_total;
    String fch_salida;
    int cliente_id;

    public boolean isTipo_Salida() {
        return Tipo_Salida;
    }

    public void setTipo_Salida(boolean Tipo_Salida) {
        this.Tipo_Salida = Tipo_Salida;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getNrm_producto_salida() {
        return nrm_producto_salida;
    }

    public void setNrm_producto_salida(int nrm_producto_salida) {
        this.nrm_producto_salida = nrm_producto_salida;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    public String getFch_salida() {
        return fch_salida;
    }

    public void setFch_salida(String fch_salida) {
        this.fch_salida = fch_salida;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
    public void setcliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    public void registrar_salida(){
        
    }
}
