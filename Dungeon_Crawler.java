/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon_crawler;

import java.util.ArrayList;
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
        Scanner input = new Scanner(System.in);
        //For Random Number Generation
        Random rand = new Random();
        
        //Variables for Monsters
        String[] Mobs = {"Wild Meatball Goblin", "Linguinie Troll", " Ravioli Rouge", "Wet Noodle Wizard", "Grand Overlord Master King Spaghett"}; 
        int maxMobHP = 100;
        int maxMobDmg = 20;
        
        //Variables for the Player
        int Hp = 250;
        int PlayerDmg = 40;
        int NumHpPotions = 3;
        int HPPotionHeal = 50;
        
        //So the game continues to run
        boolean playing = true; 
        
        
        System.out.println( "Enter Spaghett's Lair! " );
        
        
        //label to tell game to start from here
        GAME:
        while (playing) {
            System.out.println( "++++++++++++++++++++++++++++++++++++++");
            
            int MobHp = rand.nextInt(maxMobHP);
            String Mob = Mobs[rand.nextInt(Mobs.length)];
            System.out.println("\t# " + Mob + "has shown up! #\n");
            
            
            while(MobHp> 0){
            System.out.println("\t PlayerHP: ");
            System.out.println("\t" + Mob+ "'s HP: ");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
                    }
               
        
        
        
        
       
        
        
        System.out.println("Move by typing left or right");
        /*starting instruction
        
        */
       System.out.println("Get to the end of the Dungeon. Which way do you want to move? ");
        /*the first movement 
       
       */
   }
}
       
       
   
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