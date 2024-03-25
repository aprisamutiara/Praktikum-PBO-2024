package posttest3;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class App {

    static ArrayList<PembeliKacamata> listpembeli = new ArrayList<>();
    static ArrayList<Kacamata> listkacamata = new ArrayList<>();
    static ArrayList<KacamataPreskripsi> kacamatapreskripsi = new ArrayList<>();
    static DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static LocalDateTime waktuSekarang = LocalDateTime.now();
    static Scanner input = new Scanner (System.in); 
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
                tambah();

            }else if (pilih == 2){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                lihat();

            }else if (pilih == 3){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                ubah();

            }else if (pilih == 4){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                hapus();

            }else if (pilih == 0){
                System.out.println("Terima kasih by Kacamoo <3");
                System.exit(0); 

            }else {
                System.out.println("Pilihan salah. Tekan enter untuk melanjutkan...");
                System.in.read();
            }
        }
    }

    public static void tambah(){
        System.out.println("+======================================================+");
        System.out.println("|                        KACAMOO                       |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                      Tambah Data                     |");
        System.out.println("+======================================================+");

        System.out.print(" Nama pembeli        : ");
        String nama_pembeli = input.next();
        input.nextLine(); 

        System.out.print(" Nomor Telepon       : ");   
        String no_telepon = input.next(); 
        input.nextLine();

        System.out.print(" Frame Kacamata      : ");   
        String frame_kacamata = input.next(); 
        input.nextLine(); 

        System.out.print(" Warna               : ");   
        String warna = input.next(); 
        input.nextLine(); 

        System.out.print(" Harga               : Rp.");   
        Long harga = input.nextLong(); 

        System.out.println("========================================================");
        System.out.print(" Apakah " + nama_pembeli + " memiliki gangguan penglihatan? ");
        String preskripsi = input.next(); 
        System.out.println("========================================================");

        if ((preskripsi.equals ("Ya")) || (preskripsi.equals ("ya"))){
            tambahPreskripsi(true); 
            System.out.println("========================================================");
            System.out.println("             Pendataaan Berhasil ditambahkan <3");
            System.out.println("========================================================");

        }else if ((preskripsi.equals ("Tidak")) || (preskripsi.equals ("tidak"))){
            tambahPreskripsi(false); 
            System.out.println("             Pendataaan Berhasil ditambahkan <3");
            System.out.println("========================================================");
            
        }else{
            System.out.println("Inputan yang anda masukkan salah!");
        }
        String tgl_pembelian = format.format(waktuSekarang);
        PembeliKacamata pembeli_baru = new PembeliKacamata(tgl_pembelian, nama_pembeli, no_telepon);
        Kacamata beli_kacamata = new Kacamata(tgl_pembelian, nama_pembeli, no_telepon, frame_kacamata, warna, harga, preskripsi);
        pembeli_baru.setTgl_pembelian(format.format(waktuSekarang));
        pembeli_baru.setNama_pembeli(nama_pembeli);
        pembeli_baru.setNo_telepon(no_telepon);
        beli_kacamata.setFrame(frame_kacamata);
        beli_kacamata.setFrame(warna);
        beli_kacamata.setHarga(harga);
        beli_kacamata.setPreskripsi(preskripsi);
        listpembeli.add(pembeli_baru);
        listkacamata.add(beli_kacamata);
    } 

    public static void tambahPreskripsi(boolean isYa){
        if (isYa){
            System.out.print(" Minus mata kanan    : - ");
            float minus_mata_kanan = input.nextFloat(); 

            System.out.print(" Minus mata kiri     : - ");
            float minus_mata_kiri = input.nextFloat(); 
            
            System.out.print(" Silinder mata kanan : + ");
            float silinder_mata_kanan = input.nextFloat(); 

            System.out.print(" Silinder mata kiri  : + ");
            float silinder_mata_kiri = input.nextFloat(); 
            KacamataPreskripsi kPres = new KacamataPreskripsi(null, null, null, null, null, null, null, minus_mata_kanan, minus_mata_kiri, silinder_mata_kanan, silinder_mata_kiri);
            kPres.setminus_mata_kanan(minus_mata_kanan);
            kPres.setMinus_mata_kiri(minus_mata_kiri);
            kPres.setSilinder_mata_kanan(silinder_mata_kanan);
            kPres.setSilinder_mata_kiri(silinder_mata_kiri);
            kacamatapreskripsi.add(kPres);
        } else {
            float minus_mata_kanan = 0; 
            float minus_mata_kiri = 0; 
            float silinder_mata_kanan = 0; 
            float silinder_mata_kiri = 0; 
            KacamataPreskripsi kPres = new KacamataPreskripsi(null, null, null, null, null, null, null, minus_mata_kanan, minus_mata_kiri, silinder_mata_kanan, silinder_mata_kiri);
            kPres.setminus_mata_kanan(minus_mata_kanan);
            kPres.setMinus_mata_kiri(minus_mata_kiri);
            kPres.setSilinder_mata_kanan(silinder_mata_kanan);
            kPres.setSilinder_mata_kiri(silinder_mata_kiri);
            kacamatapreskripsi.add(kPres);
        } 
    }

    public static void lihat(){
        System.out.println("+=====================================+");
        System.out.println("|               KACAMOO               |");
        System.out.println("+-------------------------------------+");
        System.out.println("|              Lihat Data             |");
        System.out.println("+=====================================+");
        
        for(int i = 0; i<listpembeli.size(); i++){ 
            System.out.printf("|%-37s"," [ Indeks ke " + i + " ]");
            System.out.print("|\n");
            System.out.printf("|%-37s"," Tanggal pembelian   : " +  listpembeli.get(i).getTgl_pembelian());
            System.out.print("|\n");
            System.out.printf("|%-37s"," Nama pembeli        : " +  listpembeli.get(i).getNama_pembeli());
            System.out.print("|\n");
            System.out.printf("|%-37s"," Nomor Telepon       : " + listpembeli.get(i).getNo_telepon());
            System.out.print("|\n");
            System.out.printf("|%-37s"," Frame Kacamata      : " + listkacamata.get(i).getFrame());
            System.out.print("|\n");
            System.out.printf("|%-37s"," Harga               : Rp." + listkacamata.get(i).getHarga());
            System.out.print("|\n");
            System.out.printf("|%-37s"," Preskripsi          : " + listkacamata.get(i).getPreskripsi());
            System.out.print("|\n"); 
           
            if (listkacamata.get(i).getPreskripsi().equalsIgnoreCase("Ya") && i < kacamatapreskripsi.size()){
            System.out.printf("|%-37s", " Minus mata kanan    : - " + kacamatapreskripsi.get(i).getminus_mata_kanan());
            System.out.print("|\n");
            System.out.printf("|%-37s",  " Minus mata kiri     : - " + kacamatapreskripsi.get(i).getMinus_mata_kiri());
            System.out.print("|\n");
            System.out.printf("|%-37s", " Silinder mata kanan : + " + kacamatapreskripsi.get(i).getSilinder_mata_kanan());
            System.out.print("|\n");
            System.out.printf("|%-37s", " Silinder mata kiri  : + " + kacamatapreskripsi.get(i).getSilinder_mata_kiri());
            System.out.print("|\n");
            } else {
                System.out.println("+=====================================+");
                continue;
            }
            System.out.println("+=====================================+");
        
        }      
        if (listpembeli.size() == 0){
            System.out.println("Data masih kosong");
            System.out.println("Tekan enter untuk melanjutkan...");
            try {
                System.in.read();
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan saat membaca input: " + e.getMessage()); 
            } 
        }
    }

    public static void ubah(){
        System.out.println("+=====================================+");
        System.out.println("|               KACAMOO               |");
        System.out.println("+-------------------------------------+");
        System.out.println("|              Ubah Data              |");
        System.out.println("+=====================================+");
        
        if (listpembeli.size() == 0){
            System.out.println("Data masih kosong");
            System.out.println("Tekan enter untuk melanjutkan...");
            try {
                System.in.read();
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
            }

        }else{
            System.out.println("Ingin melanjutkan? Ya/Tidak");
            String Ya = input.next();

            if ((Ya.equals ("Ya")) || (Ya.equals ("ya"))){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                lihat();
                System.out.print("\nMasukkan indeks yang ingin diubah: ");
                int indeks = input.nextInt();

                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.println("+======================================================+");
                System.out.println("|                        KACAMOO                       |");
                System.out.println("+------------------------------------------------------+");
                System.out.println("|                       Ubah Data                      |");
                System.out.println("+======================================================+");
                System.out.print(" Nama pembeli        : ");
                String nama_pembeli = input.next();
                input.nextLine(); 
        
                System.out.print(" Nomor Telepon       : ");   
                String no_telepon = input.next(); 
                input.nextLine();
        
                System.out.print(" Frame Kacamata      : ");   
                String frame_kacamata = input.next(); 
                input.nextLine(); 
        
                System.out.print(" Warna               : ");   
                String warna = input.next(); 
                input.nextLine(); 
        
                System.out.print(" Harga               : Rp.");   
                Long harga = input.nextLong(); 
        
                System.out.println("========================================================");
                System.out.print(" Apakah " + nama_pembeli + " memiliki gangguan penglihatan? ");
                String preskripsi = input.next(); 
                System.out.println("========================================================");
        
                if ((preskripsi.equals ("Ya")) || (preskripsi.equals ("ya"))){
                    System.out.print(" Minus mata kanan    : - ");
                    float minus_mata_kanan = input.nextFloat(); 

                    System.out.print(" Minus mata kiri     : - ");
                    float minus_mata_kiri = input.nextFloat(); 
                    
                    System.out.print(" Silinder mata kanan : + ");
                    float silinder_mata_kanan = input.nextFloat(); 

                    System.out.print(" Silinder mata kiri  : + ");
                    float silinder_mata_kiri = input.nextFloat(); 
                    KacamataPreskripsi kPres = new KacamataPreskripsi(null, null, null, null, null, null, null, minus_mata_kanan, minus_mata_kiri, silinder_mata_kanan, silinder_mata_kiri);
                    kPres.setminus_mata_kanan(minus_mata_kanan);
                    kPres.setMinus_mata_kiri(minus_mata_kiri);
                    kPres.setSilinder_mata_kanan(silinder_mata_kanan);
                    kPres.setSilinder_mata_kiri(silinder_mata_kiri);
                    kacamatapreskripsi.set(indeks, kPres);
                    System.out.println("========================================================");
                    System.out.println("                 Data berhasil diubah <3                ");
                    System.out.println("========================================================");
        
                }else if ((preskripsi.equals ("Tidak")) || (preskripsi.equals ("tidak"))){
                    float minus_mata_kanan = 0; 
                    float minus_mata_kiri = 0; 
                    float silinder_mata_kanan = 0; 
                    float silinder_mata_kiri = 0; 
                    KacamataPreskripsi kPres = new KacamataPreskripsi(null, null, null, null, null, null, null, minus_mata_kanan, minus_mata_kiri, silinder_mata_kanan, silinder_mata_kiri);
                    kPres.setminus_mata_kanan(minus_mata_kanan);
                    kPres.setMinus_mata_kiri(minus_mata_kiri);
                    kPres.setSilinder_mata_kanan(silinder_mata_kanan);
                    kPres.setSilinder_mata_kiri(silinder_mata_kiri);
                    kacamatapreskripsi.set(indeks, kPres);
                    System.out.println("                 Data berhasil diubah <3                ");
                    System.out.println("========================================================");
                    
                }else{
                    System.out.println("Inputan yang anda masukkan salah!");
                }
                String tgl_pembelian = format.format(waktuSekarang);
                PembeliKacamata pembeli_baru = new PembeliKacamata(tgl_pembelian, nama_pembeli, no_telepon);
                Kacamata beli_kacamata = new Kacamata(tgl_pembelian, nama_pembeli, no_telepon, frame_kacamata, warna, harga, preskripsi);
                pembeli_baru.setTgl_pembelian(format.format(waktuSekarang));
                pembeli_baru.setNama_pembeli(nama_pembeli);
                pembeli_baru.setNo_telepon(no_telepon);
                beli_kacamata.setFrame(frame_kacamata);
                beli_kacamata.setFrame(warna);
                beli_kacamata.setHarga(harga);
                beli_kacamata.setPreskripsi(preskripsi);
                listpembeli.set(indeks, pembeli_baru);
                listkacamata.set(indeks, beli_kacamata);
            }else{
                System.out.println("Tekan enter untuk melanjutkan...");
                try {
                    System.in.read();
                } catch (Exception e) {
                    System.err.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
                }
            }
        }
    }

    public static void hapus(){
        System.out.println("+=====================================+");
        System.out.println("|               KACAMOO               |");
        System.out.println("+-------------------------------------+");
        System.out.println("|              Hapus Data             |");
        System.out.println("+=====================================+");

        if (listpembeli.size() == 0){
            System.out.println("Data masih kosong");
            System.out.println("Tekan enter untuk ke melanjutkan...");
            try {
                System.in.read();
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
            }
        
        }else{
            System.out.println("Ingin melanjutkan? Ya/Tidak");
            String Ya = input.next();

            if ((Ya.equals ("Ya")) || (Ya.equals ("ya"))){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                lihat(); 
                System.out.print("\nMasukkan indeks yang ingin dihapus: ");
                int indeks = input.nextInt(); 
                listpembeli.remove(indeks);
                System.out.println("Data berhasil dihapus <3 ");

            }else{
                System.out.println("Tekan enter untuk melanjutkan...");
                try {
                    System.in.read();
                } catch (Exception e) {
                    System.err.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
                } 
            }
        }
    }
}
