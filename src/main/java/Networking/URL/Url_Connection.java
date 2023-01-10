package Networking.URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Url_Connection {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://github.com/prosenjitGravity/My_Java/commit/a4ca8741b7f7ff774ff3a237abfcedf83292e194");
        URLConnection connection=url.openConnection();
        long date=connection.getDate();
        if(date==0){
            System.out.println("No date Information");
        }else{
            System.out.println("Date is : "+new Date(date));
        }
        System.out.println("Content Type : "+connection.getContentType());
        System.out.println();
        date=connection.getExpiration();
        if(date==0){
            System.out.println("No Expiration Date");
        }else{
            System.out.println("Expire : "+new Date(date));
        }
        date=connection.getLastModified();
        if (date==0){
            System.out.println("No Modified");
        }else{
            System.out.println("You have Modified on : "+new Date(date));
        }
    }
}
