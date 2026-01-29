import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainPage extends World
{

    /**
     * Constructor for objects of class mainPage.
     * 
     */
    
    int cnt=0;
    public mainPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 560, 1); 
        prepare();
    }
    public void act()
{
    cnt++;
}
    
    private void prepare()
{
    butonplay btn = new butonplay(new historyPage()); 
    GreenfootImage img = btn.getImage(); 
    img.scale(114, 43);  
    btn.setImage(img);
    addObject(btn, 168, 492); 
    
    
    
    butonplay btn1 = new butonplay(new geographyPage()); 
    GreenfootImage img1 = btn1.getImage(); 
    img1.scale(114, 43);  
    btn1.setImage(img1);   
    addObject(btn1, 468, 467);   
    
    
    butonplay btn2 = new butonplay(new biologyPage()); 
    GreenfootImage img2 = btn2.getImage(); 
    img2.scale(114, 43);  
    btn2.setImage(img2);
    addObject(btn2, 796, 503); 
    
    
    settingButton settingButton1 = new settingButton();
    GreenfootImage img3 = settingButton1.getImage();
    img3.scale(55,45);
    settingButton1.setImage(img3);
    addObject(settingButton1, 940, 40);
    
    bioWorld bioWorld = new bioWorld();
    addObject(bioWorld, 817, 218);
    
    histWorld histWorld = new histWorld();
    addObject(histWorld, 193, 220);
    
    
    geoWorld geoWorld = new geoWorld();
    addObject(geoWorld, 493, 187);
    
    
    
}

}
