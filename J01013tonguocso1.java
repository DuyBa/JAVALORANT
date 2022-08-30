import java.util.Scanner;

public class J01013tonguocso1 {
    public static void main(String[] args) {
        int[] ck= new int[2000001];
        for(int i= 2; i* i< 2000000; i++)
        {
            if(ck[i]== 0)
                for(int j= i* i; j<= 2000000; j+= i)
                    ck[j]= i;
        }

        for(int i= 2; i<= 2000000; i++)
        {
            if(ck[i]== 0)
                ck[i]= i;
        }
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        
        long tong= 0;


        while(t--> 0)
        {
            int n= sc.nextInt();
            while(n!= 1)
            {
                tong+= ck[n];
                n/= ck[n];
            }
        }

        System.out.println(tong);
    }
}
