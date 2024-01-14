class demo
{
    static int n=10;
    int print()
    {
        //System.out.println(n);
        return n;
    }
}
public class accessModifiers {
    public static void main(String[] args) {
        demo obj=new demo();
        // obj.print();
        System.out.println(obj.print());
    }
}
