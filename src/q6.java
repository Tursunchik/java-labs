import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to season finder...");
        System.out.println("Enter a month: ");
        String mounth = sc.nextLine();
        if(mounth.equalsIgnoreCase("feb") || mounth.equalsIgnoreCase("jan") || mounth.equalsIgnoreCase("dec")){
            System.out.println("Winter");
        } else if(mounth.equalsIgnoreCase("jun") || mounth.equalsIgnoreCase("jul") || mounth.equalsIgnoreCase("aug")){
        System.out.println("Summer");
    } else if(mounth.equalsIgnoreCase("sep") || mounth.equalsIgnoreCase("oct") || mounth.equalsIgnoreCase("nov")){
System.out.println("Autumn");
    }else if (mounth.equalsIgnoreCase("mar") || mounth.equalsIgnoreCase("apr") || mounth.equalsIgnoreCase("may")){
        System.out.println("Spring");
    } else {
        System.out.println("The month is invalid");
    }

}
}
