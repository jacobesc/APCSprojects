public class MazeWalkerRunner
{
    public static void run()
    {
        MazeBot maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
    }
}
