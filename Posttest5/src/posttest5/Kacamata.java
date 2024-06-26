package posttest5;

public class Kacamata extends PembeliKacamata {

    private String frame, warna, preskripsi;
    private Long harga;

    public Kacamata(String tgl_pembelian, String nama_pembeli, String no_telepon, String frame, String warna, Long harga, String preskripsi){
        super(tgl_pembelian, nama_pembeli, no_telepon);
        this.frame = frame;
        this.warna = warna;
        this.harga = harga;
        this.preskripsi = preskripsi;
    }

    public String getFrame() {
        return this.frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Long getHarga() {
        return this.harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public String getPreskripsi() {
        return this.preskripsi;
    }

    public void setPreskripsi(String preskripsi) {
        this.preskripsi = preskripsi;
    }
    
    // abstract turunan
    @Override
    public void display(){
        super.dataDiri();
        System.out.printf("|%-37s"," Frame Kacamata      : " + frame);
        System.out.print("|\n");
        System.out.printf("|%-37s"," Warna               : " + warna);
        System.out.print("|\n");
        System.out.printf("|%-37s"," Harga               : Rp." + harga);
        System.out.print("|\n");
        System.out.printf("|%-37s"," Preskripsi          : " + preskripsi);
        System.out.print("|\n"); 
    }
}
