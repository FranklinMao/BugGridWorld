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
public class ZBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        ZBug alice = new ZBug(4);
        alice.setColor(Color.ORANGE);
        alice.setDirection(90);
        world.add(new Location(2, 2), alice);
        
        world.show();
    }
}
