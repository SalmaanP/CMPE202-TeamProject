import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class second_goahead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class second_goahead extends assets
{
    private SortingWorld world;
    private IScreenHandler InformationScreen = new InformationScreen(world);
    
    public second_goahead(SortingWorld world){
        this.world = world;
    }
    
    /**
     * Act - do whatever the second_goahead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
            if(mouseX > 400 && mouseX < 600 && mouseY > 370 && mouseY < 430){
                this.setImage("2_selected.png");
                if(Greenfoot.mouseClicked(this)){
                   
                    IScreenHandler screen = world.getScreen();
                    screen.setNextScreen(InformationScreen);
                }
            } else {
                this.setImage("2_goahead.png");
            }
        }
    }    
}
