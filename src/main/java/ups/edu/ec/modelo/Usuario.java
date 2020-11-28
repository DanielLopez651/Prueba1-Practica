/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author user
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String fechaNaciemnto;
    private String fechaBoda;
    private String genero;
    private String estado;

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNaciemnto() {
        return fechaNaciemnto;
    }

    public void setFechaNaciemnto(String fechaNaciemnto) {
        this.fechaNaciemnto = fechaNaciemnto;
    }

    public String getFechaBoda() {
        return fechaBoda;
    }

    public void setFechaBoda(String fechaBoda) {
        this.fechaBoda = fechaBoda;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion=" + direccion + ", fechaNaciemnto=" + fechaNaciemnto + ", fechaBoda=" + fechaBoda + ", genero=" + genero + ", estado=" + estado + '}';
    }
    

}
