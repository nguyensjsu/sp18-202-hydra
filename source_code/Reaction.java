import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reaction extends Actor implements GameObserver
{
    Font font1=new Font("Helvetica",true,false,16); //sets the font to a large, thick, Helvetica. 
    private int currentScore = 0; //Keeps track of game score

    /**
     * Score Constructor
     * Creates an image for the Score() class and draw text
     * @param text A parameter
     */
    public Reaction(String text)
    {
        GreenfootImage img = new GreenfootImage (350, 135);
        img.setFont(font1);
        img.setColor(Color.WHITE);
        img.drawString(text, 5, 45);
        setImage(img);
    }    
    
    public void update(int score){
        if(score == 0){
          setText ("Reaction :(, Failure is first step toward success ");
        }
        else if(score == 10){
            setText ("Reaction :), You are 2nd Robin hood !!!");
        }
        else if(score < 7){
          setText ("Reaction :| Never give up");
        }
        else{
            setText ("Reaction ;), You are almost there !!!");
        }
    }

    /**
     * Method setText
     * updates score using setText() - see the Enemy's collision event
     * @param text A parameter
     */
    public void setText(String text)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text, 5, 45);
    }

    
    
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
