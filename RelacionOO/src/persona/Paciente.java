/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import relacionOO.Dolencia;
import relacionOO.Fecha;

/**
 *
 * @author Malkien
 */
public class Paciente  extends Persona{
    private Dolencia dolencia;
    private Fecha fechaPrimCita;
    private Fecha fechaUltiCita;
    private int diasEntreCitas;
    private int citasRestantes;
    private Fecha fechaProxiCita;

    public Paciente(Dolencia dolencia, Fecha fechaPrimCita, Fecha fechaUltiCita, int diasEntreCitas, int citasRestantes, Fecha fechaProxiCita, String dni, String n, int t) {
        super(dni, n, t);
        this.dolencia = dolencia;
        this.fechaPrimCita = fechaPrimCita;
        this.fechaUltiCita = fechaUltiCita;
        this.diasEntreCitas = diasEntreCitas;
        this.citasRestantes = citasRestantes;
        this.fechaProxiCita = fechaProxiCita;
    }

    public Dolencia getDolencia() {
        return dolencia;
    }

    public void setDolencia(Dolencia dolencia) {
        this.dolencia = dolencia;
    }

    public Fecha getFechaPrimCita() {
        return fechaPrimCita;
    }

    public void setFechaPrimCita(Fecha fechaPrimCita) {
        this.fechaPrimCita = fechaPrimCita;
    }

    public Fecha getFechaUltiCita() {
        return fechaUltiCita;
    }

    public void setFechaUltiCita(Fecha fechaUltiCita) {
        this.fechaUltiCita = fechaUltiCita;
    }

    public int getDiasEntreCitas() {
        return diasEntreCitas;
    }

    public void setDiasEntreCitas(int diasEntreCitas) {
        this.diasEntreCitas = diasEntreCitas;
    }

    public int getCitasRestantes() {
        return citasRestantes;
    }

    public void setCitasRestantes(int citasRestantes) {
        this.citasRestantes = citasRestantes;
    }

    public Fecha getFechaProxiCita() {
        return fechaProxiCita;
    }

    public void setFechaProxiCita(Fecha fechaProxiCita) {
        this.fechaProxiCita = fechaProxiCita;
    }
    
    
}
