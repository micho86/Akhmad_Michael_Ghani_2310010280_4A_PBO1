package anggota;

import java.util.ArrayList;
import buku.Buku;

public class Anggota {
    private String nama;
    private String idAnggota;
    private ArrayList<Buku> bukuDipinjam;
    
    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = new ArrayList<>();
    }
    
    public void pinjamBuku(Buku buku) {
        if(!buku.isDipinjam()) {
            buku.setDipinjam(true);
            bukuDipinjam.add(buku);
            System.out.println(nama + " meminjam " + buku.getJudul());
        }
    }
    
    // Other methods...
}
