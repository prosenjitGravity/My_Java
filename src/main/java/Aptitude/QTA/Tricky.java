package Aptitude.QTA;

public class Tricky {
    public static void main(String[] args) {
        Scaler sc=new Scaler(5);

    }
}
class InterviewBit{
    InterviewBit(){
        System.out.println(" Welcome to InterviewBit ");
    }
}
class Scaler extends InterviewBit{
    Scaler(){
        super();
        System.out.println(" Welcome to Scaler Academy ");
    }
    Scaler(int x){
        this();
        System.out.println(" Welcome to Scaler Academy 2");
    }
}
