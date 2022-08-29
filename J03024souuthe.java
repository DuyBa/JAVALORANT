import java.util.Scanner;

public class J03024souuthe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String s= sc.nextLine();
            System.out.println(check(s));
        }
    }

    public static String check(String s) {
        for(int i= 0; i< s.length(); i++)
            if(Character.isAlphabetic(s.charAt(i))== true) return "INVALID"; 
        if(ck(s)== 1 || ck1(s)== 1) return "YES";
        return "NO";
    }

    public static int ck(String s) {
        char[] a= s.toCharArray();
        if(a.length% 2== 1) return 0;
        int chan= 0;
        for(int i= 0; i< a.length; i++)
            if(Character.valueOf(a[i])% 2== 0) chan++;
        if(a.length- chan > chan) return 0;
        return 1;
    }

    public static int ck1(String s) {
        char[] a= s.toCharArray();
        if(a.length% 2== 0) return 0;
        int le= 0;
        for(int i= 0; i< a.length; i++)
            if(Character.valueOf(a[i])% 2== 0) le++;
        if(a.length- le > le) return 0;
        return 1;
    }
}
