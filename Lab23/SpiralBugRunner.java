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
public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug(3);
        alice.setColor(Color.ORANGE);
        
        world.add(new Location(5, 5), alice);
        
        world.show();
    }
}
