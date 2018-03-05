/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawlerv2;
import java.util.Map;

/**
 *
 * @author Big Thomas
 */
public class Dungeon {
    Object Map[]= new Map[10];
    // this is the creation of the Dungeon 
    
    public static Object[] MoveToRightOne(Object Map[] ) { 
   
    for(int i = 0, j = 0;j < Map.length;i++,j++){
        Map[j] = Map[i];
        if(Map[i] == 0 && j+1 < Map.length){
            j ++;
           
        }
    }  
    return(Map); 
}
   
        
    } 
        


