package Exception_Handling.FileHandling.Directories;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "G:/JavaInterviewDsa/DSA/Interview_Java/src/main/java/Dynamic_Programming";//TabulationFibonacci.java
        File file = new File(dirname);
        if (file.isDirectory()) {
            System.out.println("Directory of  : " + dirname);
            String s[] = file.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a Directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is Not found in Directory");
        }
    }
}
