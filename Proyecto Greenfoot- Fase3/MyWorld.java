import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Crea el mundo con colores y pone los pisos del nivel y el jugador
        super(2500, 700, 1, false); 
        addObject(new wide(), 0, 700);
        addObject(new Player(), 50, 500);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Genera los pisos que estan suspendidos en el aire

        wide wide = new wide();
        addObject(wide,690,353);
        wide.setLocation(662,363);
        wide.setLocation(703,356);
        Enemy enemy = new Enemy();
        addObject(enemy,873,265);
        enemy.setLocation(845,294);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,692,277);
        enemy2.setLocation(661,277);
        tall tall = new tall(50, 50);
        addObject(tall,281,556);
        tall.setLocation(245,542);
        tall.setLocation(255,556);
        tall tall2 = new tall(50, 50);
        addObject(tall2,380,430);
        tall2.setLocation(384,439);
        tall tall3 = new tall(50, 50);
        addObject(tall3,258,301);
        tall3.setLocation(259,318);
        wide wide2 = new wide();
        addObject(wide2,1175,596);
        wide2.setLocation(1200,557);
        Enemy2 enemy22 = new Enemy2();
        addObject(enemy22,1351,379);
        Enemy2 enemy23 = new Enemy2();
        addObject(enemy23,1161,484);
        tall tall4 = new tall(20, 20);
        addObject(tall4,1550,419);
        tall tall5 = new tall(30, 30);
        addObject(tall5,1684,331);
        tall5.setLocation(1674,348);
        wide wide3 = new wide();
        addObject(wide3,1937,312);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,2063,192);
        enemy3.setLocation(2105,221);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,1950,177);
        enemy4.setLocation(1932,229);
        Enemy2 enemy24 = new Enemy2();
        addObject(enemy24,2012,116);
        Enemy2 enemy25 = new Enemy2();
        addObject(enemy25,1796,132);
        wide wide4 = new wide();
        addObject(wide4,2319,650);
        wide4.setLocation(2366,664);
        wide4.setLocation(2355,664);
        Meta meta = new Meta();
        addObject(meta,2427,529);
        meta.setLocation(2432,531);
        Enemy2 enemy26 = new Enemy2();
        addObject(enemy26,2284,555);
    }
}
