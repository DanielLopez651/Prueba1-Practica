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
public class Novia extends Usuario {

    private int codigoNovia;

    public Novia(int codigoNovia, String nombre, String apellido, String cedula,
            String direccion, String fechaNaciemnto, String fechaBoda, String genero,
            String estado) {
        this.codigoNovia = codigoNovia;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCedula(cedula);
        this.setDireccion(direccion);
        this.setFechaNaciemnto(fechaNaciemnto);
        this.setFechaBoda(fechaBoda);
        this.setGenero(genero);
        this.setEstado(estado);
    }

    public int getCodigoNovia() {
        return codigoNovia;
    }

    public void setCodigoNovia(int codigoNovia) {
        this.codigoNovia = codigoNovia;
    }

}
