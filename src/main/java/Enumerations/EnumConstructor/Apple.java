package Enumerations.EnumConstructor;

enum Apple {
    Jonathan(10) ,RedDel(9),GoldenDel(12),Winesap(15),Cortland(8);
    private int price;

    Apple(int price) {
        this.price = price;
    }
    int getPrice(){
        return price;
    }
}
class Main{
    public static void main(String[] args){
        for (Apple ap:Apple.values()){
            System.out.println(ap+" "+ap.getPrice());
        }

    }
}

