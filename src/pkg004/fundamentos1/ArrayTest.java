// Tipos de array.
package pkg004.fundamentos1;

import java.util.Arrays;

/**
 *
 * @author cice
 */
public class ArrayTest {
    
    // 
    static int[] arrayNumeros = {1, 2, 3 ,5};
    
    public static void main(String...args){
        
        arrayNumeros = new int[]{1,2,3,4,5};
        arrayNumeros[0] = 2;
        arrayNumeros[1] = 2;
        
        // Pregunta de examen : Eto complilaría ?? int numeros[] new int [4]
        // int arrayPregunta [] = {1,2,3,4,5,6
        
        // Modificación de un array ya existente.
        int [] nuevo = Arrays.copyOf(arrayNumeros, 12);
        
        
        //Arrays Bidimensional.
        
        int [][] bidi = new int [2][4];
        
        
        // Arrays tridimensionales.
        
        int [][][] tri = new int [2][4][8];
        
    
    
    
    
    }
         
        
        
        
      }
    
