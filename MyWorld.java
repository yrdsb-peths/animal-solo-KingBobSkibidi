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
        super(600, 400, 1, false);
        
        // create elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 350);
        
        // create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 40 , 40);
        
        createApple();
    }
    // game over
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        
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
        addObject(apple, x, 90);
    }
}
