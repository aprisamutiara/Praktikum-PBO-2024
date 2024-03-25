package posttest3;

public class PembeliKacamata{
    
    private String tgl_pembelian;
    private String nama_pembeli;
    private String no_telepon;

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

    public PembeliKacamata (String tgl_pembelian, String nama_pembeli, String no_telepon){
        this.tgl_pembelian = tgl_pembelian; 
        this.nama_pembeli = nama_pembeli; 
        this.no_telepon = no_telepon;
    }
}
