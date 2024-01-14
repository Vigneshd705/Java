import java.util.Scanner;
class NotEligibleToVoteException extends Exception{
    NotEligibleToVoteException(String message)
    {
        System.out.println(message);
    }
}
class check {
    check(int age) throws NotEligibleToVoteException 
    {
        try 
        {
            if(age<18)
            {
                throw new NotEligibleToVoteException("You are under 18.\nYou are not eligible to vote");
            }
            else
            System.out.println("eligible to vote");
        }
        catch (NotEligibleToVoteException E)
        {
        }
        finally{
            System.out.println("hi");
        }
    }
}

public class agechecker{
    public static void main(String[] args) throws NotEligibleToVoteException {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=scanner.nextInt();
        check vote=new check(age);

    }
}