package OOPS.Interface;

public class Main {
    public static void main(String[] args) {
        Student st=new Student("Student","Prosenjit","paul.prosenjitgravity@gmail.com","Malda");
        Employee em=new Employee("Employee","Prosenjit","paul.prosenjitbit@gmail.com","Kolkata");
        System.out.println(st.toString());
        System.out.println(em.toString());
    }
}
