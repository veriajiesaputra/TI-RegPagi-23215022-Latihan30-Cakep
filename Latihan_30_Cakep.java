/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/*Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */
import java.util.Scanner;

public class Latihan_30_Cakep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menampilkan pertanyaan dengan warna
        System.out.print("Kamu ");
        System.out.print("ngerjain sendiri ");
        System.out.print("latihan 17 sampe ");
        System.out.print("latihan 30 ini? \n");
        System.out.print("Jawab (Yoi/Enggak) : ");
        
        // Menerima input jawaban
        String jawaban = input.nextLine();
        
        // Mengecek jawaban dan menampilkan output sesuai
        if (jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println("\nCakep Bener. Good Job");
            System.out.println("BUILD SUCCESSFUL (total time: 0 seconds)");
        } else if (jawaban.equalsIgnoreCase("Enggak")) {
            System.out.println("\nTetep cakep sih.");
            System.out.println("Yang penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
            System.out.println("BUILD SUCCESSFUL (total time: 6 seconds)");
        } else {
            System.out.println("\nJawaban tidak valid. Mohon jawab dengan 'Yoi' atau 'Enggak'");
        }
        
        input.close();
    }
}
