import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for elephant
 * 
 * @author Lucian Bai 
 * @version April 27, 2026
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 1);
    }
}
