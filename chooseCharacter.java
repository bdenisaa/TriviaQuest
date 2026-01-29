import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chooseCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chooseCharacter extends World {
    public chooseCharacter() 
    {    
        super(1000, 560, 1); // dimensiunea lumii
        // poți adăuga aici actori
        prepare();
    }
    
    private void prepare()
    {
        girlCharacter girlCharacter = new girlCharacter();
        addObject(girlCharacter,354,339);
        
        boyCharacter boyCharacter = new boyCharacter();
        addObject(boyCharacter,636,344);
        
        //chooseName chooseName = new chooseName();
        //addObject(chooseName, 500, 280);
    }
}
