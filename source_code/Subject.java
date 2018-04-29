/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject  
{
    public void attach(GameObserver obj);
	public void detach(GameObserver obj);
	public void notifyObservers();
}
