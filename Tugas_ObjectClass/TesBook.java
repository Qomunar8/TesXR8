package Tugas_ObjectClass;

import java.util.Scanner;

public class TesBook {
    public static void main(String[] args) {
        Scanner Qom = new Scanner(System.in);

        System.out.println("Judul buku: ");
        String title = Qom.nextLine();
        System.out.println("Tahun buku:");
        int year = Qom.nextInt();
        System.out.println("Harga buku:");
        double price = Qom.nextDouble();
        System.out.println("==========");
        System.out.println("Pilih buku: \n1.TextBook \n2.Novel");
        System.out.println("==========");
        int pilih = Qom.nextInt();

        if (pilih == 1) {
            System.out.println("Subject buku:");
            String subject = Qom.next();
            TextBook Q = new TextBook(title, year, price, subject);
            System.out.println("==========");
            Q.print();
            System.out.println("==========");
            System.out.println("Apakah buku biography?");
            String bio = Qom.next();
            if (bio.equalsIgnoreCase("ya")) {
                System.out.println("Buku biography apa?");
                String about = Qom.next();
                System.out.println("==========");
                Biography M = new Biography(title, year, price, subject, about);
                M.print();
            }
        } else if (pilih == 2) {
            System.out.println("Aliran buku:");
            String genre = Qom.next();
            Novel Q = new Novel(title, year, price, genre);
            System.out.println("==========");
            Q.print();
        }
    }
}