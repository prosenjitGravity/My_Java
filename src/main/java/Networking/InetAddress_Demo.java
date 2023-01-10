package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getLocalHost();
        System.out.println("My local ip address is  : "+address);
        address=InetAddress.getByName("facebook.com");
        System.out.println(address);
        InetAddress sw[]=InetAddress.getAllByName("www.google.com");
        for(InetAddress i:sw){
            System.out.println(i);
        }
    }
}
