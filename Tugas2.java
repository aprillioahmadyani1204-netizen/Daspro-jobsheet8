import java.util.Scanner;

public class Tugas2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai n dari pengguna
        System.out.print("Masukkan nilai n = ");
        int n = scanner.nextInt();
        
        int jumlahSeluruhAngka = 0;
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasilKali = i * j;
                
               
                System.out.printf("4d", hasilKali);
                
                
                jumlahSeluruhAngka += hasilKali;
            }
            System.out.println(); 
        }
        
       
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        
        scanner.close();
    }
}
