package inventory;
public class CD extends Product {
    protected String artist;
    protected int numsong;
    protected String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumsong() {
        return this.numsong;
    }

    public void setNumsong(int numsong) {
        this.numsong = numsong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD() {
        super(); //mengakses constructor superclass
        artist = "";
        numsong = 0;
        label = "";
    }

    public CD(int number, String name, int quantity, double price, String artist, int numsong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.numsong = numsong;
        this.label = label;
    }

    public void print() {
        super.print();
        System.out.println("artist: " + artist);
        System.out.println("Total song: " + numsong);
        System.out.println("Label: " + label);
    }
}
