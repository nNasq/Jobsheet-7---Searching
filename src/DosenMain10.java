import java.util.Scanner;

public class DosenMain10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen10 ds = new DataDosen10();
        int pilihan;

        do {
            tampilMenu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahDosen(sc, ds);
                    break;
                case 2:
                    ds.tampil();
                    break;
                case 3:
                    ds.sortingASC();
                    ds.tampil();
                    break;
                case 4:
                    pilihanSortingDSC(sc, ds);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 5);

        sc.close();
    }

    static void tampilMenu() {
        System.out.println("\n============================");
        System.out.println("       MENU DATA DOSEN      ");
        System.out.println("============================");
        System.out.println(" 1. Tambah Dosen");
        System.out.println(" 2. Tampilkan Data Dosen");
        System.out.println(" 3. Sorting ASC (Bubble Sort)");
        System.out.println(" 4. Sorting DSC (Selection/Insertion Sort)");
        System.out.println(" 5. Keluar");
        System.out.println("============================");
    }

    static void tambahDosen(Scanner sc, DataDosen10 ds) {
        System.out.println("\n--- Tambah Data Dosen ---");
        System.out.print("Kode          : ");
        String kd = sc.nextLine();

        System.out.print("Nama          : ");
        String nm = sc.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String inputJK = sc.nextLine().trim().toUpperCase();
        boolean jk = inputJK.equals("L");

        System.out.print("Usia          : ");
        int age = sc.nextInt();
        sc.nextLine();

        ds.tambah(new Dosen10(kd, nm, jk, age));
        System.out.println("Data berhasil ditambahkan!");
    }

    static void pilihanSortingDSC(Scanner sc, DataDosen10 ds) {
        System.out.println("\n--- Pilihan Algoritma Sorting DSC ---");
        System.out.println(" 1. Selection Sort");
        System.out.println(" 2. Insertion Sort");
        System.out.print("Pilih algoritma: ");
        int alg = sc.nextInt();
        sc.nextLine();

        if (alg == 1) {
            ds.sortingDSC();
        } else if (alg == 2) {
            ds.insertionSort();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        ds.tampil();
    }
}