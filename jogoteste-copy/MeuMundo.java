import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeuMundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musica.mp3");
    public void started()
    {
        bgMusic.playLoop();
    }
    public void stopped()
    {
        bgMusic.pause();
    }

    /**
     * Constructor for objects of class fundo.
     * 
     */
    public MeuMundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        ladybug ladybug = new ladybug();
        addObject(ladybug,326,437);
        catnoir catnoir = new catnoir();
        addObject(catnoir,532,380);
        catnoir.setLocation(574,388);

        ladybug.setLocation(361,432);
        catnoir.setLocation(550,292);
        catnoir.setLocation(598,235);
        catnoir.setLocation(601,479);
        acumaa acumaa = new acumaa();
        addObject(acumaa,378,199);
        ladybug.setLocation(216,488);
        acumaa.setLocation(546,195);

        acumaa.setLocation(415,225);
        acumaa.setLocation(351,231);
        acumaa.setLocation(244,243);
        removeObject(acumaa);

        borboleta borboleta = new borboleta();
        addObject(borboleta,552,188);
        Counter counter = new Counter();
        addObject(counter,388,33);
        counter.setLocation(102,70);
        Counter counter2 = new Counter();
        addObject(counter2,708,52);
        removeObject(counter2);
        Counter2 counter22 = new Counter2();
        addObject(counter22,694,73);
        counter22.setLocation(692,42);
        counter22.setLocation(698,64);
    }
}
