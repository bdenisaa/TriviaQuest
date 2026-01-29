import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boyCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boyCharacter extends Actor
{
    /**
     * Act - do whatever the boyCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage original; 
    private boolean hover = false;
    public void act()
    {
        verificaHover();
        touchButton();
    }
    
    public boyCharacter()
{
    original = getImage(); // păstrează imaginea inițială
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
    glow.setColor(new Color(200, 255, 255, 10)); 
    glow.fillOval(0, 0, img.getWidth(), img.getHeight()); 

    img.drawImage(glow,0,0);

    setImage(img);
}

private void touchButton()
    {
        if (Greenfoot.mouseClicked(this))
        {
            getWorld().addObject(new chooseName(), 500, 280);
            //typeText = new typeText();

            //GreenfootImage img6 = typeText.getImage();
            //img6.scale(250, 80);
            //typeText.setImage(img6);

            getWorld().addObject(new typeText(), 500, 340);
            
            butonplay btn4 = new butonplay(new mainPage()); 
            GreenfootImage img4 = btn4.getImage(); 
            img4.scale(114, 43);  
            btn4.setImage(img4);
            getWorld().addObject(btn4, 499, 413); 
    
    
        }
    }

    
    
}
