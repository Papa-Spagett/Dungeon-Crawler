package Classes;
import java.util.Scanner;
import Classes.Dungeon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Big Thomas
 */
public class CrawlerV2 {

    /**
     * @param args the command line arguments
     */
    public  void main(String[] args) {
        // TODO code application logic here
//For inputs
        Scanner in = new Scanner(System.in);
  

//So the game continues to run
        boolean playing = true; 
        
        
     System.out.println( "Enter Spaghett's Lair! " );
        
        
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
            Dungeon.MoveToRightOne();
            
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
    
                
    
