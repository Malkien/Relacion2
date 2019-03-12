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
public class Dolencia extends ElementoNombre{
    private byte valorGravedad;
    private String tipo;

    /**
     * Constructor de Dolencia
     * @param valorGravedad int de la gravedad de la dolencia desde 0 a 10 (0 la más leve hasta 10 el más grave)
     * @param tipo El tipo de dolencia que solo puede ser "Espalda y Cuello" o "Codos y Rodillas" o "Manos y Pies"
     * @param Nombre El nombre de la dolencia
     */
    public Dolencia(byte valorGravedad, String tipo, String Nombre) {
        super(Nombre);
        this.valorGravedad = valorGravedad;
        this.tipo = ComprobarTipo(tipo);
    }
    
    /**
     * Comproeba el tipo de dolencia que sea "Espalda y Cuello" o "Codos y Rodillas" o "Manos y Pies"
     * @param d La dolencia a comprobar
     * @return La dolencia después de ser comprobado
     */
    public String ComprobarTipo(String d){
        switch (d.toUpperCase()){
            case "ESPADA Y CUELLO":
                return d;
            case "CODOS Y RODILLAS":
                return d;
            case "MANOS Y PIES":
                return d;
        }
        return "";
    }

    /**
     * Getter de ValorGravedad
     * @return devuelve el valor de valorGravedad
     */
    public byte getValorGravedad() {
        return valorGravedad;
    }

    /**
     * Setter de ValorGravedad
     * @param valorGravedad El valor que le vas a asignar a valorGravedad
     */
    public void setValorGravedad(byte valorGravedad) {
        this.valorGravedad = valorGravedad;
    }

    /**
     * Getter de tipo
     * @return devuelve el valor de tipo
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Setter de tipo
     * @param tipo el valor que le vas a poner a tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
