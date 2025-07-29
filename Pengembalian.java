package transaksi;

import buku.Buku;
import anggota.Anggota;
import util.DateUtil;
import java.util.Date;

public class Pengembalian {
    private Anggota anggota;
    private Buku buku;
    private Date tanggalPengembalian;
    private double denda;
    
    public Pengembalian(Anggota anggota, Buku buku) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPengembalian = new Date();
        hitungDenda();
    }
    
    private void hitungDenda() {
        // Contoh sederhana: denda tetap Rp5000
        this.denda = 5000;
        buku.setDipinjam(false);
    }
    
    public String getDetailPengembalian() {
        return String.format(
            "Pengembalian oleh %s: %s pada %s (Denda: Rp%,.2f)",
            anggota.getNama(),
            buku.getJudul(),
            DateUtil.formatDate(tanggalPengembalian),
            denda
        );
    }
}
