package Classes;
import java.util.Scanner;



/**
 *
 * @author Big Thomas
 */
public class CrawlerV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dungeon d = new Dungeon();
        Scanner in = new Scanner(System.in);
        
//So the game continues to run
        boolean playing = true; 
        
        
     System.out.println( "Enter Spaghett's Lair! " );
        d.populate();
        
        //label to tell game to start from here
        GAME:
        while (playing) {
            System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            
    
     System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" 1. Keep battling the forces of evil.");
        System.out.println(" 2. Be a wuss and go home. ");
        
        String input = in.nextLine();
        
        while(!input.equals("1") && !input.equals("2")) {
            System.out.println("Can you read? 1 or 2 genius");
            input = in.nextLine();
                
        }
        if(input.equals("1")) {
            System.out.println(" The games continue!");
          
           d.MoveToRightOne();
           
         
          
          /*if(p instanceof e){
          d.MoveToRightOne();
          }
          if(p instanceof b){
          d.MoveToRightOne();
          }*/
           
            
        }
        else if(input.equals("2")) {
            System.out.println(" Go home, you aren't strong enough for this adventure...puss...trami ");
           break;
        }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" Ravioli Ravioli, Thanks for playing. "
                + "(Bet you thought that would've Rhymed) ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
   }
    }
    
                
    
