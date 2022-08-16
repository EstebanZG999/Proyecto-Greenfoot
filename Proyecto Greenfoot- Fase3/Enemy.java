import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -3;
    int count = 0;
    int health = 5;
    boolean hitProjectile = false;
    public Enemy(){
        getImage().mirrorHorizontally();
        getImage().scale(100, 100);
    }
    public void act()
    {
        // Ejecuta los metodos
        count++;
        moveAround();
        hitByProjectile();
    }
    public void moveAround(){// Hace que el enemigo se mueva
        if(count < 30)
        setLocation(getX() + speed, getY());
        else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
    }
    public void hitByProjectile(){// Si al enemigo se le lanza un proyectil este muere
        Actor Projectile = getOneIntersectingObject(projectile.class);
        if(Projectile != null && !hitProjectile){
            health--;
            hitProjectile = true;
            getWorld().removeObject(Projectile);
        }
        else if(!isTouching(projectile.class)){
            hitProjectile = false;
        }
        if(health <= 0)
        getWorld().removeObject(this);
    }
}
