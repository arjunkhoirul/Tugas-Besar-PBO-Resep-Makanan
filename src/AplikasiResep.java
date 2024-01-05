import java.util.ArrayList;
import java.util.List;
import masakanindonesia.Bahan;
import masakanindonesia.Resep;
import masakanindonesia.ResepDasar;
import masakanindonesia.ResepKhusus;

public class AplikasiResep {
    public static void main(String[] args) {
        List<Resep> resepList = new ArrayList<>();

        // Membuat resep
        Resep resepNasiGoreng = new ResepDasar("Nasi Goreng");
        resepNasiGoreng.tambahBahan(new Bahan("Nasi", "2 piring"));
        resepNasiGoreng.tambahBahan(new Bahan("Kecap", "2 sendok makan"));
        resepNasiGoreng.tambahBahan(new Bahan("Telur", "2 butir"));
        resepNasiGoreng.tambahBahan(new Bahan("Bawang Merah", "3 siung, cincang"));
        resepNasiGoreng.tambahBahan(new Bahan("Bawang Putih", "2 siung, cincang"));
        resepNasiGoreng.tambahBahan(new Bahan("Ayam", "100 gram, potong kecil"));
        resepNasiGoreng.tambahBahan(new Bahan("Udang", "100 gram, kupas"));
        resepNasiGoreng.tambahBahan(new Bahan("Sayuran (bisa wortel, buncis, kacang polong)", "Secukupnya"));
        resepNasiGoreng.tambahBahan(new Bahan("Garam", "Secukupnya"));
        resepNasiGoreng.tambahBahan(new Bahan("Merica", "Secukupnya"));
        
        Resep resepNasiUduk = new ResepDasar("Nasi Uduk");
        resepNasiUduk.tambahBahan(new Bahan("Nasi", "2 piring, cuci bersih"));
        resepNasiUduk.tambahBahan(new Bahan("Santan", "400 ml, dari 1 butir kelapa"));
        resepNasiUduk.tambahBahan(new Bahan("Daun Pandan", "2 lembar, simpulkan"));
        resepNasiUduk.tambahBahan(new Bahan("Garam", "1 sendok teh"));
        resepNasiUduk.tambahBahan(new Bahan("Serai", "1 batang, memarkan"));
        resepNasiUduk.tambahBahan(new Bahan("Lengkuas", "2 cm, memarkan"));

        Resep resepSateAyam = new ResepKhusus("Sate Ayam", "Bumbu Kacang");
        resepSateAyam.tambahBahan(new Bahan("Daging Ayam", "500 gram, potong kotak"));
        resepSateAyam.tambahBahan(new Bahan("Bambu Tusuk Sate", "Secukupnya"));
        resepSateAyam.tambahBahan(new Bahan("Bawang Merah", "5 siung, haluskan"));
        resepSateAyam.tambahBahan(new Bahan("Bawang Putih", "3 siung, haluskan"));
        resepSateAyam.tambahBahan(new Bahan("Ketumbar", "1 sendok teh, bubuk"));
        resepSateAyam.tambahBahan(new Bahan("Kacang Tanah", "150 gram, sangrai, haluskan"));
        resepSateAyam.tambahBahan(new Bahan("Gula Merah", "2 sendok makan, serut"));
        resepSateAyam.tambahBahan(new Bahan("Gula Pasir", "1 sendok teh"));
        resepSateAyam.tambahBahan(new Bahan("Garam", "Secukupnya"));
        resepSateAyam.tambahBahan(new Bahan("Air Jeruk Nipis", "1 sendok makan"));

        resepList.add(resepNasiGoreng);
        resepList.add(resepNasiUduk);
        resepList.add(resepSateAyam);

        // Menampilkan resep
        for (Resep resep : resepList) {
            resep.tampilkanResep();
            System.out.println("\n-----------------\n");
        }
    }
}
