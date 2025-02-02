import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("calculating speed of a car ");
        System.out.print("enter the dist : ");
        int dist = sc.nextInt();
        System.out.print("enter the time : ");
        float time = sc.nextFloat() ;
        float speed = dist * time ;
        char unit = 's' ;
        System.out.printf("%.2f %c" , speed , unit);
    }
}
