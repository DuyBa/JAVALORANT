public class human {
    String name;
    int age;
    float height;
    human(String name, int age, float height)
    {
        this.name= name;
        this.age= age;
        this.height= height;
    }
    void eat(String a)
    {
        System.out.println("duy dang an com");
        System.out.println(name + " dang an "+ a);
    }
    int laytuoi()
    {
        return age;
    }
}
