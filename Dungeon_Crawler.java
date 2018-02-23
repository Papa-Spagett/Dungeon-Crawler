/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon_crawler;

//import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Big Thomas
 */
public class Dungeon_Crawler {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       //For inputs
        Scanner in = new Scanner(System.in);
        //For Random Number Generation
        Random rand = new Random();
        
        //Variables for Monsters
        String[] Mobs = {"Gallo Goblin", "Tortellini Troll", " Ravioli Rouge", "Wet Noodle Wizard", "Grand Overlord Master King Spaghett"}; 
        int maxMobHP = 50;
        int maxMobDmg = 20;
        
        //Variables for the Player
        int Hp = 100; //Player can in fact overheal
        int PlayerDmg = 40;
        int NumHpPotions = 3;
        int HpPotionHeal = 30;
        
        //So the game continues to run
        boolean playing = true; 
        
        
        System.out.println( "Enter Spaghett's Lair! " );
        
        
        //label to tell game to start from here
        GAME:
        while (playing) {
            System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            
            int MobHp = rand.nextInt(maxMobHP);
            String Mob = Mobs[rand.nextInt(Mobs.length)];
            System.out.println("\t| " + Mob + " has shown up! |\n");
            
            
            while(MobHp> 0){
            System.out.println("\t PlayerHP: " + Hp);
            System.out.println("\t" + Mob+ "'s HP: " + MobHp);
            System.out.println("\n\t What's your plan bub?");
            System.out.println("\t1. Attack ");
            System.out.println("\t2. Drink HP Potion");
            System.out.println("\t3. Flee");
            
            //Gets the Input from the User
            String input = in.nextLine();
            if(input.equals("1")) {
                int DmgDone = rand.nextInt(PlayerDmg);
                int DmgTaken = rand.nextInt(maxMobDmg);
                
                //Takes away health by dmg done
                MobHp -=  DmgDone;
                Hp -= DmgTaken;
                
                
                System.out.println("\t You hit the " + Mob + " for " + DmgDone );
                System.out.println("\t"+ Mob + " touched your spagget " + DmgTaken + " times" );
                
                if(Hp <1){
                    System.out.println("\t You Got Bopped. ");
                    
                    //Takes us out of the while loop
                    break;
                
                }
            }
            
            else if(input.equals("2")) {
                if(NumHpPotions>0){
                    Hp += HpPotionHeal;
                NumHpPotions--;
                System.out.println("\t You drank some Ragu, Hp replenishes to: " + Hp + ". "
                     +"\n\t You have " + NumHpPotions + " bottle(s) of Ragu left to enjoy. \n");
            }
            else {
                System.out.println("\t You have no more Ragu, Boi! Better tough it out :/");
            }
            }
      
            else if(input.equals("3")) {
                System.out.println("\t You flee from " + Mob);
                continue GAME;
            }
            
            else{
                System.out.println("\tCan you read? 1,2,or 3 genius");
                    }
            }
        
   
        if(Hp <1){
            System.out.println(" Game over. Looks like you get no spagget.");
            break;
            
        }
        System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" | " + Mob + " got bopped! Nice Job! |");
        System.out.println(" | You have " + Hp + " Hp remaining. |");
        
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

   
   
        
        
   
    

   

               
        
        
        
        
       
        
        
//        System.out.println("Move by typing left or right");
//        /*starting instruction
//        
//        */
//       System.out.println("Get to the end of the Dungeon. Which way do you want to move? ");
//        /*the first movement 
//       
//       */
//   }
//}
//       
       
   
//    private class Dungeons {
//
//        String[] Dugeon = new String[3];
//    /** Creates a new instance of Array */
//    public Dungeons() {
//        Dugeon[1]= "hero";
//    }
//}
//    public static void Hero(String[] args){
//        
//    }
//}