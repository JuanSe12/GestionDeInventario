/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo_Adicional_Compradores;

/**
 *
 * @author adsi
 */
public class Cliente {
    String nombre;
    String apellido;
    int cedula;
    String direccion;
    boolean modo_Pago;
    String ciudad;
    String email;
    int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isModo_Pago() {
        return modo_Pago;
    }

    public void setModo_Pago(boolean modo_Pago) {
        this.modo_Pago = modo_Pago;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void Productos_Comprados(){
        
    }
    
    public void Productos_Devueltos(){
        
    }
}
