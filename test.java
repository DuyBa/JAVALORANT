/* package whatever; // don't place package name! */



/* Name of the class has to be "Main" only if the class is public. */
class test
{
    public static void main(String[] args) {
        String a= "abcdef";
        String b="";
        b+=  a.substring(0, 0)+ a.substring(2);
        System.out.println(b);
    }
}