import greenfoot.*;
/**
 * the world our hero lives in
 * 
 * @author lucian Bai
 * @version April 27, 2026
 */
public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    // constructor for objects of class MyWOrld
    public MyWorld() {
        // create a new world
        super(600, 400, 1);
        
        // create elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50 , 50);
        
        createApple();
    }
    
    // increase score
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    
    // create new apple at random location at top
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(300);
        addObject(apple, x, y);
    }
}
