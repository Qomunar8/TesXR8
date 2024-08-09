import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        
        int alas,tinggi,hasil;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan alas jajar genjang: ");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi jajar genjang: ");
        tinggi = input.nextInt();
        hasil = alas*tinggi;
        System.out.println("Hasil jajar genjang adalah: " +hasil);
    
    }
    
}
