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
   Object map[]= new Object[11];
int playerpos = 0;
    /**
     *
     */
    public Object Player;
    public Object Boss;
    public Object Enemy;
    Player p = new Player();
        Boss b = new Boss();
        Enemy e = new Enemy();
   
    // this is the creation of the Dungeon 
      public void populate(){
           
          
        map[0]= p;
        map[5]= e;
        map[9]=b;
      
 
      
      } 
   public boolean MoveToRightOne() { 
            //here we want p's postion to move up the array one
            //essentially p++ everytime this method is called
           if(playerpos>=map.length){
               System.out.println("You are at the end of the dungeon");
               return false;
           
           }else{
               playerpos=playerpos+1;
           map[playerpos]=p;
           System.out.println("You are now in room: "+ playerpos);
           return true;
           
}
           
   }
        
    
             
                     


   
   
}
   



        
           
         
    
    
    

      
      

    
//    if(p + 1 ==4){
//        
//   Player.playerattack
 
    
    

   
  
   
        
    

    
    
 
    
   
  
   
        
    




