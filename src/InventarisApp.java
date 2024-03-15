import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class InventarisApp {
    private ArrayList<Barang> inventaris;
    private Scanner scanner;
    private DecimalFormat formatRupiah;

    public InventarisApp() {
        inventaris = new ArrayList<>();
        scanner = new Scanner(System.in);
        formatRupiah = new DecimalFormat("Rp ###,###.00");
    }

    // Metode untuk menambahkan barang baru ke inventaris
    public void tambahBarang(Barang barang) {
        inventaris.add(barang);
    }

    // Metode untuk menampilkan daftar barang dalam inventaris
    public void tampilkanDaftarBarang() {
        System.out.println("Daftar Barang dalam Inventaris:");
        for (Barang barang : inventaris) {
            System.out.println(barang.getKodeBarang() + " - " + barang.getNamaBarang() + " - " + formatRupiah.format(barang.hitungNilai()));
        }
    }

    // Metode untuk menghitung total nilai inventaris
    public double hitungTotalNilaiInventaris() {
        double totalNilai = 0;
        for (Barang barang : inventaris) {
            totalNilai += barang.hitungNilai();
        }
        return totalNilai;
    }

    // Metode untuk menambahkan barang baru berdasarkan input pengguna
    public void tambahBarangDariInput() {
        System.out.println("Masukkan informasi barang baru:");
        System.out.print("Kode Barang: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Barang: ");
        double hargaBarang = Double.parseDouble(scanner.nextLine());
        System.out.println("Barang Elektronik atau Barang Pakaian? (elektronik/pakaian): ");
        String jenisBarang = scanner.nextLine();
        if (jenisBarang.equalsIgnoreCase("elektronik")) {
            System.out.print("Tahun Pembuatan: ");
            int tahunPembuatan = Integer.parseInt(scanner.nextLine());
            BarangElektronik barangElektronik = new BarangElektronik(kodeBarang, namaBarang, hargaBarang, tahunPembuatan);
            tambahBarang(barangElektronik);
        } else if (jenisBarang.equalsIgnoreCase("pakaian")) {
            System.out.print("Ukuran Pakaian: ");
            String ukuranPakaian = scanner.nextLine();
            BarangPakaian barangPakaian = new BarangPakaian(kodeBarang, namaBarang, hargaBarang, ukuranPakaian);
            tambahBarang(barangPakaian);
        } else {
            System.out.println("Jenis barang tidak valid.");
        }
    }

    public static void main(String[] args) {
        // Membuat instance InventarisApp
        InventarisApp inventarisApp = new InventarisApp();

        // Menambahkan barang elektronik ke inventaris
        BarangElektronik barangElektronik = new BarangElektronik("BE001", "Laptop", 800.0, 2022);
        inventarisApp.tambahBarang(barangElektronik);

        // Menambahkan barang pakaian ke inventaris
        BarangPakaian barangPakaian = new BarangPakaian("BP001", "Kemeja", 150.0, "M");
        inventarisApp.tambahBarang(barangPakaian);

        // Menampilkan daftar barang dalam inventaris
        inventarisApp.tampilkanDaftarBarang();

        // Menambahkan barang baru dari input pengguna
        inventarisApp.tambahBarangDariInput();

        // Menampilkan daftar barang dalam inventaris setelah penambahan barang baru
        inventarisApp.tampilkanDaftarBarang();

        // Menghitung total nilai inventaris
        double totalNilai = inventarisApp.hitungTotalNilaiInventaris();
        System.out.println("Total Nilai Inventaris: " + inventarisApp.formatRupiah.format(totalNilai));
    }
}
