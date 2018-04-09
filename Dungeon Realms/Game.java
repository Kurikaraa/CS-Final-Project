import java.util.*;
import java.io.*;
public class Game
{
    private Scanner input;
    int x;
    CharacterSelect myChar = new CharacterSelect();
    
    private int storyInput;
    Story myStory = new Story();
    /**
     * Constructor for objects of class DungeonRealms
     */
    public Game()
    {
        // initialise instance variables
        input = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void startScreen() throws InterruptedException
    {
        System.out.println("\fWould you like to listen to the story?");
        System.out.println("Type input: 1.)Yes \t2.)No\n");
        storyInput = input.nextInt();
        if(storyInput == 1)
        {
            myStory.story();
        }
        
        if(storyInput == 2)
        {
            System.out.print("\f");
            System.out.println("You skipped the Story.");
            Thread.sleep(3000);
            System.out.print("\f");
        }
        createCharacter();
    }
    
    public void createCharacter()
    {
        System.out.println("\t\tSelect a Character");
        
        System.out.println(" 1.) Warrior \n\n 2.) Mage \n\n 3.) Rogue");
        
    }
}
