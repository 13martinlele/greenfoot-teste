import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ladybug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ladybug extends Actor
{
GreenfootSound tiro = new GreenfootSound("tiro.mp3");

     
    public int speed = 10;
    private int sTimer = 0; 

    public void act()
    {
        movimento();
    }
    public void movimento(){
                 
    if (Greenfoot.isKeyDown("w")){
    this.setLocation(this.getX(), this.getY() - speed);
     }
    if (Greenfoot.isKeyDown("s")){
    this.setLocation(this.getX(), this.getY() + speed);
    }
     if (Greenfoot.isKeyDown("a")){
    this.setLocation(this.getX() - speed, this.getY());
    }  
    if (Greenfoot.isKeyDown("d")){
    this.setLocation(this.getX() + speed, this.getY());
    }
     if (Greenfoot.isKeyDown("f")){
        getWorld().addObject(new foice2(), getX() +98, getY() -30);
        tiro.play();
    }
}
}

 
        
