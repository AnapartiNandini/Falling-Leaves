 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    public Catcher()
    {
       
         
    }
    public void act() 
    {
        //if the right arrow key is pressed...
        if(Greenfoot.isKeyDown("right") == true)
        {
            //move right
            moveRight();
        }
        
        //if the left arrow key is pressed...
        if(Greenfoot.isKeyDown("Left") == true)
        {
            //move left
           moveLeft();
        }
        
        checkForLeaf();
    }
    
    /**
     * moveRight is the method that changes the location 
     * of the Car to move right
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void moveRight()
    {  
        //Allows the car object to go up by 2 pixles on the x-axis as a result it is moving right 
        setLocation (getX()+2, getY());
    }
    
    /**
     * moveLeft is the method that changes the location 
     * of the Car to move left
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void moveLeft()
    {
        //Allows the car object to go down by 2 pixles on the x-axis as a result it is moving Left 
        setLocation (getX()-2, getY());
    }
    
    private void checkForLeaf()
    {
        if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            //call the method update from the AutumnWorld class
            ( (AutumnWorld)getWorld() ).update();
        }    
    }
}
