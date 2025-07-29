package buku;

public class BukuNonFiksi extends Buku {
    private String subjek;
    
    public BukuNonFiksi(String judul, String pengarang, int tahunTerbit, String subjek) {
        super(judul, pengarang, tahunTerbit);
        this.subjek = subjek;
    }
    
    @Override
    public String getKategori() {
        return "Buku Non-Fiksi - Subjek: " + subjek;
    }
    
    public String getSubjek() {
        return subjek;
    }
}
