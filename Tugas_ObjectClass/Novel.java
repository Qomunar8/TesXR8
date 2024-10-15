package Tugas_ObjectClass;

class Novel extends Book {
    private String genre;

    public String getGenre() {
        return this.genre;
    }
    public Novel (){
        super();
        genre = "";
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public Novel (String title, int year, double price, String genre){
        super(title, year, price);
        this.genre = genre;
    }

    public void print (){
        super.print();
        System.out.println("Aliran: " + genre);
    }

}
