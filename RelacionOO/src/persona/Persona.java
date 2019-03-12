/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import relacionOO.ElementoNombreTelefono;

/**
 *
 * @author Malkien
 */
public abstract class Persona extends ElementoNombreTelefono{
    private String dni;

    /**
     * Constructor de Persona
     * @param dni el dni
     * @param n el nombre
     * @param t  el telefono
     */
    public Persona(String dni, String n, int t) {
        super(n, t);
        this.dni = dni;
    }

    /**
     * Getter de dni
     * @return el valor de dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter de dni
     * @param dni el valor que le vas a poner a dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
