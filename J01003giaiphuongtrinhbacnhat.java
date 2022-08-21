import java.util.Scanner;

/**
 * J01003giaiphuongtrinhbacnhat
 */
public class J01003giaiphuongtrinhbacnhat {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat(), b= sc.nextFloat();
        if(a== 0.0 && b== 0.0) System.out.println("VSN");
        else if(a== 0.0 && b!= 0.0) System.out.println("VN");
        else System.out.printf("%.2f", -b/ a);
    }
}