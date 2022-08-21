import java.util.Scanner;

/**
 * J01001hinhchunhat
 */
public class J01001hinhchunhat {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt(), b= sc.nextInt();
        if(a<= 0 || b<= 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.print((a+ b)* 2);
            System.out.print(" ");
            System.out.print(a* b);
        }
    }
}