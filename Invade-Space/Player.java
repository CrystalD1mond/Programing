import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends MovableObject
{
    public Player()
    {
        speed = 4;

    }
    public int bulletCooldown; 

    public void act() 
    {
        int x = getX();
        int y = getY();

        if ( Greenfoot.isKeyDown( "left" ) )
        {
            x -= speed;
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            x += speed;
        }
        if ( Greenfoot.isKeyDown( "space" ) && bulletCooldown == 0 )
        {
            SpaceWorld world = (SpaceWorld)getWorld();
            world.addBullet( x, y );
            bulletCooldown = 50;
        }
         if ( bulletCooldown > 0 )
        {
            bulletCooldown--;
        }

        setLocation( x, y );

    }  
}
