import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class borboleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class borboleta extends Actor
{
    GifImage myGif = new GifImage("bb-butterflies.gif");
    
    /**
     * Act - do whatever the acumagif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
       
    }
}
