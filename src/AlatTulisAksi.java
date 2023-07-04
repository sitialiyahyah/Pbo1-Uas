public class AlatTulisAksi {
    public static void main(String[] args) {
        AlatTulis Buku = new AlatTulis();
        Buku.nama = "Buku paket ipa";
        Buku.harga = 20000;
        Buku.kategori = "buku";

        AlatTulis kotakPensil = new AlatTulis();
        kotakPensil.nama = "kotak pensil robot";
        kotakPensil.harga = 15000;
        kotakPensil.kategori = "kotak pensil";

        System.out.println(kotakPensil.harga);

        Buku.mendapatkanBonus();

        System.out.println(kotakPensil.harga + Buku.harga);
    }
}
