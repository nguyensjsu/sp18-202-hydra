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
    private Reaction reaction_field = null;
    private SoundManager sManager;
    /**
     * Constructor for objects of class Background.
     * Creates a bow and arrow and sets up velocity and score fields.
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Number velocity_field = new Number ("Velocity: 0");
        Number game_name = new Number ("Robin Hood 2");
        score_field = new Score ("Score: 0");
        reaction_field = new Reaction("Reaction: :| ");
        MusicOn musicOn = new MusicOn();
        SoundManager sManager = new SoundManager(musicOn);
        
        addObject(score_field, 600, 50);
        addObject(reaction_field, 200, 100);
        addObject(new BowAndArrow(velocity_field, score_field, reaction_field, sManager), 50, 200);
        game_name.setImage("robinhood.jpg");
        addObject(game_name, 35, 350);
        addObject(velocity_field, 130, 50);
        addObject(sManager, 600, 100 );
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
