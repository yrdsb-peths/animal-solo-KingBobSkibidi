import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titlescreen here.
 * 
 * @author Lucian Bai
 * @version May 5, 2026
 */
public class Titlescreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 240, 120);
        prepare();
    }

    public void act()
    {
        // start game if space bar pressed
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,430,141);
        elephant.setLocation(512,102);
        Label label = new Label("Press <Space> To Start", 40);
        addObject(label,228,249);
        label.setLocation(304,308);
        Label label2 = new Label("Use \u2190 and \u2192 arrow keys to move", 25);
        addObject(label2,164,233);
        label2.setLocation(292,352);
    }
}
