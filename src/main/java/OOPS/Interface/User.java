package OOPS.Interface;

public interface User {
    String userType();
    String userName();
    String userEmail();
    String userAddress();
}
class Student implements User {
    private String type, name, email, address;

    Student(String type, String name, String email, String address) {
        this.type = type;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public String userType() {
        return this.type;
    }

    @Override
    public String userName() {
        return this.name;
    }


    @Override
    public String userEmail() {
        return this.email;
    }

    @Override
    public String userAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
class Employee implements User {
    private String type, name, email, address;

    Employee(String type, String name, String email, String address) {
        this.type = type;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public String userType() {
        return this.type;
    }

    @Override
    public String userName() {
        return this.name;
    }


    @Override
    public String userEmail() {
        return this.email;
    }

    @Override
    public String userAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

