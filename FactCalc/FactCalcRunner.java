public class FactCalcRunner
{
    // instance variables - replace the example below with your own
    private int result;

   
    public static void main (String[] args) {
        int result = 3;
        FactCalc fc = new FactCalc (result);
        System.out.println ("Factorial of " + result + " equals: " + fc.factorial(result));
        
    }
}