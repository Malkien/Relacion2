/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionOO;

/**
 * Clase de Fecha, ten en cuenta de no pasarte mucho con las fechas, ya que día y mes son byte y el año es short.
 * @author Malkien
 */
public class Fecha {
    byte dia;
    byte mes;
    short año;
    /**
     * Contructor de Fecha
     * @param dia dia
     * @param mes mes
     * @param año año
     */
    public Fecha(byte dia, byte mes, short año) {
        this.año=año;
        this.mes=mes;
        this.dia=dia;
        ajusteRealista(dia,mes,año);
    }
    /**
     * Esta funcion ajusta la fecha para que sea coerente y real
     * @param d día
     * @param m mes
     * @param a año
     */
    private void ajusteRealista(byte d, byte m, short a){
        if(a<100&&a>=50){//si es entre 50 y 100 incluyendo el 50
            this.año=(short)(a+1900);
        }else if(a<50&&a>=0){//si es entre 0 y 50 incluyendo el 0
            this.año=(short)(a+2000);
        }else if(a>2100){//si es mayor de 2100
            this.año=2100;
        }else if(a<0){//si es menor de 0
            this.año=0;
        }
        
        if(m<0){//si el mes es menor a 0
            this.mes=1;
        }else if(m>12){//si el mes es mayor a 12
            this.mes=12;
        }
        
        if(d<1){//si el dia es menor a 1
            this.dia=1;
        }else if(d>31&&this.mes%2!=0&&this.mes!=2){//si el dia es mayor de 31 y el mes es impar y no es 2(febrero)
            this.dia=31;
        }else if(d>31&&this.mes%2==0&&this.mes!=2){//si el dia es mayor de 30 y el mes es par y no es 2(febrero)
            this.dia=30;
        }else if(d>28&&this.mes==2){//si el dia es mayor a 28 y el mes es 2(febrero)
            this.dia=28;
        }
    }
    /**
     * Comprueba cual de las dos fechas es mayor
     * @param f1 Fecha 1
     * @param f2 Fecha 2
     * @return Devuelve true si f1 es mayor que f2 y si no devuelve false
     */
    public static boolean mayorQue(Fecha f1, Fecha f2){
        if(f1.getAño()>f2.getAño()){
            return true;
        }else if(f1.getAño()<f2.getAño()){
            return false;
        }else{
            if(f1.getMes()>f2.getMes()){
                return true;
            }else if(f1.getMes()<f2.getMes()){
                return false;
            }else{
                if(f1.getDia()>f2.getDia()){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
    /**
     * Getter de día
     * @return devuelve el día
     */
    public int getDia() {
        return dia;
    }
    /**
     * Getter de mes
     * @return devuelve el mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * Getter de año
     * @return devuelve el año
     */
    public int getAño() {
        return año;
    }
    /**
     * Setter de día
     * @param dia día
     */
    public void setDia(byte dia) {
        this.dia = dia;
    }
    /**
     * Setter de mes
     * @param mes mes
     */
    public void setMes(byte mes) {
        this.mes = mes;
    }
    /**
     * Setter de año
     * @param año año
     */
    public void setAño(short año) {
        this.año = año;
    }
    
}
