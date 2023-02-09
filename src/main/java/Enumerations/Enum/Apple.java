package Enumerations.Enum;

public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}

class EnumDemo {
    public static void main(String[] args) {
        try {
            Apple apple;
            apple = Apple.GoldenDel;
            System.out.println(apple);
//            Apple array[]=Apple.values();
            for(Apple e:Apple.values()) {
                System.out.println(EnumValues(e));
            }
        }catch(Exception error){
            System.out.println(error);
        }
    }
    static String EnumValues(Enum value) throws InterruptedException {
        switch (value.toString()) {
            case "Jonathan":
                return value + " is Red.";
            case "GoldenDel":
                return value + " Delicious is Yellow";

            case "RedDel":
                return value + " Delicious  is Red";

            case "Winesap":
                return value + " is red";

            case "Cortland":
                return value + " is red";

            default:
                System.out.println("Processing...");
                Thread.sleep(4000);
                return "Sorry We Cannot find it : "+value ;
        }
    }
}