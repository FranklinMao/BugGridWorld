package Lab23;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * Write a description of class CircleBugRunner here.
 * 
 * Franklin Mao, Period 8, 1/9/17
 * 
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        int [] numberOfturns= {1,2};
        DancingBug alice = new DancingBug(4,numberOfturns);
        alice.setColor(Color.ORANGE);
        alice.setDirection(90);
        
        world.add(new Location(2, 2), alice);
        
        world.show();
    }
}
