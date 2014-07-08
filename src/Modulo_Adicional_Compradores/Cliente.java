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
    String Apellido;
    int Cedula;
    String Direccion;
    boolean Modo_Pago;
    String Ciudad;
    String Email;
    int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public boolean isModo_Pago() {
        return Modo_Pago;
    }

    public void setModo_Pago(boolean Modo_Pago) {
        this.Modo_Pago = Modo_Pago;
    }
    
    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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
