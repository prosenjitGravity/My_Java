package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Employee john = new Employee("Jhon Doe", 29);
        Employee tim = new Employee("Tim banchlke", 25);
        Employee alan = new Employee("Alan Walker", 27);
        Employee justin = new Employee("Justin Biber", 28);
        Employee jack=new Employee("Jack Hill",30);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(alan);
        employees.add(justin);
        employees.add(jack);

//        Collections.sort(employees, new Comparator<Employee>(){
//
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(employees,(employee1,employee2)->
            employee1.getName().compareTo(employee2.getName()));
        for (Employee e:employees){
            System.out.println(e.getName()+"   "+e.getAge());
        }
        String sillyString=doUpperStaff(new upperConcatenate() {
            @Override
            public String UpperAndConcatenate(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        },employees.get(0).getName()+" "+employees.get(0).getAge(),employees.get(1).getName()+" "+employees.get(0).getAge());
        System.out.println(sillyString);
    }
    public final static String doUpperStaff(upperConcatenate uc, String s1,String s2){
        return uc.UpperAndConcatenate(s1,s2);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
interface  upperConcatenate{
    public String UpperAndConcatenate(String s1,String s2);
}