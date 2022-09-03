import java.util.Scanner;

public class J04019loptriangle1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

class Point
{
    double x;
    double y;

    Point(double x, double y)
    {
        this.x= x;
        this.y= y;
    }

    public static Point nextPoint(Scanner sc)
    {
        return new Point(sc.nextDouble(), sc.nextDouble());
        // Point tmp= new Point();
        // tmp.x= sc.nextDouble();
        // tmp.y= sc.nextDouble();
        // return tmp;
    }

    double tinh(Point a)
    {
        double xx= this.x- a.x, yy= this.y- a.y;
        return Math.sqrt(xx* xx+ yy* yy);
    }


}

class Triangle
{
    Point a;
    Point b;
    Point c;
    double canh1;
    double canh2;
    double canh3;

    Triangle(Point a, Point b, Point c)
    {
        this.a= a;
        this.b= b;
        this.c= c;
        canh1= a.tinh(b);
        canh2= a.tinh(c);
        canh3= b.tinh(c);
    }

    boolean valid()
    {
        if(canh1 + canh2<= canh3 || canh1+ canh3<= canh2 || canh2+ canh3<= canh1) return false;
        return true;
    }

    String getPerimeter()
    {
        String a= String.format("%.3f", canh1+ canh2+ canh3);
        return a;
    }
}