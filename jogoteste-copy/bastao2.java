import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bastao2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bastao2 extends catnoir
{
    /**
     * Act - do whatever the bastao2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act()
    {
        moveAtaque();
        acertarAlvo();

    }
public void moveAtaque()
{
    double angle = Math.toRadians( getRotation());
    int x= (int) Math.round(getX() - Math.cos(angle));
    int y= (int) Math.round(getY() - Math.sin(angle));
    
    setLocation(x,y);
}

public void acertarAlvo() {
    Actor b = getOneIntersectingObject(borboleta.class);
    
    if (b != null) {
        Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
        counter2.add(1);
        getWorld().removeObject(b);
        getWorld().removeObject(this);
    }
}

}
