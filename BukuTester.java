import java.util.Scanner;

public class BukuTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inputkan nama pengarang: ");
        String pengarang = in.nextLine();
        System.out.println("inputkan judul buku: ");
        String judul = in.nextLine();
        System.out.println("inputkan id buku: ");
        int id = in.nextInt();
        System.out.println("masukkan tahun terbit: ");
        int tahunTerbit = in.nextInt();

        Buku kamus = new Buku(id, judul, pengarang, tahunTerbit);
        System.out.println("==================================");
        System.out.println(kamus.pengarang);
        System.out.println(kamus.judul);
        System.out.println(kamus.id);
        System.out.println(kamus.tahunTerbit);

       /*Buku sejarah = new Buku(13579, "sejarahfisika", "andi",2012);
       Buku babi = new Buku(12345, "babialbino", "made",2010);
       Buku lautan = new Buku(35678, "lautanapi", "lisa",2008);
       Buku neraka = new Buku(98765, "nerakajahanam", "fajar",2020);
       Buku cerita = new Buku(34567, "ceritarakyat", "sucipto",2018);

       System.out.println(sejarah.id+sejarah.judul+sejarah.pengarang+sejarah.tahunTerbit);
       System.out.println(babi.id+babi.judul+babi.pengarang+babi.tahunTerbit);
       System.out.println(lautan.id+lautan.judul+lautan.pengarang+lautan.tahunTerbit);
       System.out.println(neraka.id+neraka.judul+neraka.pengarang+neraka.tahunTerbit);
       System.out.println(cerita.id+cerita.judul+cerita.pengarang+cerita.tahunTerbit);/* */
       
       
    }
}
