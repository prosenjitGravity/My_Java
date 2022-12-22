package HackerRank;





/*
* Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class*/
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " +getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName() {
        return "Soccer Class";
    }
    public String toString(){
        return "Each team has n players in " + getName();
    }
}
public class Java_Method_Overriding {
    public static void main(String[] args) {
        Soccer soccer=new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
        System.out.println(soccer.toString());
    }
}
