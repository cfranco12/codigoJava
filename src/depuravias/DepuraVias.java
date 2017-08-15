/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depuravias;

/**
 *
 * @author Hitss y el buen Cris
 */
import java.util.Scanner;
public class DepuraVias {

        public static void main(String[] ar) {
            Scanner teclado=new Scanner(System.in);
            float sueldo;
            System.out.print("Ingresa un número:");
            sueldo=teclado.nextFloat();
            if (sueldo>10) {
                System.out.println("Tú número es mayor a 10");
            }
        }
    }


    /**
     * @param args the command line arguments
     */

