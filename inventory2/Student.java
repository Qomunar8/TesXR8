public class Student extends Person{
    private String major;
    private int studentNumber;
    private int score;

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(){
        super();
        major = "";
        studentNumber = 0;
        score = 0;
    }

    public Student(String name, int age, String major, int studentNumber, int score){
        super(name, age);
        this.major = major;
        this.studentNumber = studentNumber;
        this.score = score;
    }

    public void print(){
        super.print();
        System.out.println("Major: " + major);
        System.out.println("Nomor siswa: " +studentNumber);
        System.out.println("Skor: " + score);
    }
}