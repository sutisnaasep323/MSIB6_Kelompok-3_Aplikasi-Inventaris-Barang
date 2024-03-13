public abstract class Barang {
    private String kodeBarang;
    private String namaBarang;

    // Constructor
    public Barang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    // Metode abstrak hitungNilai untuk menghitung nilai barang
    public abstract double hitungNilai();

    // Getter dan Setter
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
}
