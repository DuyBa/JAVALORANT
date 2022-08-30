// import java.util.Arrays;
// import java.util.Scanner;

// public class J02026dayconcokphantutangdan {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int t= sc.nextInt();
//         while(t--> 0)
//         {
//             int[] c= new int[16];
//             int n= sc.nextInt();
//             int m= sc.nextInt();
//             int[] a= new int[16];
            
//             for(int i= 0; i< n; i++) a[i]= sc.nextInt();
//             // Arrays.sort(a);
//             bk(1, n, m, a, c);
//         } 
//     }

//     public static void bk(int i, int n, int m, int[] a, int[] c) {
//         for(int j= c[i- 1]+ 1; j<= n- m+ i; j++)
//         {
//             c[i]= j;
//             if(i== m)
//             {
//                 out(m, c, a);
//             }
//             else bk(i+ 1, n, m, a, c);
//         }
//     }

//     public static void out( int m, int[] c, int[] a) {
//         for(int i= 1; i<= m; i++)
//         {
//             System.out.print(a[c[i]- 1]+ " ");
//         }
//         System.out.println("");
//     }
// }
