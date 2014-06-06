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
    int referencia;
    int nrm_producto_s;
    int Precio_total;
    String fch_salida;
    String Cliente_Nombre;
    
    public boolean isTipo_Salida() {
        return Tipo_Salida;
    }

    public void setTipo_Salida(boolean Tipo_Salida) {
        this.Tipo_Salida = Tipo_Salida;
    }
    
    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    
    public int getNrm_producto_s() {
        return nrm_producto_s;
    }

    public void setNrm_producto_s(int nrm_producto_s) {
        this.nrm_producto_s = nrm_producto_s;
    }

    public int getPrecio_total() {
        return Precio_total;
    }

    public void setPrecio_total(int Precio_total) {
        this.Precio_total = Precio_total;
    }
    
    public String getFch_salida() {
        return fch_salida;
    }

    public void setFch_salida(String fch_salida) {
        this.fch_salida = fch_salida;
    }
    
    public String getCliente_Nombre() {
        return Cliente_Nombre;
    }

    public void setCliente_Nombre(String Cliente_Nombre) {
        this.Cliente_Nombre = Cliente_Nombre;
    }
    public void registrar_salida(){
        
    }
}
