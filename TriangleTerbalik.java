import java.util.Scanner;

public class TriangleTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        // --- SEGITIGA PERTAMA (NORMAL) ---
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        
        
        int iTerbalik = n; 
        while (iTerbalik >= 1) {
            int jTerbalik = 0;
            while (jTerbalik < iTerbalik) {
                System.out.print("*");
                jTerbalik++;
            }
            System.out.println();
            iTerbalik--; 
        }
        
        sc.close();
    }
}
