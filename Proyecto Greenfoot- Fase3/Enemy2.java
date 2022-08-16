import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -3;
    int count = 0;
    int health = 7;
    boolean hitProjectile = false;
    public Enemy2(){// reescala el enemigo
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
        if(count < 70)
        setLocation(getX() + speed, getY());
        else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
    }
    public void hitByProjectile(){
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
