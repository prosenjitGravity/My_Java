package Java_Stream;

public class Student {
    int _id;
    String _name;
    String _company;
    long _salary;
    String _address;

//    public Student(int _id, String _name, String _company, long _salary, String _address) {
//        this._id = _id;
//        this._name = _name;
//        this._company = _company;
//        this._salary = _salary;
//        this._address = _address;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "_id = " + _id +
                ", _name = '" + _name + '\'' +
                ", _company = '" + _company + '\'' +
                ", _salary = " + _salary +
                ", _address = '" + _address + '\'' +
                '}';
    }
}
