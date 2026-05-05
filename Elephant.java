import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant, our hero
 * 
 * @author Lucian Bai
 * @version April 24, 2026
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant_trumpet.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant_gif/sprite-4-1.png");
    
    //constructor
    public Elephant()
    {
        setImage(idle);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(3);
        }
        
        eat();
    }
    
    public void eat() {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
        
    }
}
