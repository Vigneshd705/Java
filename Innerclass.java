class outer //we can't have static outer class
{
    outer()
    {
        System.out.println("Outer class is executing....");
    }
    class inner{
        inner()
        {
            System.out.println("Inner class is executing...");
        }

    }
}

public class Innerclass {
    public static void main(String[] args) {
        outer obj=new outer();
        outer.inner obj1=obj.new inner(); //if the inner class is not static
        // outer.inner obj1=new outer.inner();//if the inner class is static
    }
}
