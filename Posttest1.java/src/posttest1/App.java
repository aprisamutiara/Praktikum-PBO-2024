package posttest1;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static ArrayList<PembeliKacamata> Kacamoo = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        while(true){
            System.out.print("\n"); 
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
            Scanner input = new Scanner (System.in); 
            int pilih = input.nextInt();

            if (pilih == 1){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                System.out.println("+=====================================+");
                System.out.println("|               KACAMOO               |");
                System.out.println("+-------------------------------------+");
                System.out.println("|             Tambah Data             |");
                System.out.println("+=====================================+");
                
                System.out.print("Tanggal pembelian   : ");
                String tgl_pembelian = input.next();
                tgl_pembelian += input.nextLine(); 

                System.out.print("Nama pembeli        : ");
                String nama_pembeli = input.next();
                nama_pembeli += input.nextLine(); 

                System.out.print("Nomor Telepon       : ");   
                String no_telepon = input.next(); 

                System.out.print("Frame Kacamata      : ");   
                String frame_kacamata = input.next(); 
                frame_kacamata += input.nextLine(); 

                System.out.print("Harga               : ");   
                Long harga = input.nextLong(); 

                PembeliKacamata pembeli_baru = new PembeliKacamata (tgl_pembelian, nama_pembeli, no_telepon, frame_kacamata, harga);
                Kacamoo.add(pembeli_baru);

            }else if (pilih == 2){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.println("+=====================================+");
                System.out.println("|               KACAMOO               |");
                System.out.println("+-------------------------------------+");
                System.out.println("|              Lihat Data             |");
                System.out.println("+=====================================+");

                for(int i = 0; i<Kacamoo.size(); i++){
                    System.out.println("| [ Indeks ke " + i + " ]");
                    System.out.println("| Tanggal pembelian : " +  Kacamoo.get(i).tgl_pembelian);
                    System.out.println("| Nama pembeli      : " +  Kacamoo.get(i).nama_pembeli);
                    System.out.println("| Nomor Telepon     : " + Kacamoo.get(i).no_telepon);
                    System.out.println("| Frame Kacamata    : " + Kacamoo.get(i).frame_kacamata);
                    System.out.println("| Harga             : " + Kacamoo.get(i).harga);
                    System.out.println("+=====================================+");
                
                }if (Kacamoo.size() == 0){
                    System.out.println("Data masih kosong");
                    System.out.println("Tekan enter untuk melanjutkan...");
                    System.in.read();
                }

            }else if (pilih == 3){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                System.out.println("+=====================================+");
                System.out.println("|               KACAMOO               |");
                System.out.println("+-------------------------------------+");
                System.out.println("|              Ubah Data              |");
                System.out.println("+=====================================+");
                
                if (Kacamoo.size() == 0){
                    System.out.println("Data masih kosong");
                    System.out.println("Tekan enter untuk melanjutkan...");
                    System.in.read();

                }else{
                    System.out.println("Ingin melanjutkan? Ya/Tidak");
                    String Ya = input.next();

                    if (Ya.equals("Ya")){
                        System.out.print("\nMasukkan indeks yang ingin diubah: ");
                        int indeks = input.nextInt(); 
    
                        System.out.print("Tanggal pembelian   : ");
                        String tgl_pembelian = input.next();
                        tgl_pembelian+=input.nextLine(); 
    
                        System.out.print("Nama pembeli        : ");
                        String nama_pembeli = input.next();
                        nama_pembeli += input.nextLine();
    
                        System.out.print("Nomor Telepon       : ");   
                        String no_telepon = input.next(); 
    
                        System.out.print("Frame Kacamata      : ");   
                        String frame_kacamata = input.next(); 
    
                        System.out.print("Harga               : ");   
                        Long harga = input.nextLong(); 
    
                        PembeliKacamata pembeli = new PembeliKacamata (tgl_pembelian, nama_pembeli, no_telepon, frame_kacamata, harga);
                        Kacamoo.set(indeks, pembeli);

                    }else{
                        System.out.println("Tekan enter untuk melanjutkan...");
                        System.in.read();
                    }
                }

            }else if (pilih == 4){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                System.out.println("+=====================================+");
                System.out.println("|               KACAMOO               |");
                System.out.println("+-------------------------------------+");
                System.out.println("|              Hapus Data             |");
                System.out.println("+=====================================+");

                if (Kacamoo.size() == 0){
                    System.out.println("Data masih kosong");
                    System.out.println("Tekan enter untuk ke melanjutkan...");
                    System.in.read();

                }else{
                    System.out.println("Ingin melanjutkan? Ya/Tidak");
                    String Ya = input.next();

                    if (Ya.equals("Ya")){
                        System.out.print("\nMasukkan indeks yang ingin dihapus: ");
                        int indeks = input.nextInt(); 
                        Kacamoo.remove(indeks);
                        System.out.println("Data berhasil dihapus <3 ");

                    }else{
                        System.out.println("Tekan enter untuk melanjutkan...");
                        System.in.read();
                    }
                }

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
