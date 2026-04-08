import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();               // ← jumlah dari keyboard
        int jumMhs = n;                     // ← gunakan n, bukan hardcode 5

        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10(n);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("\n-- Input Mahasiswa ke-" + (i + 1) + " --");
            System.out.print("NIM   : "); String nim = sc.next();
            System.out.print("Nama  : "); String nama = sc.next();
            System.out.print("Kelas : "); String kelas = sc.next();
            System.out.print("IPK   : "); double ipk = sc.nextDouble();
            list.tambah(new Mahasiswa10(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------------------------------------");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("-------------------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-------------------------------------------------------");

        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}