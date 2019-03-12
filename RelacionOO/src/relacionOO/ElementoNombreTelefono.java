/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionOO;

/**
 *
 * @author Malkien
 */
public abstract class ElementoNombreTelefono extends ElementoNombre{
    private int telefono;
    
    /**
     * Constructor de la Clase
     * @param n El nombre que tendrá
     * @param t El teléfono que tendrá
     */
    public ElementoNombreTelefono(String n, int t){
        super(n);
        this.telefono=t;
    }
    
    /**
     * Getter de telefono
     * @return devuelve el telefono
     */
    public int getTelefono() {
        return telefono;
    }
    
    /**
     * Setter de telefono 
     * @param telefono el télefono que le vas a poner
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
