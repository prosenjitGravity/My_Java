package String_Handling.Memory_Management;

public class Memory_demo {
    public static void main(String[] args){
        Runtime time=Runtime.getRuntime();
        long mem1,mem2;
        Integer[] someints=new Integer[1000];
        System.out.println("Total Memory is : "+time.totalMemory());
        mem1=time.freeMemory();
        System.out.println("Initial free memory : "+mem1);
        time.gc();
        mem1=time.freeMemory();
        System.out.println("Free Memory after Garbage Collection : "+mem1);
        for(int i=0;i<1000;i++){
            someints[i]=new Integer(i);
        }
        mem2=time.freeMemory();
        System.out.println("Free Memory after allocation : "+mem2);
        System.out.println("Memory used for allocation : "+(mem1-mem2));
        for(int i=0;i<1000;i++){
            someints[i]=null;
        }
        time.gc();;
        mem2=time.freeMemory();
        System.out.println("Free memory after collection  discarded Integers : "+mem2 );
    }
}
