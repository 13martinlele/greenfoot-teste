import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public int temp = 20;
    public int temp1 = 20;
    public int temp2 = 20;
    public int temp3 = 20;
    public void act(){
    temp--;
    //Diálogo Toad
    if(Greenfoot.isKeyDown("enter") && (temp < 1)){
        setBackground(new GreenfootImage("intro.png"));
        temp1--;
    }
    //Diálogo Mário
    if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
        setBackground(new GreenfootImage("falaladybug.png"));
        temp2--;
    }
    if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
        setBackground(new GreenfootImage("falacatnoir.png"));
        temp3--;
    }
    //Iniciar o jogo
    if (Greenfoot.isKeyDown("enter") && (temp3 < 1)){
        MeuMundo world = new MeuMundo();
        Greenfoot.setWorld(world);
    }
}
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    
    
    
    
    
    
    
    
    
    
    
    
    
    {
    }
}

