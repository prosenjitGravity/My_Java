package OrganizationS_Zone.Accenture;

public class UniqueLetter {
    public static void main(String[] args){
        System.out.println(removeDuplicate("session"));
    }
    static String removeDuplicate(String str){
        String unique ="";
        for(int i=0;i<str.length();i++){
            int j;
            for(j=0;j<str.length();j++){
                if(str.charAt(i)== str.charAt(j)){
                    System.out.println(i+":"+j);
                    break;
                }
            }
            if(i == j){
               unique+=str.charAt(i);
            }
        }
        return unique;
    }

}
