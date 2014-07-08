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
public class Entrada_Producto {
   boolean tipo_Entrada;
   String nombre_producto;
   int nrm_producto_entrada;
   int precio;
   String fch_entrada; 

    public boolean isTipo_Entrada() {
        return tipo_Entrada;
    }

    public void setTipo_Entrada(boolean tipo_Entrada) {
        this.tipo_Entrada = tipo_Entrada;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getNrm_producto_entrada() {
        return nrm_producto_entrada;
    }

    public void setNrm_producto_entrada(int nrm_producto_entrada) {
        this.nrm_producto_entrada = nrm_producto_entrada;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFch_entrada() {
        return fch_entrada;
    }

    public void setFch_entrada(String fch_entrada) {
        this.fch_entrada = fch_entrada;
    }

    public void registrar_entrada(){
        
    }
}
