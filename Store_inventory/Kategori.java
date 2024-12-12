import java.util.ArrayList;
import java.util.List;

public class Kategori {
    private String idKategori;
    private String namaKategori;
    private List<Barang> daftarBarang;

    public Kategori(String idKategori, String namaKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void printBarangDalamKategori() {
        System.out.println("Kategori: " + namaKategori);
        for (Barang barang : daftarBarang) {
            System.out.println("- " + barang);
        }
    }
}
