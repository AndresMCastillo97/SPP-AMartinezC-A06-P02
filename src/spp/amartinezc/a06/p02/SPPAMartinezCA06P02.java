/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a06.p02;
import java.util.*;
/**
 *
 * @author andres
 */
public class SPPAMartinezCA06P02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de factoriales");    
        menu();
    }
public static void menu(){
        System.out.println("Introduce el numero");
        int numero, x=1;
        
        numero=solicitardatos();
        if(numero<=10 && numero>=1){
            
            for (int n=1; n<=numero; n++) {
                x = x*n;
            }
            System.out.println(numero+"!= "+x);
        }else{
            System.out.println("Valor fuera de rango");
            menu();
        }

    }
    
    public static int solicitardatos(){
        Scanner kb=new Scanner(System.in);
        int numero;
        numero=kb.nextInt();
        return numero;
    }
}
