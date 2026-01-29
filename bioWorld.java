import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bioWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bioWorld extends Actor
{
    /**
     * Act - do whatever the bioWorld wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed=1;
    //int cnt=0;
    public void act()
    {
        // Add your action code here.
        moveAround();
    }
    
    private void moveAround()
    {
        if (getWorld() == null) return;

    mainPage w = (mainPage) getWorld();
        w.cnt++;

    if (w.cnt % 9 == 0)
    {
        setLocation(getX(), getY() + speed);
    }
    
    if (getY() <= 200 && speed < 0)
{
    speed = -speed;
}

if (getY() >= 220 && speed > 0)
{
    speed = -speed;
}

}

}
