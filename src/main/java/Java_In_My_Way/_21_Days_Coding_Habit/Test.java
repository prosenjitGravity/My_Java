package Java_In_My_Way._21_Days_Coding_Habit;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
//        int[] n1 = new int[0];
//        boolean[] n2 = new boolean[-200];
//        double[] n3 = new double[2241423798]; error
//        char[] ch = new char[20];
//        String s1="prosenjit";
//        String s2="prosenjit";
//        System.out.println(s1==s2); // true
        String s1 =new String("prosenjit");
        String s2="prosenjit";
        System.out.println(s1==s2);
        System.out.println('b' + 'i' + 't');
        int[] arr=new int[]{2,4,1,3,6,7,8,9};
        System.out.println("print array is  : "+arr);
        System.out.println(Arrays.toString(arr));



        // Create a neat value object to hold the URL
        URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");

// Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

// Now it's "open", we can set the request method, headers etc.
        connection.setRequestProperty("accept", "application/json");

// This line makes the request
        InputStream responseStream = connection.getInputStream();

// Manually converting the response body InputStream to APOD using Jackson
//        ObjectMapper mapper = new ObjectMapper();
//        APOD apod = mapper.readValue(responseStraem, APOD.class);

// Finally we have the response
        System.out.println(responseStream);
    }
}
