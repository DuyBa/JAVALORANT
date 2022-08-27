/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test
{
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s;
            s = sc.nextLine();
            String a = s.trim();
        	while (a.contains("  ") == true) {
            	a = a.replace("  ", " ");
        	}
        	char[] arr = a.toCharArray();
    
    		System.out.println(arr.length);
        }
    }

}