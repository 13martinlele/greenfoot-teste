import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class foice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foice extends Actor
{
    /**
     * Act - do whatever the foice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
    }
public void moveAtaque()
{
    double angle = Math.toRadians( getRotation());
    int x= (int) Math.round(getX() + Math.cos(angle));
    int y= (int) Math.round(getY() + Math.sin(angle));
    
    setLocation(x,y);
}

}

