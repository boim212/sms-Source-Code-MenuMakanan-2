/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menuMakananVersiSwitch;
import java.util.*;
/**
 *
 * @author Personal
 */
public class MenuMakanan_Versi_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char pilih;
        String nama;
        
        System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("Menu Yang Ada");
        System.out.println("   Bakmi");
        System.out.println("   Opor");
        System.out.println("   Rendang");
        System.out.println("   Sate");
        System.out.println("   Bakso");
        System.out.println("   Pecel Lele");
        System.out.println("");
        System.out.println("Masuukan Pilihan Anda");
        System.out.print  ("Pilihan Menu Anda = ");
        pilih = input.next().charAt(0);
            switch(pilih){
                case ('B'):
                    System.out.println("Maaf bakminya habis");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                case ('b'):
                    System.out.println("Maaf bakminya habis");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                case ('O'):
                    System.out.println("Maaf opornya tinggal kuah");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                case ('o'):
                    System.out.println("Maaf opornya tinggal kuah");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                case ('R'):
                    System.out.println("Maaf rendangnya belum matang");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                case ('r'):
                    System.out.println("Maaf rendangnya belum matang");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                case ('S'):
                    System.out.println("Maaf satenya belum ditusukin");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                case ('s'):
                    System.out.println("Maaf satenya belum ditusukin");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    break;
                default:
                    System.out.println("Masih mikir");
                    System.out.println("----------------------------------------------");
                    System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                    System.out.println("----------------------------------------------");
                    
            }
        System.out.println("--------------By Yudha 205314020--------------");
    }
}
