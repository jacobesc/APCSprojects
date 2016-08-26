public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int firstNumber;
    private int secondNumber;

   
    public SimpleCalc(int a, int b)
    {
        // initialise instance variables
       firstNumber = a;
       secondNumber = b;
    }

    
    public int add()
    {
        // put your code here
        return firstNumber + secondNumber;
    }
    public int subtract()
    {
        return firstNumber - secondNumber;
    }
    public int multiply()
    {
        return firstNumber * secondNumber;
    }
    public int divide()
    {
        return firstNumber / secondNumber;
    }
    public boolean isGreater()
    {
        return firstNumber > secondNumber;
    }
}
