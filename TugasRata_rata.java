import java.util.Scanner;

public class TugasRata_rata {
    public static void main(String[] args) {
        
        int jumlahSiswa, nilaiSiswa, Absen;
        double totalSemuaNilai = 0, rata_rata;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Jumlah Siswa: ");
        jumlahSiswa = input.nextInt();

        for (Absen = 1; Absen <= jumlahSiswa; Absen++) {
            System.out.println("Masukkan nilai siswa ke-" + Absen + ":");
            nilaiSiswa = input.nextInt();
            totalSemuaNilai += nilaiSiswa;
            
        }
        rata_rata = totalSemuaNilai/jumlahSiswa;
        System.out.println("Rata-rata nilai dari " + jumlahSiswa + " Siswa adalah: " + rata_rata);
    }
}
