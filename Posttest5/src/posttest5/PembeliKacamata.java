package posttest5;

// abstract class parent 
public abstract class PembeliKacamata{
    
    private String tgl_pembelian, nama_pembeli, no_telepon, Anggota;
    // final pada variabel
    public final String optik = "Kacamoo";

    public PembeliKacamata (String tgl_pembelian, String nama_pembeli, String no_telepon){
        this.tgl_pembelian = tgl_pembelian; 
        this.nama_pembeli = nama_pembeli; 
        this.no_telepon = no_telepon;
    }

    public String getTgl_pembelian() {
        return this.tgl_pembelian;
    }

    public void setTgl_pembelian(String tgl_pembelian) {
        this.tgl_pembelian = tgl_pembelian;
    }

    public String getNama_pembeli() {
        return this.nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public String getNo_telepon() {
        return this.no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public final String getAnggota() {
        return this.Anggota;
    }

    public void setAnggota(String Anggota) {
        this.Anggota = Anggota;
    }

    //abstract method
    public abstract void display();

    public void dataDiri(){
        System.out.printf("|%-37s"," Optik Kacamata      : " +  optik);
        System.out.print("|\n");
        System.out.printf("|%-37s"," Tanggal pembelian   : " +  tgl_pembelian);
        System.out.print("|\n");
        System.out.printf("|%-37s"," Nama pembeli        : " +  nama_pembeli);
        System.out.print("|\n");
        System.out.printf("|%-37s"," Nomor Telepon       : " + no_telepon);
        System.out.print("|\n");
    }
}
