public class BarangElektronik extends Barang {
    private double harga;
    private int tahunProduksi;

    // Constructor
    public BarangElektronik(String kodeBarang, String namaBarang, double harga, int tahunProduksi) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }

    // Implementasi metode hitungNilai sesuai dengan jenis barang
    @Override
    public double hitungNilai() {
        return harga * (1 - ((2024 - tahunProduksi) * 0.1)); // Mengurangi nilai setiap tahun sebesar 10%
    }
}