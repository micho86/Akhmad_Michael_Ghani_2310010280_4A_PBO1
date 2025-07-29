package buku;

public class BukuFiksi extends Buku {
    private String genre;
    
    public BukuFiksi(String judul, String pengarang, int tahunTerbit) {
        super(judul, pengarang, tahunTerbit);
        this.genre = "Fiksi Umum";
    }
    
    @Override
    public String getKategori() {
        return "Buku Fiksi - Genre: " + genre;
    }
}
#hihhihhi
