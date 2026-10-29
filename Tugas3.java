import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int jumlahToko = 0;
        while (jumlahToko < 1) {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = input.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak boleh kurang dari 1!");
            }
        }

        
        int totalBarangSeluruhToko = 0;
        int tokoBarangTerbanyak = 1;
        int maxBarangToko = -1;
       
        String ringkasanPerToko = "";

       
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n--- Data Toko " + i + " ---");
            
            
            int jumlahPelangan = -1;
            while (jumlahPelangan < 0) {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                jumlahPelangan = input.nextInt();
                if (jumlahPelangan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            }

            int totalBarangToko = 0;

           
            for (int j = 1; j <= jumlahPelangan; j++) {
                int jumlahBarang = -1;
                while (jumlahBarang < 0) {
                    System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    jumlahBarang = input.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif!");
                    }
                }
                // Akumulasi barang per toko
                totalBarangToko += jumlahBarang;
            }

        
            totalBarangSeluruhToko += totalBarangToko;

            ringkasanPerToko += "Toko " + i + " - pelanggan: " + jumlahPelangan + ", total barang: " + totalBarangToko + "\n";

            if (totalBarangToko > maxBarangToko) {
                maxBarangToko = totalBarangToko;
                tokoBarangTerbanyak = i;
            }
        }

        
        System.out.println("\n================ Ringkasan ================");
        System.out.print(ringkasanPerToko);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoBarangTerbanyak);

        input.close();
    }
}
