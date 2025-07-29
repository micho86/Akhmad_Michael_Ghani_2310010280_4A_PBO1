package transaksi;

import buku.Buku;
import anggota.Anggota;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String status;
    
    public void pinjamBuku(Anggota anggota, Buku buku) {
        this.anggota = anggota;
        this.buku = buku;
        anggota.pinjamBuku(buku);
        this.status = "Dipinjam";
    }
    
    public String getStatus() {
        return status;
    }
}
