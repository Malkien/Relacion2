/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //|        “muchos”                  ”ahora”            “vez”     |
        //|       	  “la”                  “y capaces”           “a”       |
        //|”de trabajar mucho”          “sois”          “alumnos” |
        Scanner sc=new Scanner(System.in);
        String[][] matriz1={{"muchos","ahora","vez"},{"la","y capaces","a"},{"de trabajar mucho","sois","alumnos"}};
        System.out.println("¿Posición1 que quieres cambiar: ");
        int[] p1={Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())};
        System.out.println("¿Posición2 que quieres cambiar: ");
        int[] p2={Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())};
        Matrices.intercambiarPosicion(matriz1, p1, p2);
        System.out.println(mostrarMatriz(matriz1));
        

        //Parte 1 y 2
        
        //|  “yo quird!”    “descifero”      “passworar”       |
        //|    “techo”         “mueño”	    “sungo”          |
        String[][] matriz2={{"yo quird!","descifero","passworar"},{"techo","mueño","sungo"}};
        System.out.println(Matrices.mostrarMatriz(Matrices.descifrarMatriz(matriz2)));
    }
    /**
     * Cambia los tres últimos digitos de cada String de la matriz Siendo de derecha a izquierda las filas pares y de 
     * izquierda a derecha las impares.
     * @param m1 la matriz que usamos de referencia para crear la nueva matriz
     * @return  La nueva matriz modificada
     */
    public static String[][] descifrarMatriz(String[][] m1){
        String[][] m2=new String[m1.length][m1[0].length];
        
        for (int i = 0; i < m2.length; i++) {
            if(i%2==0){
                for (int j = 0; j < m2[0].length; j++) {
                    if(j<m2[0].length-1){
                        m2[i][j]=m1[i][j].substring(0,m1[i][j].length()-3)+m1[i][j+1].substring(m1[i][j+1].length()-3);
                    }else{
                        m2[i][j]=m1[i][j].substring(0,m1[i][j].length()-3)+m1[i][0].substring(m1[i][0].length()-3);
                    }
                }
            }else{
                for (int j = m2[0].length-1; j >= 0 ; j--) {
                    if(j>0){
                        m2[i][j]=m1[i][j].substring(0,m1[i][j].length()-3)+m1[i][j-1].substring(m1[i][j-1].length()-3);
                    }else{
                        m2[i][j]=m1[i][j].substring(0,m1[i][j].length()-3)+m1[i][m2[0].length-1].substring(m1[i][m2[0].length-1].length()-3);
                    }
                }
            }
        }
        return m2;
    }
    public static void clonarMatriz(String[][] m1, String[][] m2){
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                m2[i][j]=m1[i][j];
            }
        }
    }
    public static String[][] ordenarMatriz(String[][] m1){
        String[][] m2=new String[m1.length][m1[0].length];
        Matrices.clonarMatriz(m1, m2);
        String p;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                
            }
        }
        return m2;
    }
    /**
     * Intercambia los valores de las matriz según las posiciones que les des
     * @param m La matriz
     * @param p1 La primera que vas a cambiar Warning: no te pases de la longitud de la matriz
     * @param p2 Por la que se va a intercambiar Warning: no te pases de la longitud de la matriz
     */
    public static void intercambiarPosicion(String[][] m, int[] p1,int[] p2){
        String g;
        g=m[p1[0]][p1[1]];
        m[p1[0]][p1[1]]=m[p2[0]][p2[1]];
        m[p2[0]][p2[1]]=g;
    }
    /**
     * Crea un String de la matriz que introduczas
     * @param m La matriz
     * @return El String de la matriz
     */
    public static String mostrarMatriz(String[][] m){
        String p="";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                p+=m[i][j]+"  ";
            }
            p+="\n";
        }
        return p;
    }
    
}
