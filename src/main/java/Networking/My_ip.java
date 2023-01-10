package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class My_ip {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address= InetAddress.getLocalHost();
        System.out.println("My Ip address : "+address.getHostAddress());
        InetAddress inetAddress=InetAddress.getByName(address.getHostAddress());
        System.out.println(inetAddress);
    }
}
