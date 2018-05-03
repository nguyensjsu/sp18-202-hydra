import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoundManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundManager extends Actor
{
    /**
     * Act - do whatever the SoundManager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyPressed();
        
        // Add your action code here.
    }    
    
    private Strategy strategy;
    private boolean musicOn;
    Font font1=new Font("Helvetica",true,false,16);
    
    public SoundManager(Strategy strategy) {
        this.strategy = strategy;
        musicOn = true;
        
        GreenfootImage img = new GreenfootImage (350, 135);
        img.setFont(font1);
        img.setColor(Color.WHITE);
        img.drawString("Music: On", 5, 45);
        setImage(img);
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
    
    
    public void setMusicOption(boolean musicOn) {
        this.musicOn = musicOn;
    }
    
    public boolean getMusicOption() {
        return musicOn;
    }
    
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void doOp(String input) {
        strategy.doOperation(input);
    }
    
    public void playSound(String input) {
        
        if (musicOn) {
                strategy  = new MusicOn();
                doOp(input);
            } else {
                strategy = new Mute();
                doOp(input);
            }
    }
    public void keyPressed() {
         if (Greenfoot.isKeyDown("m"))  {
             if (musicOn){
                 musicOn = false;
                 setText("Music Off");
              } else {
                  musicOn = true;
                  setText("Music On");
              }
              
              
             
            
       
         }
    }
}
