import java.util.Scanner;

public class tinhtongcacchuso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String a= sc.nextLine(), moi= new String();
            a+= "a";
            long tong = 0;
            for(int i= 1; i<a.length(); i++)
                if( Character.isDigit(a.charAt(i- 1))== true )
                {
                    tong+= Long.parseLong(a.substring(i- 1, i));
                }
            for(int i= 0; i< a.length(); i++)
                if(Character.isDigit(a.charAt(i))== false)
                    moi+= a.charAt(i);
            moi+= String.valueOf(tong);
            System.out.println(moi);
        }
    }
}
