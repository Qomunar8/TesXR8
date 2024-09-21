import java.util.Scanner;

public class TugasKelipatan6 {
    public static void main(String[] args) {

        int awal = 6;
        int akhir = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("angka awal: ");
        awal = input.nextInt();
        System.out.println("Angka akhir: ");
        akhir = input.nextInt();

        while (awal <= akhir) {
            System.out.println(awal);
            awal += 6;
            
        }

    }
}
