import java.util.Scanner;

public class J03025xaudoixung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String s= sc.nextLine();
            System.out.println(ck(s));
            
        }
    }

    public static String ck(String s) {
        int dem= 0;
        for(int i= 0; i< s.length(); i++)
        {
            if(s.charAt(i)!= s.charAt(s.length()- 1- i)) dem++;
        }
        if(dem== 2 || s.length()%2== 1 && dem== 0) return "YES";
        return "NO";
    }
}
