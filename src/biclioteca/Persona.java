/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor
 */
package biclioteca;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Rodrigo
 */
public class Persona implements Serializable {
    private int dni;
    private String nombre;
    private String curso;
    private String libro;
    private Calendar entrega;
    private Calendar devolucion;

    public Calendar getEntrega() {
        return entrega;
    }

    public void setEntrega(Calendar entrega) {
        this.entrega = entrega;
    }

    public Calendar getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Calendar devolucion) {
        this.devolucion = devolucion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    

    public Persona(int dni, String nombre, String curso, String libro, Calendar entrega, Calendar devolucion) {
        this.dni = dni;
        this.nombre = nombre;
        this.curso = curso;
        this.libro = libro;
        this.entrega = entrega;
        this.devolucion = devolucion;
    }
    
    @Override 
    public String toString() {
        return "La persona es " + "" + nombre + ", libro " + libro + ", curso " + curso;
    }
    

    

}