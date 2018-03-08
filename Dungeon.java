package Classes;

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
    
    public void MoveToRightOne(Player p ) { 
   
    for(int  j = 0;j < map.length;j++){
        
        if(map[j] == null && j < map.length){
            j ++;
        }
       if(map[j]== map[10]){
            System.out.println("you have reached the end of the dungeon");
        }
        System.out.println("your are now in " + map[j]);
    }  
 
    }
   
  
    public void populate(Player p, Enemy e, Boss b ){
        map[0]= p;
        map[9]= b;
        map[4]= e;
       
        
    }
}

