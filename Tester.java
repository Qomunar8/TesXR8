package inventory;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Plih 1. CD atau 2. DVD");
        int pilihan = in.nextInt();
        in.nextLine();
        
        if (pilihan == 1) {
            System.out.println("Nama: ");
            String name = in.nextLine();
            System.out.println("artist: ");
            String artist = in.nextLine();
            System.out.println("label: ");
            String label = in.nextLine();
            System.out.println("Nomor: ");
            int number = in.nextInt();
            System.out.println("Kuantitas: ");
            int quantity = in.nextInt();
            System.out.println("Total song: ");
            int numsong = in.nextInt();
            System.out.println("Harga: ");
            double price = in.nextDouble();
            CD cd1 = new CD(number, name, quantity, price, artist, numsong, label);
            cd1.print();

        } else if (pilihan == 2 ) {
            System.out.println("Nama: ");
            String name = in.nextLine();
            System.out.println("Studio: ");
            String studio = in.nextLine();
            System.out.println("nomor: ");
            int number = in.nextInt();
            System.out.println("Kuantitas: ");
            int quantity = in.nextInt();
            System.out.println("panjang: ");
            int lenght = in.nextInt();
            System.out.println("Rating: ");
            int rating = in.nextInt();
            System.out.println("Harga: ");
            Double price = in.nextDouble();
            DVD dvd1 = new DVD(number, name, quantity, price, lenght, rating, studio);
            dvd1.print(); 
            
        } else {
            System.out.println("input salah");
        } 
    }
}
