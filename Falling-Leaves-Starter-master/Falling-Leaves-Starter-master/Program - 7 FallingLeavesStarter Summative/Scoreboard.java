import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.setColor(Color.WHITE);
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 10) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("You win!!!", 5,25);
            Greenfoot.stop();
        }        
    }    
}