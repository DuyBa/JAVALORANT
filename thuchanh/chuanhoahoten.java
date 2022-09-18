import java.util.Scanner;

public class chuanhoahoten {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            int n= sc.nextInt();
            sc.nextLine();
            String a= sc.nextLine();
            a.trim();
            while(a.contains("  ")== true) a= a.replaceAll("  ", " ");
            String[] tmp= a.split(" ");
            String chuanhoa= "";
            int dai= tmp.length;
            if(n== 1)
            {
                chuanhoa+= tmp[dai- 1].substring(0, 1).toUpperCase()+ tmp[dai- 1].substring(1).toLowerCase()+ " ";
                for(int i= 0; i< dai- 1; i++) chuanhoa+= tmp[i].substring(0, 1).toUpperCase()+ tmp[i].substring(1).toLowerCase()+ " ";
            }
            else
            {
                for(int i= 1; i< dai; i++) chuanhoa+= tmp[i].substring(0, 1).toUpperCase()+ tmp[i].substring(1).toLowerCase()+ " ";
                chuanhoa+= tmp[0].substring(0, 1).toUpperCase()+ tmp[0].substring(1).toLowerCase()+ " ";   
            }
            chuanhoa= chuanhoa.trim();
            System.out.println(chuanhoa);
        }
    }
}
