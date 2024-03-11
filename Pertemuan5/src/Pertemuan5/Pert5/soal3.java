package Pertemuan5.Pert5;

import java.util.Scanner;

public class soal3 {
    public static int hitungFaktorial(int n){
        if (n == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
    public static String menampilkanEkspresiFaktorial(int n){
        StringBuilder expression = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            expression.append(i);
            if (i > 1) {
                expression.append("*");
            }
        }
        return expression.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int n = scanner.nextInt();        

        int faktorial = hitungFaktorial(n);
        System.out.println(n + "! = " + menampilkanEkspresiFaktorial(n) + " = " + faktorial);
        scanner.close();
    }    
}
