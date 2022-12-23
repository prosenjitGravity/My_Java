package Anonymous.Value_Reference.Cmd;

public class CmdArgument {
    public static void main(String[] java) {
        for (int i = 0; i < java.length; i++) {
            String length = java[i];
            System.out.println(java[i] + " : " + length);
        }
    }
}
