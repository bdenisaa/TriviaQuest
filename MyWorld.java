import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        butonplay btnMare = new butonplay(new chooseCharacter());
        addObject(btnMare, 481, 448);
        
        settingButton settingButton = new settingButton();
        addObject(settingButton, 923, 62);
        
       //typeText t1 = new typeText(100, ); // caseta mare pentru world-ul acesta
    //addObject(t1, 200, 180);
    }
}


