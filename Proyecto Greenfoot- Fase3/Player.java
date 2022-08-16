import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vspeed = 0;
    int accel = 0;
    int speed = 5;  
    int health = 1;
    boolean touchEnemy = false;
    boolean touchEnemy2 = false;
    projectile projectilee = new projectile();
    public void act()
    {
        jump();
        checkfalling();
        fall();
        moveAround();
        fire();
        touchbyEnemy();
        touchbyEnemy2();
        youWin();
        // Genera todos los metodos
    
    }
    public void fire(){
        // Genera un nuevo proyectil cada vez que se clickea el mouse
        if(Greenfoot.mousePressed(null)){
            projectile projectilee = new projectile();
            getWorld().addObject(projectilee, getX(), getY());
            projectilee.turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
    public void moveAround(){
        // Hace que el personaje se mueva
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - speed, getY());
        }
    }
    public void fall()
    //Para que el personaje tenga caida
    {
        setLocation(getX(), getY() + vspeed);
    }
    
    public void checkfalling()
    // Para ver si ejecuta fall
    {
        if(!isTouching(ground.class))
        {
            vspeed ++;
        }
        else if(isTouching(ground.class)){
            setLocation(getX(), getY() - 1);
            vspeed = 0;
        }
    }
    public void jump(){
        // Genera el salto
        if (Greenfoot.isKeyDown("up")){
            vspeed = -10;
        }
    }
    public void touchbyEnemy(){// Si el jugador toca el enemigo este muere y acaba el juego
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null && !touchEnemy){
            health--;
            touchEnemy = true;
        }
        else if(!isTouching(Enemy.class)){
            touchEnemy = false;
        }
        if(health <= 0){
        World myWorld = getWorld();
        GameOver gameover = new GameOver();
        myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
        Greenfoot.stop();
    }
    }
    public void touchbyEnemy2(){// Si el jugador toca el enemigo este muere y acaba el juego
        Actor enemy2 = getOneIntersectingObject(Enemy2.class);
        if(enemy2 != null && !touchEnemy2){
            health--;
            touchEnemy2 = true;
        }
        else if(!isTouching(Enemy2.class)){
            touchEnemy2 = false;
        }
        if(health <= 0){
        World myWorld = getWorld();
        GameOver gameover = new GameOver();
        myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
        Greenfoot.stop();
    }
    }
    public void youWin(){// Si el jugador llega a la meta saldra el mensaje de YOU WIN
        if(getX() == 2430){
            World myWorld = getWorld();
            YouWin youwin = new YouWin();
            myWorld.addObject(youwin, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.stop();
        }
    }
}
