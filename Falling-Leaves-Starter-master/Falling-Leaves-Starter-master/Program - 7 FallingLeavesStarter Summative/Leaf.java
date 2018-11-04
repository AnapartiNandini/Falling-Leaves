import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");

    public Leaf(int imageNumber)
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */
         
        
        if( imageNumber == 0 )
        {
            setImage(leaf0);
            turn(30);
        }
        else if( imageNumber == 1 )
        {
            setImage( leaf1 );
            move(1);
        }
        else if( imageNumber == 2 )
        {
            setImage( leaf2 );            
        }
        else 
        {
            setImage( leaf3 );
        }
        
        turn(90);
    }
    public void act() 
    {      
        checkParameters();
        move(3);
    }
    
    public void checkParameters()
    {
        if( getY() >= getWorld().getHeight() - 1 )
        {
            getWorld().removeObject(this);
        }
    }   
}
