import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restartButton extends Actor
{
    /**
     * Act - do whatever the restartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage original; 
    private boolean hover = false;
    public void act()
    {
        // Add your action code here.
        verificaHover();
    }
    public restartButton()
    {
        original = getImage();
        //nextWorld = null;
    }
    private void verificaHover()
{
    if (Greenfoot.mouseMoved(this))
    {
        aplicaEfect();
        hover = true;
    }
    else if (Greenfoot.mouseMoved(null) && hover)
    {
        setImage(original);
        hover = false;
    }
}
    private void aplicaEfect()
{
    GreenfootImage img = new GreenfootImage(original);

    
    int newWidth  = (int)(img.getWidth() * 1.1);
    int newHeight = (int)(img.getHeight() * 1.1);
    img.scale(newWidth, newHeight);

    
    GreenfootImage glow = new GreenfootImage(img.getWidth(), img.getHeight());
    glow.setColor(new Color(220, 255, 220, 15)); 
    glow.fillOval(0, 0, img.getWidth(), img.getHeight()); 

    img.drawImage(glow,0,0);

    setImage(img);
}
}
