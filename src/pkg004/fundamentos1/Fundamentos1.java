/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg004.fundamentos1;

/**
 *
 * @author cice
 */
public class Fundamentos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Operadores de comparación 
        
        boolean esMayor = 2 > 4; //true
        boolean esMenor = 4 < 6; //true
        boolean esIgual = 4 == 5; //False
        boolean esDistinto = 4 != 5; //true
        
        // Operadores de asignación 
        
        int numero = 2;
        
       // numero++; // Numero = numero + 1; numero += 1;
        
        System.out.println(numero++); // Primero pregunta por la variable y luego lo suma
        System.out.println(--numero);
        
       //++numero; // hace el incremento y luego pregunta por la variable
        
        System.out.println( ++numero); // Primero asigna el nuevo valor y luego accede a la variable.
        System.out.println(numero--); 
        System.out.println(numero);
        
        // Esta secuencia da 2, 2 , 3, 3, 2.
        
        numero *= 4; //8
        numero /= 2; //4
        numero %=2; //0
        
             
                
        
    }
    
}
