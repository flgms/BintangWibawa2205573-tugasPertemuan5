package Pertemuan5.Pert5;

import java.util.Scanner;

public class soal1 {
    public static int hitungJumlahDeret(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void cetakDeret(int n){
        if (n == 1) {
            System.out.println("N = " + n );
            return;
        }
        System.out.print("N = ");
        for ( int i = 1; i < n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.println(n + " = " + hitungJumlahDeret(n));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Membaca nilai N dari user
        System.out.print("Masukan nilai N: ");
        int n = scanner.nextInt();

        hitungJumlahDeret(n);

        cetakDeret(n);

        scanner.close();
    }
}