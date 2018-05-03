import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicOn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicOn extends Actor implements Strategy
{
    public void act() 
    {
        
    }
    @Override
    public void doOperation (String input) {
    
        
            Greenfoot.playSound(input+".wav");
        
    }
}
