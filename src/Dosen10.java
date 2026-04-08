public class Dosen10 {
    String kode;
    String nim;
    Boolean jenisKelamin;
    int usia;

    Dosen10( String kd, String name, Boolean jk, int age) {
        kode = kd;
        nim = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode Dosen       : " + kode);
        System.out.println("Nama Dosen       : " + nim);
        System.out.println("Jenis Kelamin    : " + jk);
        System.out.println("Usia             : " + usia);
        System.out.println("------------------------");
    }
}
