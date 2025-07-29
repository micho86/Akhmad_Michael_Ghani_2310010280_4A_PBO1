package buku;

public abstract class Buku {
    protected String judul;
    protected String pengarang;
    protected int tahunTerbit;
    protected boolean dipinjam;
    
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }
    
    // Abstract method
    public abstract String getKategori();
    
    // Getters and setters
    public String getJudul() { return judul; }
    public boolean isDipinjam() { return dipinjam; }
    public void setDipinjam(boolean status) { this.dipinjam = status; }
}
