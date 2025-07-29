import buku.*;
import anggota.*;
import transaksi.*;
import util.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Sistem Manajemen Perpustakaan ===");
        
        // Create sample data
        Buku buku1 = new BukuFiksi("Harry Potter", "J.K. Rowling", 1997);
        Buku buku2 = new BukuNonFiksi("Clean Code", "Robert Martin", 2008, "Pemrograman");
        
        Anggota anggotaReguler = new Anggota("Budi", "M001");
        PremiumAnggota anggotaPremium = new PremiumAnggota("Ani", "P001");
        
        // Demonstration
        Peminjaman peminjaman1 = new Peminjaman();
        peminjaman1.pinjamBuku(anggotaReguler, buku1);
        
        Peminjaman peminjaman2 = new Peminjaman();
        peminjaman2.pinjamBuku(anggotaPremium, buku2);
        
        Pengembalian pengembalian = new Pengembalian(anggotaReguler, buku1);
        System.out.println(pengembalian.getDetailPengembalian());
        
        // Menu system
        int pilihan;
        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Lihat Daftar Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch(pilihan) {
                case 1:
                    System.out.println("Fitur peminjaman buku");
                    break;
                case 2:
                    System.out.println("Fitur pengembalian buku");
                    break;
                case 3:
                    System.out.println("Daftar Buku:");
                    System.out.println("- " + buku1.getJudul() + " (" + buku1.getKategori() + ")");
                    System.out.println("- " + buku2.getJudul() + " (" + buku2.getKategori() + ")");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while(pilihan != 0);
    }
}
