package Lab23;

import info.gridworld.actor.Bug;
/**
 * Write a description of class CircleBug here.
 * 
 * Franklin Mao, period 8, 1/9/17
 * @version (a version number or a date)
 */
public class CircleBug extends Bug
{
    // instance variables - replace the example below with your own
    private int x;

    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public CircleBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }    
}
