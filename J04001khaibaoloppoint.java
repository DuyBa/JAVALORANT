import java.util.Scanner;
import java.lang.Math;

public class J04001khaibaoloppoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            Point a= new Point();
            Point b= new Point();
            a.input(sc);
            b.input(sc);
            System.out.printf("%.4f", a.distance(b));
            System.out.println("");
        }
    }
}

class Point{
    double x;
    double y;

    void input(Scanner sc){
        this.x= sc.nextDouble();
        this.y= sc.nextDouble();
    }

    double distance(Point b){
        double xx= this.x- b.x;
        double yy= this.y- b.y;
        return Math.sqrt(xx* xx+ yy* yy);
    }
}
