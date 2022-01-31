       /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menumakanan;
import java.util.*;
/**
 *
 * @author Personal
 */
public class MenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here;
        char pilih;
        String nama;
        Scanner input = new Scanner(System.in);
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
        System.out.println("Masukkan Pilihan Anda");
        System.out.print  ("Pilihan Menu Anda = ");
        pilih = input.next().charAt(0);
            if (pilih == 'O' || pilih == 'o'){
                System.out.println("Maaf opornya tinggal kuah");
                System.out.println("----------------------------------------------");
                System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                System.out.println("----------------------------------------------");
            }
            else if (pilih == 'B' || pilih == 'b'){
                System.out.println("Maaf bakminya habis");
                System.out.println("----------------------------------------------");
                System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                System.out.println("----------------------------------------------");
            }
            else if (pilih == 'R' || pilih == 'r'){
                System.out.println("Maaf rendangnya belum matang");
                System.out.println("----------------------------------------------");
                System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                System.out.println("----------------------------------------------");
            }
            else if (pilih == 'S' || pilih == 's'){
                System.out.println("Maaf satenya belum ditusukin");
                System.out.println("----------------------------------------------");
                System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                System.out.println("----------------------------------------------");
            }
            else{
                System.out.println("pilihan salah");
                System.out.println("----------------------------------------------");
                System.out.println("------- PROGRAM MENU MAKANAN \"MAK SRI\" -------");
                System.out.println("----------------------------------------------");
            }
            System.out.println("--------------By Yudha 205314020--------------");
    }
}
