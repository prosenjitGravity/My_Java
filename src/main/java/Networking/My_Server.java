package Networking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class My_Server {
    public static void main(String[] args) throws Exception{
        int c;
        args[0]="domain name is  the .com";
        Socket socket=new Socket("Gravity.net",43);
        InputStream input=socket.getInputStream();
        OutputStream output=socket.getOutputStream();
        String str=(args.length==0 ?"google.com":args[0]+"\n");
        byte[] buf=str.getBytes();
        output.write(buf);
        while((c=input.read())!=-1){
            System.out.print((char)c);
        }
        socket.close();
    }
}
