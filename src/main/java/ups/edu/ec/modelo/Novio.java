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
public class Novio extends Usuario {

    private int codigoHombre;

    public Novio(int codigoHombre, String nombre, String apellido, String cedula,
            String direccion, String fechaNaciemnto, String fechaBoda, String genero,
            String estado) {
        this.codigoHombre = codigoHombre;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCedula(cedula);
        this.setDireccion(direccion);
        this.setFechaNaciemnto(fechaNaciemnto);
        this.setFechaBoda(fechaBoda);
        this.setGenero(genero);
        this.setEstado(estado);
    }

    public int getCodigoHombre() {
        return codigoHombre;
    }

    public void setCodigoHombre(int codigoHombre) {
        this.codigoHombre = codigoHombre;
    }
    

}
