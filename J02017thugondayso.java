import java.util.Scanner;
import java.util.Vector;

public class J02017thugondayso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Vector <Integer> vt= new Vector<Integer>(n);
        for(int i= 0; i< n; i++)
        {
            int a= sc.nextInt();
            vt.add(a);
        }
        Vector <Integer> vt1= new Vector<Integer>();
        for(int i= 0; i< n; i++)
        {
            if(vt1.size()== 0) vt1.add(vt.get(i));
            else
            {
                if((vt1.get(vt1.size()- 1)+ vt.get(i))% 2== 0) vt1.remove(vt1.size()- 1);
                else  vt1.add(vt.get(i));
            }
        }
        System.out.println(vt1.size());
    }
}
