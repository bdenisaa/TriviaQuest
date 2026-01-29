import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class offButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class offButton extends Actor
{
    /**
     * Act - do whatever the offButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        touchButton();
    }
    
    
    private void touchButton()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().addObject(new onButton(), getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
