package Java_Stream;

public class Array_Of_Object {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1._id = 01;
        s1._name = "Biswajit Paul";
        s1._company = "ServiceNow";
        s1._address = "Bangalore";
        s1._salary = 3300000;

        Student s2 = new Student();
        s2._id = 02;
        s2._name = "Subhajit Paul";
        s2._company = "IndusNet";
        s2._address = "Kolkata";
        s2._salary = 800000;

        Student s3 = new Student();
        s3._id = 02;
        s3._name = "Kartik Paul";
        s3._company = "Code Cloud";
        s3._address = "Kolkata";
        s3._salary = 600000;

        Student s4 = new Student();
        s4._id = 04;
        s4._name = "Prosenjit";
        s4._company = "Google";
        s4._address = "Bangalore";
        s4._salary = 1800000;

        Student student[] = new Student[]{s1, s2, s3, s4};
//        for(int i=0;i<student.length;i++){
//            System.out.println(student[i]);
//        }
        for (Object i : student) {
            System.out.println(i.toString());
        }
    }
}
