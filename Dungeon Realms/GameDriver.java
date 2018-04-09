import java.util.Scanner;
public class GameDriver
{
    private static Scanner input = new Scanner(System.in);
    public static void main(String args[]) throws InterruptedException
    {
        Game startUp = new Game();
        int startCommand = 0;
        //System.out.print("\f");
        System.out.println("\t\tWelcome to Dungeon:Realms");
        System.out.println(" 1.) Start\n\n 2.) Help\n\n 3.) Exit\n");
        while(startCommand != 1 || startCommand != 2 || startCommand != 3)
        {
            startCommand = input.nextInt();
            if(startCommand == 1)
            {
                startUp.startScreen();
                break;
            }
            if(startCommand == 2)
            {
                System.out.println("Me: THERE ARE NO RULES!");
                System.out.println("Voice In The Back: Thats a rule though...");
                System.out.println("Me: THERES ONE RULE!");
            }
            if(startCommand == 3)
            {
                System.exit(0);
            }
        }
    }
}