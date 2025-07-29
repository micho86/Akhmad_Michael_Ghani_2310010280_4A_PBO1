package anggota;

import java.util.ArrayList;
import buku.Buku;

public class Anggota {
    private String nama;
    private String idAnggota;
    private ArrayList<Buku> bukuDipinjam;
    private static final int MAX_PINJAM = 3;
    
    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = new ArrayList<>();
    }
    
    public void pinjamBuku(Buku buku) {
        if(!buku.isDipinjam() && bukuDipinjam.size() < MAX_PINJAM) {
            buku.setDipinjam(true);
            bukuDipinjam.add(buku);
            System.out.println(nama + " berhasil meminjam " + buku.getJudul());
        } else if (bukuDipinjam.size() >= MAX_PINJAM) {
            System.out.println("Maaf, " + nama + " sudah mencapai batas peminjaman");
        } else {
            System.out.println("Buku sedang dipinjam oleh anggota lain");
        }
    }
    
    public void kembalikanBuku(Buku buku) {
        if(bukuDipinjam.remove(buku)) {
            buku.setDipinjam(false);
            System.out.println(nama + " berhasil mengembalikan " + buku.getJudul());
        } else {
            System.out.println("Buku tidak ditemukan dalam daftar pinjaman");
        }
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getIdAnggota() {
        return idAnggota;
    }
    
    public ArrayList<Buku> getBukuDipinjam() {
        return bukuDipinjam;
    }
}
}
