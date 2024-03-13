public class BarangPakaian extends Barang {
    private double harga;
    private String ukuran;

    // Constructor
    public BarangPakaian(String kodeBarang, String namaBarang, double harga, String ukuran) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
        this.ukuran = ukuran;
    }

    // Implementasi metode hitungNilai sesuai dengan jenis barang
    @Override
    public double hitungNilai() {
        return harga; // Harga pakaian tidak berubah seiring waktu
    }
}
