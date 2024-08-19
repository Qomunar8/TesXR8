import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        
        double hargaBarang,jumlahBarang,diskon;
        Scanner input = new Scanner (System.in);
        double totalharga;
        System.out.println("masukkan harga barang: ");
        hargaBarang = input.nextDouble();
        System.out.println("masukkan jumlah barang: ");
        jumlahBarang = input.nextDouble();
        System.out.println("masukkan diskon: ");
        diskon = input.nextDouble();
        
        double totalHarga;
        totalHarga = (hargaBarang*jumlahBarang);
        diskon = diskon/100*totalHarga;
        totalHarga = totalHarga-diskon;
        System.out.println("total harganya adalah: " +totalHarga);

    }
    
}