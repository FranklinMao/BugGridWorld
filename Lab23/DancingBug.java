package Lab23;
import info.gridworld.actor.Bug;
/**
 * Write a description of class SpiralBug here.
 * 
 *Fraklin Mao, Period 8 ,1/9/17
 * @version (a version number or a date)
 */
public class DancingBug extends Bug
{
    private int steps;
    private int sideLength;
    private int[] turnNumber;
    int x=0;
    int rotations;

    public DancingBug(int length, int[] numberOfturns)
    {
        steps = 0;
        sideLength = length;
        turnNumber=numberOfturns;
    }

    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            if (x==turnNumber.length)
            {
                x=0;
            }    
             rotations=turnNumber[x];
            for (int j=0;j<rotations;j++)
                {
                    turn();
                }
            x++;  
            steps=0;
            
        }
    }
}