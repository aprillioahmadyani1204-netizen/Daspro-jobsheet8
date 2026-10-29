import java.util.Scanner;

public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Langkah 2: Input jumlah kelompok dan penilai serta validasi awal
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai  : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            // Langkah 3: Menyiapkan variabel pelacak kelompok terbaik
            int nomorKelompok = 1; 
            double rataTertinggi = -1; 
            int kelompokTerbaik = 0;

            // Langkah 4: Outer loop (WHILE) untuk memproses kelompok
            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("\nKelompok " + nomorKelompok);
                double totalNilai = 0;

                // Langkah 5: Inner loop (FOR & DO-WHILE) untuk input dan validasi nilai
                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("  Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    
                    totalNilai += nilai;
                }

                // Langkah 6: Menghitung dan menampilkan rata-rata kelompok saat ini
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);

                // Langkah 7: Membandingkan rata-rata untuk mencari yang tertinggi
                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                // Menaikkan counter kelompok
                nomorKelompok++;
            }

            // Langkah 8: Menampilkan ringkasan hasil setelah semua kelompok selesai diproses
            System.out.println("\n==============================");
            System.out.println("Kelompok terbaik    : Kelompok " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }

        sc.close();
    }
}
