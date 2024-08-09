public class BukuTester {
    public static void main(String[] args) {
       Buku sejarah = new Buku(13579, "sejarahfisika", "andi",2012);
       Buku babi = new Buku(12345, "babialbino", "made",2010);
       Buku lautan = new Buku(35678, "lautanapi", "lisa",2008);
       Buku neraka = new Buku(98765, "nerakajahanam", "fajar",2020);
       Buku cerita = new Buku(34567, "ceritarakyat", "sucipto",2018);

       System.out.println(sejarah.id+sejarah.judul+sejarah.pengarang+sejarah.tahunTerbit);
       System.out.println(babi.id+babi.judul+babi.pengarang+babi.tahunTerbit);
       System.out.println(lautan.id+lautan.judul+lautan.pengarang+lautan.tahunTerbit);
       System.out.println(neraka.id+neraka.judul+neraka.pengarang+neraka.tahunTerbit);
       System.out.println(cerita.id+cerita.judul+cerita.pengarang+cerita.tahunTerbit);
       
       
    }
}
