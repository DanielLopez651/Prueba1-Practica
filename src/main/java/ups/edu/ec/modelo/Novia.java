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

    

    public Novia( String nombre, String apellido, String cedula,
            String direccion, String fechaNaciemnto, String fechaBoda, String genero,
            String estado) {
        
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCedula(cedula);
        this.setDireccion(direccion);
        this.setFechaNaciemnto(fechaNaciemnto);
        this.setFechaBoda(fechaBoda);
        this.setGenero(genero);
        this.setEstado(estado);
    }

 

}
