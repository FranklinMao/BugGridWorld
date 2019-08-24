package Lab23;

import info.gridworld.actor.Bug;
/**
 * Write a description of class CircleBug here.
 * 
 * Franklin Mao, period 8, 1/9/17
 * @version (a version number or a date)
 */
public class ZBug extends Bug
{
    private int x;
    private String direction;
    private int steps;
    private int sideLength;
    int counter;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        direction = "East";
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
        else if (counter==0)
        {
            counter=1;
            turn();
            turn();
            turn();
            steps = 0;
        }
        else if (counter==1)
        {
            turn();
            turn();
            turn();
            turn();
            turn();
            counter++;
            steps=0;
        }    
    }    
}
