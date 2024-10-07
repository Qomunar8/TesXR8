public class PartTime extends Teacher {
    private int hoursWorked;
    private int setSalary;

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSetSalary() {
        return this.setSalary;
    }

    public int setSetSalary() {
        int salary = hoursWorked * 4 * 20000;
        return salary;
    }
    
    public PartTime(){
        super();
        hoursWorked = 0;
        setSalary = 0;
    }

    public PartTime(String name, int age, String subject, int hoursWorked, int setSalary){
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.setSalary = setSalary;
    }

    public void print(){
        super.print();
        System.out.println("jam kerja: " + hoursWorked);
        System.out.println("setsalary: " + setSalary);
    }
}
