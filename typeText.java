import greenfoot.*;

public class typeText extends Actor
{
    private String text = "";
    private boolean active = false;
    private GreenfootImage baseImage;
    private boolean firstClick= false;
    public typeText()
    {
        //baseImage = new GreenfootImage(getImage()); // COPIE reală
        baseImage = getImage();
        redraw();
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            active = true;
            text = " "; // NU spațiu
            redraw();
            //firstClick=true;
        }

        if (active)
        {
            String key = Greenfoot.getKey();
            if (key != null)
            {
                if (key.equals("backspace") && text.length() > 0)
                    text = text.substring(0, text.length() - 1);
                else if (key.equals("enter"))
                    active = false;
                else if (key.equals("space"))
                    text += " ";
                else if (key.length() == 1)
                    text += key;

                redraw();
            }
        }
    }

    private void redraw()
    {
        GreenfootImage img = new GreenfootImage(baseImage);

        if (text.isEmpty())
        {
            img.setFont(new Font("SansSerif", false, false, 20));
            img.setColor(Color.GRAY);
            img.drawString("Type here...", 30, 45);
        }
        else 
        {
            img.setFont(new Font("SansSerif", false, true, 20));
            img.setColor(Color.BLACK);
            img.drawString(text, 30, 45);
        }

        setImage(img);
    }

    public String getText()
    {
        return text;
    }
}
