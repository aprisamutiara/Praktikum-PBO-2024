package posttest6;

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner (System.in); 
    static Kelola kelola = new Kelola();

    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("\n");
            System.out.println("+=========================+");
            System.out.println("|         KACAMOO         |");
            System.out.println("+=========================+");
            System.out.println("| Pilihlah menu:          |");
            System.out.println("| 1. Tambah               |");
            System.out.println("| 2. Lihat                |");
            System.out.println("| 3. Ubah                 |");
            System.out.println("| 4. Hapus                |");
            System.out.println("| 0. Keluar               |");
            System.out.println("+=========================+");
            System.out.print("Masukkan pilihan: ");
            int pilih = input.nextInt();

            if (pilih == 1){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                kelola.tambah();

            }else if (pilih == 2){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                kelola.lihat();

            }else if (pilih == 3){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                kelola.edit();

            }else if (pilih == 4){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                kelola.hapus();

            }else if (pilih == 0){
                System.out.println("Terima kasih by Kacamoo <3");
                System.exit(0); 

            }else {
                System.out.println("Pilihan salah. Tekan enter untuk melanjutkan...");
                System.in.read();
            }
        }
    }
}
