package posttest5;

// final pada class
public final class KacamataPreskripsi extends Kacamata{
    float minus_mata_kanan;
   	float minus_mata_kiri;
	float silinder_mata_kanan;
	float silinder_mata_kiri;

	public KacamataPreskripsi(String tgl_pembelian, String nama_pembeli, String no_telepon, String frame, String warna, Long harga, String preskripsi, float minus_mata_kanan, float minus_mata_kiri, float silinder_mata_kanan, float silinder_mata_kiri){
        super(tgl_pembelian, nama_pembeli, no_telepon, frame, warna, harga, preskripsi);
		this.minus_mata_kanan = minus_mata_kanan;
		this.minus_mata_kiri = minus_mata_kiri;
		this.silinder_mata_kanan = silinder_mata_kanan;
		this.silinder_mata_kiri = silinder_mata_kiri;
    }

    public float getminus_mata_kanan() {
		return this.minus_mata_kanan;
	}

    public void setminus_mata_kanan(float minus_mata_kanan){
		this.minus_mata_kanan = minus_mata_kanan ;
	}

    public float getMinus_mata_kiri() {
		return this.minus_mata_kiri;
	}

	public void setMinus_mata_kiri(float minus_mata_kiri) {
		this.minus_mata_kiri = minus_mata_kiri;
	}

	public float getSilinder_mata_kanan() {
		return this.silinder_mata_kanan;
	}

	public void setSilinder_mata_kanan(float silinder_mata_kanan) {
		this.silinder_mata_kanan = silinder_mata_kanan;
	}

	public float getSilinder_mata_kiri() {
		return this.silinder_mata_kiri;
	}

	public void setSilinder_mata_kiri(float silinder_mata_kiri) {
		this.silinder_mata_kiri = silinder_mata_kiri;
	}

	// final pada method dan abstract turunan
	public final void display(boolean preskripsi) {
        if (preskripsi) {
            System.out.printf("|%-37s", " Minus mata kanan    : - " + minus_mata_kanan);
            System.out.print("|\n");
            System.out.printf("|%-37s", " Minus mata kiri     : - " + minus_mata_kiri);
            System.out.print("|\n");
            System.out.printf("|%-37s", " Silinder mata kanan : + " + silinder_mata_kanan);
            System.out.print("|\n");
            System.out.printf("|%-37s", " Silinder mata kiri  : + " + silinder_mata_kiri);
			System.out.print("|\n");
        }
    }

}
    