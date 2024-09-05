// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    final public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(-3);
        }
        Actor worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (worm != null) {
            getWorld().removeObject(worm);
        }
    }

    /**
     * 
     */
    public boolean foundWorm()
    {
        Actor worm = getOneObjectAtOffset(0, 0, Worm.class);
        return worm != null;
    }
}
