/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biclioteca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author rodrigo
 */
public abstract class ListaLibro {

    private static Libro[] lista1 = new Libro[50];
    //Elementos para guardar el archivo
    private static String archivo = "libro.db";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;

    public static boolean addLibro(Libro l) {
        for (int i = 0; i < lista1.length; i++) {
            if (lista1[i] == null) {
                lista1[i] = l;
                return true;
            }
        }
        return false;
    }

    public static Libro[] getLista() {
        return lista1;
    }
    
    public static void setLista(Libro[] lista) {
        ListaLibro.lista1 = lista;
    }

    public static boolean saveLista() {

        boolean saved = false;

        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            //Esta es otra forma de hacer un for, la sintaxis es la siguiente:
            //for (Clase aux:array), recorre el array y se lo asigna al auxiliar.
            oos.writeObject(lista1);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
            return false;
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo");
            return false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }

        System.out.println("Guardado Correctamente");
        return true;
    }

    /*
     * Devuelve un arraylist con las ventas en disco
     */
    public static boolean levantarObjetoEntero() {
        Libro[] aux = null;

        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            aux = (Libro[]) ois.readObject();
            

        } catch (Exception e1) {
            System.out.println("Error!!!" + e1);
            return false;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        
        lista1= aux;
        return true;

    }

public static String buscarLibro(String libro) {
    for (int i=0; i<=lista1.length; i++){
        if (lista1[i].getNombre().equals(libro)){
            return lista1[i].toString();
                 
        }
            
    }
    
    return null;
    } 
}
