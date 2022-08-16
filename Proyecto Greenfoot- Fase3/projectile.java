import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectile extends Actor
{
    /**
     * Act - do whatever the projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 10;
    public projectile(){
        getImage().scale(50, 50);
        // Ajusta la imagen del proyectil
    }
    public void act()
    {
        turnToMouse();
        move(speed);
        //Hace que el proyectil vaya hacia el mouse
    }
    public void turnToMouse(){
    }
}
