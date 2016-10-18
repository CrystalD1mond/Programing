import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends MovableObject
{
   public Bullet()
    {
        speed = 4;
    }

    public void act() 
    {
        moveUp();
        if ( checkIsOffScreen() || checkCollisionWithInvader() )
        {
            return;
        }
    }    

    public boolean checkIsOffScreen()
    {
        if ( isAtEdge() )
        {
            getWorld().removeObject( this );
            return true;
        }
        return false;
    }

    public boolean checkCollisionWithInvader()
    {
        Invader collideInvader = 
        (Invader)getOneIntersectingObject(Invader.class);  
        if ( collideInvader != null )
        {
            getWorld().removeObject( collideInvader );
            getWorld().removeObject( this );
            return true;
        }
        return false;
    }
}

