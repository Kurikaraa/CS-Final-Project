import java.io.*;
/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story
{
    public void story() throws InterruptedException
    {
        // Add Pause Buffers in between
        System.out.println("\fThere  once  was  a  time  where  Archangels  protected  the  land."); 
        promptEnterKey();
        System.out.println("\fThe Archangels  were  the  land's  sole  protectors  who\nmaintained  the  powers  of  the  tribes.");
        promptEnterKey();
        System.out.println("\fThe  land  was  in  a  state  of  peace  for  thousands\nof  years,  until  one  grim  day.");
        promptEnterKey();
        System.out.println("\fArthur,  The  King  Of  All  Archangels,  sought  out  for\nthe  Transcendent  Heart.");
        promptEnterKey();
        System.out.println("\fThe  Transcendent  Heart  was  the  core  of  the  planet\nand  its  one  and  only  power  source.");
        promptEnterKey();
        System.out.println("\fWith  the  Transcendent  Heart,  anyone  would  become  a  God\nhigher  than  any  Archangel  could go.");
        promptEnterKey();
        System.out.println("\fHowever,  with  the  Transcendent  Heart  gone,  the  world\nwould  fall  into  utter  darkness  and  crumble  where  it  stands.");
        promptEnterKey();
        System.out.println("\fArthur  and  his  Holy  Council  looked  to  destroying  the  planet\nwith  its  power  and  create  a  utopia  of  only  perfect  Archangels.");
        promptEnterKey();
        System.out.println("\fThus  brought  out  an  everlasting  war  between  all  of\nthe  tribes  for  dominance  of  The  Transendent  Heart.");
        promptEnterKey();
        System.out.println("\fNothing  would  stand  in  their  way  of  obtaining  absolute  power.");
        promptEnterKey();
        System.out.println("\fUntil  you  came  along . . .");
    }

    public void promptEnterKey()
    {
        System.out.println("Press \"ENTER\" to continue...");
        try 
        {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
