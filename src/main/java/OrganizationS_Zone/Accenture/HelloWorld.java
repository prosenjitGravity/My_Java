package OrganizationS_Zone.Accenture;

class HelloWorld {
    public static void main(String[] args) {
        int res=pseudo(8,4,10);
        System.out.println(res);
    }
    static int pseudo(int a,int b,int c){
        for(c=4;c<=7;c++){
            a=a+a;
            if((a+b)>(c-a)){
                a=(4+11)+b;
                b=(c+b)+a;
            }
        }
       return (a+b);
    }
}