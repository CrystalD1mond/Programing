import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovableObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovableObject extends Actor
{
    protected int speed;
    void moveLeft()
    {
        setLocation( getX() - speed, getY() );
    }
     void moveRight()
    {
        setLocation( getX() + speed, getY() );
    }

    void moveUp()
    {
        setLocation( getX(), getY() - speed );
    }

    void moveDown()
    {
        setLocation( getX(), getY() + speed );
    }

   
    public void act() 
    {
        
    }    
}
