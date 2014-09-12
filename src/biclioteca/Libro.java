/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biclioteca;

import java.io.Serializable;
/*
 *
 * @author rodrigo
 */
public class Libro implements Serializable {
    
    private String nombre; 
    private String seccion; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Libro(String nombre, String seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return " Libro es " + "" + nombre + ", seccion " + seccion;
    }
    
}
