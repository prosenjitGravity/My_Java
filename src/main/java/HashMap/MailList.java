package HashMap;

import java.util.LinkedList;

class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Address(String name,String street,String city,String state,String code){
        this.name=name;
        this.street=street;
        this.city=city;
        this.state=state;
        this.code=code;
    }
    public String toString() {
        return "Name : "+name+", state : "+state+", city : "+city+", Street : "+street + ", Pin : "+code;
    }
}
public class MailList {
    public static void main(String[] args){
        LinkedList<Address> address=new LinkedList<Address>();
        address.add(new Address("Prosenjit","College Street","kolkata","West Bengal","700152"));
        for (Address e: address){
            System.out.println(e);
        }

    }
}
