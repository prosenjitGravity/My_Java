package Exception_Handling;

public class Own_Exception extends Exception {
    static String[] name=new String[]{"Nisha","Subh","Sush","Abhi","Akash"};
    static int[] acc=new int[]{101,102,103,104,105};
    static double[] salary=new double[]{10000.00,12000.00,5600.00,999.00,1100.00};

    public Own_Exception(String balance_is_less_then_) {
    }

    public static void main(String[] args){
        try {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            for (int i = 0; i < 5; i++) {
                System.out.println(acc[i] + "  \t  " + name[i] + "  \t  " + salary[i]);
                if (salary[i]<1000.00){
                    Own_Exception my=new Own_Exception("balance is less then ");
                    throw my;
                }
            }
        }catch(Own_Exception e){
            System.out.println("Something went wrong : "+e);
        }
    }
}
