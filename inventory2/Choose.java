import java.util.Scanner;

public class Choose {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Pilih salah satu: \n1. Student \n2. Teacher ");
        int Pilihan = input.nextInt();

        if (Pilihan == 1) {
            System.out.println("Nama: ");
            String name = input.next();
            System.out.println("Major: ");
            String major = input.next();
            System.out.println("Usia: ");
            int age = input.nextInt();
            System.out.println("Skor: ");
            int score = input.nextInt();
            System.out.println("Nomor siswa: ");
            int studentNumber = input.nextInt();
            Student Siswa = new Student(name, age, major, studentNumber, score);
            Siswa.print();
    
        }else if (Pilihan == 2) {
            System.out.println("Pilih salah satu: \n1. Full time \n2. Part time ");
            int Pilih = input.nextInt();
            if (Pilih == 1) {
                System.out.println("Unit: ");
                String unit = input.next();
                System.out.println("Nama: ");
                String name = input.next();
                System.out.println("Subjek: ");
                String subject = input.next();
                System.out.println("Usia: ");
                int age = input.nextInt();
                System.out.println("Anual salary: ");
                int anualSalary = input.nextInt();
                Fulltime time = new Fulltime(name, age, subject, unit, anualSalary);
                time.print();
            }else if (Pilih == 2) {
                System.out.println("Nama: ");
                String name = input.next();
                System.out.println("Subjek: ");
                String subject = input.next();
                System.out.println("Usia: ");
                int age = input.nextInt();
                System.out.println("Jam kerja: ");
                int hoursWorked = input.nextInt();
                System.out.println("Set salary: ");
                int setSalary = input.nextInt();
                PartTime bagian = new PartTime(name, age, subject, hoursWorked, setSalary);
                bagian.print(); 

                int total = hoursWorked * setSalary;
                System.out.println("Total adalah: Rp." + total);
                
            }
        }
    }
}
