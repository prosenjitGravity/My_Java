package OOPS.Encapsulation;

public class Encapsulation {
    private String name;
    private int roll;
    private float marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public float getMarks() {
        return marks;
    }

    public String toString() {
        return "[ Name : " + name + ", Roll : " + roll + ", Marks : " + marks + " ]";
    }

    public static void main(String[] args) {
        Encapsulation oops=new Encapsulation();
        oops.setName("Prosenjit");
        oops.setRoll(29);
        oops.setMarks( 9.82f);
        System.out.println(oops.toString());
    }
}
