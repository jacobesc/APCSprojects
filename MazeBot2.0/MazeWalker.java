public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    public void walkMaze(MazeBot mazeBot) 
    {mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();

    }

    public boolean didReachGoal() {
        if (didReachGoal){
            return true;
            System.out.println ("Congratulations");
        }
        else {
        return false;
        System.out.println ("Try Again");
    }
}
}