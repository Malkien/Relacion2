/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Malkien
 */
public class Fisioterapeuta extends Persona{
    private String direccion;
    private String especialidad;
    private Paciente[] pacientesHoy=new Paciente[2];
    
    /**
     * 
     * @param direccion la direccion
     * @param especialidad la especialidad
     * @param dni el dni
     * @param n el nombre
     * @param t el telefono
     */
    public Fisioterapeuta(String direccion, String especialidad, String dni, String n, int t) {
        super(dni, n, t);
        this.direccion = direccion;
        this.especialidad = ComprobarEspecialidad(especialidad);
    }
    
    private String ComprobarEspecialidad(String e){
        switch (e.toUpperCase()){
            case "ESPALDA Y CUELLO":
                return e;
            case "CODOS Y RODILLAS":
                return e;
            case "MANOS Y PIES":
                return e;
        }
        return "";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Paciente[] getPacientesHoy() {
        return pacientesHoy;
    }

    public void setPacientesHoy(Paciente[] pacientesHoy) {
        this.pacientesHoy = pacientesHoy;
    }
    
    
}
