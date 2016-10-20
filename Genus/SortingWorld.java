import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortingWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Button startButton;
  

    
    
    public SortingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        
        // This goes in welcome screen
        this.setBackground(new GreenfootImage("1_background.png"));
        this.addObject(new first_title(), 500,60);
        this.addObject(new first_scale(), 500,250);
        this.addObject(new first_team(), 135,540);
        this.addObject(new first_cmpe(), 925,550);
        this.addObject(new first_playnow(), 500,450);


        
    }
    

}