public class FactCalc
{
    // instance variables - replace the example below with your own
    private int result;
    private int count;

    public FactCalc(int x)
    {
        // initialise instance variables
        result = 1;
        count = 1;
    }

    public int factorial(int n)
    {
        while (count <= n)
        { 
          result = (result) * (count);
          count++;
        }
        return result;
    }
    
}