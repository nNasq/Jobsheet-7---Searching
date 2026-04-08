public class DataDosen10 {
    Dosen10[] dataDosen10 = new Dosen10[10];
    int idx = 0;

    void tambah(Dosen10 dsn) {
        if (idx < 10) {
            dataDosen10[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen10[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen10[j].usia > dataDosen10[j + 1].usia) {
                    Dosen10 temp = dataDosen10[j];
                    dataDosen10[j] = dataDosen10[j + 1];
                    dataDosen10[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen10[j].usia > dataDosen10[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen10 temp = dataDosen10[maxIdx];
            dataDosen10[maxIdx] = dataDosen10[i];
            dataDosen10[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen10 key = dataDosen10[i];
            int j = i - 1;
            while (j >= 0 && dataDosen10[j].usia < key.usia) {
                dataDosen10[j + 1] = dataDosen10[j];
                j--;
            }
            dataDosen10[j + 1] = key;
        }
    }
}
