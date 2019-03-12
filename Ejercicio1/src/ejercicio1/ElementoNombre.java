/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 * Elementos con Nombre
 * @author Malkien
 */
public abstract class ElementoNombre {
    private String Nombre;//Indica el nombre
    
    /**
     * Constructor de la Clase
     * @param Nombre 
     */
    public ElementoNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * Getter de Nombre
     * @return nombre
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * Setter de Nombre
     * @param Nombre El nombre que le vas a poner
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
