import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        
        double jumlahJamKerja,tarifPerjam,pajak;
        Scanner input = new Scanner (System.in);
        double bruto;
        System.out.println("masukkan jumlahJamKerja: ");
        jumlahJamKerja = input.nextDouble();
        System.out.println("masukkan tarifPerjam: ");
        tarifPerjam = input.nextDouble();

        double Bruto;
        bruto = (jumlahJamKerja*tarifPerjam);
        pajak = 0.10*bruto;
        double gajiBersih = bruto-pajak;

        System.out.println("bruto: " +bruto);
        System.out.println("potongan pajak 10%: " +pajak);
        System.out.println("gaji bersih: " +gajiBersih);
    }
}
