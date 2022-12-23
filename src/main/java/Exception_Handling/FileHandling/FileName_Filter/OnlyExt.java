package Exception_Handling.FileHandling.FileName_Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

class Only implements FileFilter {
    String ext;
    Only(String ext) {
        this.ext = "." + ext;
    }
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }

    @Override
    public boolean accept(File pathname) {
        return false;
    }
}
public class OnlyExt{
    public static void main(String[] args) {
        String dirname="G:/JavaInterviewDsa/DSA/Interview_Java/src/main/java/Dynamic_Programming";
        File file=new File(dirname);
        FilenameFilter only= new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;// doesn't work
            }
        };
        String s[]=file.list(only);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}


