public class sourceofhuman {
    public static void main(String[] args) {
        human a= new human("duy", 21, 3.1f);
        //a.name= "duy";
        //a.age= 21;
        //a.height= 3.1f;
        a.eat("hot dog");
        int wa= a.laytuoi();
        System.out.println("his age is "+ wa);
    }
}
