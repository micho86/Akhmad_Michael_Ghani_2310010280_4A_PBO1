package anggota;

import buku.Buku;
import java.util.ArrayList;

public class PremiumAnggota extends Anggota {
    private int poin;
    private static final int MAX_PINJAM = 5;
    
    public PremiumAnggota(String nama, String idAnggota) {
        super(nama, idAnggota);
        this.poin = 0;
    }
    
    @Override
    public void pinjamBuku(Buku buku) {
        if(getBukuDipinjam().size() < MAX_PINJAM) {
            super.pinjamBuku(buku);
            poin += 10;
            System.out.println("Poin bertambah: " + poin);
        } else {
            System.out.println("Maksimal peminjaman untuk premium: " + MAX_PINJAM);
        }
    }
    
    public int getPoin() {
        return poin;
    }
}
