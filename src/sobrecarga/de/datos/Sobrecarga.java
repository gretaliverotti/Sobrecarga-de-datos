/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga.de.datos;

/**
 *
 * @author Greta
 */
public class Sobrecarga {
  
    int a;
    
    public void metodocomun(){
        System.out.println ("Probando 1"); //Método común
        System.out.println ("Probando 2");
    }

    public void metodocomun(int a){
         System.out.println ("Probando 3 con un valor:" + a); //Método sobrecarga con un valor
    }
    
    public void metodocomun(int a,int b){
         System.out.println ("Probando 4 con dos valores:" + a + b); //Método sobrecarga con dos valores
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sobrecarga obj1 = new Sobrecarga();
        obj1.metodocomun();
        obj1.metodocomun(5);
        obj1.metodocomun(7, 9);
        
    }
    
}
