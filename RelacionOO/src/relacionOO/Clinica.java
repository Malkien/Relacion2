/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionOO;

import persona.Fisioterapeuta;
import persona.Paciente;

/**
 *
 * @author Malkien
 */
public class Clinica extends ElementoNombreTelefono{
    private String direccion;
    private String cif;
    private Fisioterapeuta[] fisioterapeutas=new Fisioterapeuta[3];
    private Paciente[] pacientes=new Paciente[6];

    /**
     * Constructor de Clinica
     * @param direccion La direccion de la clínica
     * @param cif El CIF de la clínica
     * @param fisios El array de los fisioterapéutas de la clinica
     * @param n El nombre de la clínica
     * @param t El teléfono de la clínica
     */
    public Clinica(String direccion, String cif, Fisioterapeuta[] fisios, String n, int t) {
        super(n, t);
        this.direccion = direccion;
        this.cif = cif;
        this.fisioterapeutas=fisios;
    }

    /**
     * Getter de Direccion
     * @return el valor de direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter de direccion
     * @param direccion El valor que le vas a dar a direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter de cif
     * @return devuelve el valor de cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * Setter de cif
     * @param cif el valor que le vas a dar a cif
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * Getter de fisioterapeutas
     * @return el array de los fisioterapeutas;
     */
    public Fisioterapeuta[] getFisioterapeutas() {
        return fisioterapeutas;
    }

    /**
     * Setter de fisioterapeutas
     * @param fisioterapeutas el array que le vas a asignar
     */
    public void setFisioterapeutas(Fisioterapeuta[] fisioterapeutas) {
        this.fisioterapeutas = fisioterapeutas;
    }

    /**
     * Getter de pacientes
     * @return el array de pacientes
     */
    public Paciente[] getPacientes() {
        return pacientes;
    }

    /**
     * Setter de pacientes
     * @param pacientes el array que le vas a asignar
     */
    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }
    
    
}