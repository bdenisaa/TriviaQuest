import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class biologyPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class biologyPage extends World
{

    /**
     * Constructor for objects of class biologyPage.
     * 
     */
    public biologyPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 560, 1); 
        prepare();
    }
    
    private void prepare()
    {
        settingButton sett = new settingButton();
    GreenfootImage img = sett.getImage();
     img.scale(60,50);
     sett.setImage(img);
     addObject(sett, 966, 31);
       
    }
}
