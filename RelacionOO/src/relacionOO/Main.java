/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionOO;

import java.util.Scanner;
import persona.Paciente;

/**
 *
 * @author Malkien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Fechas
        /*
        System.out.println("Introduce fecha(Primero en el orden: día,mes,año");
        Fecha f1=new Fecha(sc.nextByte(),sc.nextByte(),sc.nextShort());
        System.out.println("Introduce fecha(Primero en el orden: día,mes,año");
        Fecha f2=new Fecha(sc.nextByte(),sc.nextByte(),sc.nextShort());
        System.out.println("Fecha 1: "+f1.getAño()+"/"+f1.getMes()+"/"+f1.getDia());
        System.out.println("Fecha 2: "+f2.getAño()+"/"+f2.getMes()+"/"+f2.getDia());
        if(Fecha.mayorQue(f1, f2)==true){
            System.out.println("La primera fecha es mayor que la segunda");
        }else{
            System.out.println("La segunda fecha es mayor o igual de que primera");
        }
        */
        //Dolencias
        Dolencia torticulis=new Dolencia((byte)3,"ESPALDA Y CUELLO","torticulis");
        Dolencia pieRoto=new Dolencia((byte)8,"MANOS Y PIES","Pie Roto");
        Dolencia fracturaRodilla=new Dolencia((byte)6,"CODOS Y RODILLAS","Fractura de Rodillas");
        Dolencia dolorL4=new Dolencia((byte)9,"ESPALDA Y CUELLO","Dolor de la vertebra L4");
        Dolencia codoLuxado=new Dolencia((byte)10,"CODOS Y RODILLAS","Luxación en el Codo");
        Dolencia dedoRoto=new Dolencia((byte)5,"MANOS Y PIES","Dedo Roto");
        
        //Pacientes
        Fecha fPac=new Fecha((byte)31,(byte)2,(short)2006);
        Fecha fPac1=new Fecha((byte)31,(byte)1,(short)2007);
        Paciente dolores=new Paciente(torticulis,fPac,fPac1,12,3,fPac1,"123123a","Dolores",65845214);
        Paciente manuel=new Paciente(pieRoto,fPac,fPac1,12,3,fPac1,"123123a","Manuel",65845224);
        Paciente eustaquio=new Paciente(fracturaRodilla,fPac,fPac1,12,3,fPac1,"123123a","Eustaquio",65845234);
        Paciente anton=new Paciente(dolorL4,fPac,fPac1,12,3,fPac1,"123123a","Anton",65845244);
        Paciente maribel=new Paciente(codoLuxado,fPac,fPac1,12,3,fPac1,"123123a","Maribel",65845254);
        Paciente nico=new Paciente(dedoRoto,fPac,fPac1,12,3,fPac1,"123123a","Nico",65845264);
    }
    
}
