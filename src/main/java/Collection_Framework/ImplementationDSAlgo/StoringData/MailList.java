package Collection_Framework.ImplementationDSAlgo.StoringData;

import java.util.Iterator;
import java.util.LinkedList;

class Address {
    private String name;    
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String toString() {
        return this.name + "\n" + this.street + "\n" + this.city + "\n" + this.state + "\n" + this.code;
    }
}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<Address>();
        addresses.add(new Address("College", "College Street", "Kolkata", "West Bengal", "700007"));
//        System.out.println(addresses);
        addresses.add(new Address("Gour", "Gour Banga", "Malda", "West Bengal", "732103"));
        // using Iterator
        Iterator<Address> itr = addresses.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()+"\n");
        }
        //using for-each
        for(Address i: addresses){
            System.out.println(i+"\n");
        }
        System.out.println("using for loop"); // display value but wrong way
        for(int i=0;i<addresses.size();i++){
            System.out.println(addresses+"\n");
        }
    }
}
