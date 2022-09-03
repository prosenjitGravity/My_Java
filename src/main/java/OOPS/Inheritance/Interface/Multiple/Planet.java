package OOPS.Inheritance.Interface.Multiple;

interface Sun{
    void Solar_System();
}
interface Moon {
    void Natural_satellite();
}
interface Satellite{
    void ManMade_Satellite();
}
class Earth implements Sun,Moon,Satellite {
    @Override
    public void Solar_System() {
        System.out.println("The Sun is the star at the center of the Solar System.");
    }

    @Override
    public void Natural_satellite() {
        System.out.println("The Moon is Earth's only natural satellite");
    }

    @Override
    public void ManMade_Satellite() {
        System.out.println("A satellite or artificial satellite is an object intentionally placed into orbit in outer space.");
    }
}
public class Planet{
    public static void main(String[] args){
        Earth planet=new Earth();
        planet.Solar_System();
        planet.Natural_satellite();
        planet.ManMade_Satellite();
    }
}
