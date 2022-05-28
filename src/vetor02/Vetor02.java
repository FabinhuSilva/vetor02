/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fabinhu
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int numero=0;
         int numeroDigitado [] = new int[5];
         
         Scanner lerValorDigitado = new Scanner(System.in);
         
         for (int contador  = 0 ; contador < numeroDigitado.length; contador ++){
             numero ++;
             System.out.printf("Digite o "+numero+"º Numero: ");
             numeroDigitado[contador] = lerValorDigitado.nextInt();
         }
         
         System.out.println("Os Numerod Digitados foram: \n"+numeroDigitado[0]+"+"+numeroDigitado[1]+numeroDigitado[2]+"+"+numeroDigitado[3]+"+"+numeroDigitado[4]+"="
                 +((+numeroDigitado[0]+numeroDigitado[1]+numeroDigitado[2]+numeroDigitado[3]+numeroDigitado[4]));

         }
         }
    
}
