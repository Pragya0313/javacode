package exception;



public class exception{
   static void avg()
   {
    try {
        
    throw new ArithmeticException("Demo");

   }
catch(ArithmeticException e)
{
    System.out.println("exception caught");

}
public static void name(String args[]) 
{
    avg();
}
}

