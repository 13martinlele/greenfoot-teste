import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class catnoir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    public class catnoir extends Actor
{
    public int speed = 10;
    
     private int sTimer = 0; 
    
    public void act()
    {
        movimento();
    }


 public void movimento(){
                 
    if (Greenfoot.isKeyDown("up")){
    this.setLocation(this.getX(), this.getY() - speed);
     }
   else if (Greenfoot.isKeyDown("down")){
   this.setLocation(this.getX(), this.getY() + speed);
    }
    else if (Greenfoot.isKeyDown("left")){
    this.setLocation(this.getX() - speed, this.getY());
    }  
   else if (Greenfoot.isKeyDown("right")){
    this.setLocation(this.getX() + speed, this.getY());
}
else if (Greenfoot.isKeyDown("m") && (sTimer == 0)){
        sTimer ++;
        getWorld().addObject(new bastao2(), getX() - 100, getY() + 30);

}
else {
if (!Greenfoot.isKeyDown("m")){
    sTimer = 0;
}
}
}
}