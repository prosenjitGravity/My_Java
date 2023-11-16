package Java_In_My_Way;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class About {
    String name;
    String email;
    String number;
    String department;
    int age;

    About(String name, String email, String number, String department, int age) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.department = department;
        this.age = age;
    }
}

public class Try_Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        About[] details = new About[2];
        for (int i = 0; i < details.length; i++) {
            System.out.println("Enter the Name : ");
            String n = predator.readLine();
            System.out.println("Enter the Email : ");
            String e = predator.readLine();
            System.out.println("enter mobile number : ");
            String num = predator.readLine();
            System.out.println("enter  department : ");
            String d = predator.readLine();
            System.out.println("enter age : ");
            int age = Integer.parseInt(predator.readLine());
            About about = new About(n, e, num, d, age);
            details[i] = about;
        }
        System.out.println("\tName\t" + "\tEmail\t" + "\tDepartment\t" + "\tNumber\t" + "\tAge");
        for (About i : details) {
            System.out.println("-----------------+------------------+-----------------------+-----------------+");
            System.out.println("|" + i.name + " || " + i.email + " || " + i.department + " || " + i.number + " || " + i.age + "|");
            System.out.println("-----------------+------------------+-----------------------+-----------------+");
        }
    }
}
