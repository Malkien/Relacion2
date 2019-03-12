/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Malkien
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce fecha(Primero en el orden: día,mes,año");
        Fecha f1=new Fecha(sc.nextByte(),sc.nextByte(),sc.nextShort());
        System.out.println("Introduce fecha(Primero en el orden: día,mes,año");
        Fecha f2=new Fecha(sc.nextByte(),sc.nextByte(),sc.nextShort());
        System.out.println(f1.getAño()+"/"+f1.getMes()+"/"+f1.getDia());
        System.out.println(f2.getAño()+"/"+f2.getMes()+"/"+f2.getDia());
        if(Fecha.mayorQue(f1, f2)==true){
            System.out.println("La primera fecha es mayor que la segunda");
        }else{
            System.out.println("La segunda fecha es mayor o igual de que primera");
        }
        
    }
    
}
