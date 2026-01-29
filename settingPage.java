import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class settingPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class settingPage extends World
{

    /**
     * Constructor for objects of class settingPage.
     * 
     */
    public settingPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 560, 1); 
        prepare();
    }
    
    private void prepare()
    {
        playButton playButton = new playButton();
        addObject(playButton,660, 251);
        
        
        quitButton quitButton = new quitButton();
        addObject(quitButton, 660, 308);
        
        restartButton restartButton = new restartButton();
        addObject(restartButton, 660, 369);
        
        onButton onButton = new onButton();
        addObject(onButton, 484, 255);
        
        onButton onButton1 = new onButton();
        addObject(onButton1, 484, 322);
        
    }
}
