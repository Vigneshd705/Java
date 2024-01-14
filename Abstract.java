abstract class Car{ //abstract class
    abstract void drive();
    //the abstract method can only be present in the abstract class but its viceversa is not compulsory
    void playMusic()
    {
        System.out.println("Music playing...");
    }
}

class Ford extends Car{  //concrete class
    //*the class which extends the abstract class must have the abstract method orelse it is an error
    //here drive is the abstract method of the abstract class Car 
        void drive()
        {
            System.out.println("Driving a ford...");
        }
}

// abstract class Ford extends Car{
     //*The above condition that can be overcomed by changing that class as a abstract class
// }
public class Abstract {
    public static void main(String[] args) {
        // Car obj=new Car();
        //We can't create a object for the abstract class instead we can create a reference for abstract class.
        Car obj=new Ford();//Ford obj=new Ford();
        obj.drive();
        obj.playMusic();

    }
}
