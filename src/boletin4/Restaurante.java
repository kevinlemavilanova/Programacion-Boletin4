/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author klemavilanova
 */
public class Restaurante {
   private int pulpo;
   private int patacas;
   
   public int calcularclientes(){
       int clientes= 0;
       
       for(int i = pulpo; i > 1; i -= 2){
           patacas-=1;
           if(patacas >=0)
            clientes+=1;
           else
            break;
       }
       return clientes;
   }
   
   public void engadirPolbo(int x ){
       pulpo += x;
   }
   public void engadirPatacas ( int x){
       patacas +=x;
   }         
   public void amosarPolbo( ){
       System.out.println(pulpo);
   }
   
   public void amosarPatacas ( ){
       System.out.println(patacas);       
   }
    
}
