import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J03010diachiemail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        List<String> list= new ArrayList<>();
        while(t--> 0)
        {
            String s= sc.nextLine();
            s= s.trim();
            s= s.toLowerCase();
            while(s.contains("  ")== true)
                s= s.replace("  ", " ");
            String[] ss= s.split(" ");
            String tmp= "";
            tmp+= ss[ss.length- 1];
            for(int i= 0; i< ss.length- 1; i++)
            {
                tmp+= ss[i].charAt(0);
            }
            list.add(tmp);
            if(list.contains(tmp)== true)
            {
                if(Collections.frequency(list, tmp)> 1)
                    tmp+= Collections.frequency(list, tmp);
            }
            System.out.println(tmp+ "@ptit.edu.vn");
        }
        
    }
}
