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
public class Testigo extends Usuario {

    private String testigo;

    public Testigo(String testigo, String nombre, String apellido, String cedula,
            String direccion, String fechaNaciemnto, String fechaBoda, String genero,
            String estado) {
        this.testigo = testigo;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCedula(cedula);
        this.setDireccion(direccion);
        this.setFechaNaciemnto(fechaNaciemnto);
        this.setFechaBoda(fechaBoda);
        this.setGenero(genero);
        this.setEstado(estado);
    }

    public String getTestigo() {
        return testigo;
    }

    public void setTestigo(String testigo) {
        this.testigo = testigo;
    }

}
