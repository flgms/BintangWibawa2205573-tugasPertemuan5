package Pertemuan5.Pert5;

import java.util.Scanner;

public class soal2 {
    public static int hitungBilanganGanjil(int awal, int akhir){
        int jumlah = 0;

        if (awal % 2 == 0 && akhir % 2 == 0) {
            jumlah = (akhir - awal + 1)/2;
        } else if (awal % 2 == 1 && akhir % 2 == 1) {
            jumlah = (akhir - awal + 1)/2;
        } else {
            jumlah = Math.floorDiv(akhir - awal, 2) + 1;
        }
        return jumlah;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batasAwal, batasAkhir;
        do {
            System.out.print("Masukan batas awal (positif): ");
            batasAwal = scanner.nextInt();
            System.out.print("Masukan batas akhir (positif, lebih besar dari batasAwal): ");
            batasAkhir = scanner.nextInt();
        } while (batasAwal < 0 || batasAkhir <= batasAwal);

        int jumlahGanjil = hitungBilanganGanjil(batasAwal, batasAkhir);
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " Sampai " + batasAkhir + " adalah " + jumlahGanjil);

        scanner.close();
    }
}
