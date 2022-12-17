package Regular_Expression;

public class DemoRegex {
    public static void main(String[] args){
        DemoRegex demo=new DemoRegex();
        demo.Regular("abcdefghijklqwwwwwqqqqqwerttttyuiiiopooo");
    }
    public void Regular(String str){
        System.out.println("The String is : "+str);
//        System.out.println(str.split("(?<=\\G{3})"));
        System.out.println(str.replaceAll("(iop)","z"));
    }

}
