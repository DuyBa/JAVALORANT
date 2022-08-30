import java.util.Scanner;

public class J01025hinhvuong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt(), b= sc.nextInt(), c= sc.nextInt(), d= sc.nextInt();
        int a1= sc.nextInt(), b1= sc.nextInt(), c1= sc.nextInt(), d1= sc.nextInt();
        int nho= Math.min(b, b1), to= Math.max(d, d1), nho1= Math.min(a, a1), to1= Math.max(c, c1);
        int canh= Math.max((to- nho), (to1- nho1));
        System.out.println(canh* canh);
    }
}
