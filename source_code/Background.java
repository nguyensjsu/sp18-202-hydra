import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private Score score_field = null;
    /**
     * Constructor for objects of class Background.
     * Creates a bow and arrow and sets up velocity and score fields.
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Number velocity_field = new Number ("Velocity: 0");
        score_field = new Score ("Score: 0");
        addObject(score_field, 600, 50);
        addObject(new BowAndArrow(velocity_field, score_field), 50, 200);
        addObject(velocity_field, 130, 50);
    }

    /**
     * Method restart
     * Removes all arrows
     */
    public void restart()
    {
        java.util.List<Arrow> arrows = getObjects(Arrow.class);
        removeObjects(arrows);
        score_field.setScore(0);
    }
}
