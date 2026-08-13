package day1308;
class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}
public class Exception1
{
    public static void checkedAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age must be 018 or above");
            
        }
        System.out.println("Eligible to vote.");
    }
	public static void main(String[] args) {
// 		int a=10;
// 		int b=0;
// 		try{
// 		int result = a/b;
// 		}
// 		catch (ArithmeticException e)
// 		{
// 		    System.out.println("Cannot divide by zero");
// 		}
// 		finally{
// 		System.out.println("I am in Finally");
// 		}
        int age =15;
        try{
            checkedAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Exception : "+e.getMessage());
        }

	}
}