package Classes;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Big Thomas
 */

public class Dungeon {
   Object map[]= new Object[10];
    private Object Player;
    
    // this is the creation of the Dungeon 
      public void populate(Player p, Enemy e, Boss b ){
    Player player = (Player) map[0];
    Enemy enemy = (Enemy) map[4];
    Boss boss = (Boss) map[9];
    
 
      
      }
   public void MoveToRightOne() { 
       Player player = (Player) map[0];
    Enemy enemy = (Enemy) map[4];
    Boss boss = (Boss) map[9];
   player = (Classes.Player) map[0];
    for(int  p = 0; p < map.length;p++){
        
        if(map[p] == null && p < map.length){
            p ++;
        }
        if(Player instanceof Enemy){
       player = (Classes.Player) map[5];
      
    }else if(Player instanceof Boss){
       player = (Classes.Player) map[10];
        }
    else if(map[p]== map[10]){
            System.out.println("you have reached the end of the dungeon");
            break;
        }
          System.out.println("You are now in room:  " + map[p]);
    

      
    }  
    
//    if(p + 1 ==4){
//        
//   Player.playerattack
 }
    
    }
   
  
   
        
    

    
    
 
    
   
  
   
        
    




