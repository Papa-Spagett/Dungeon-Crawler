/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Big Thomas
 */
public class Client {
   
      

 public static void main(String[] args)throws IOException {
        Dungeon d = new Dungeon();
        Scanner in = new Scanner(System.in);
        DatagramSocket sc = new DatagramSocket();
      Scanner scan = new Scanner(System.in);
   InetAddress ip = InetAddress.getByName("131.118.66.187");
      
   

//So the game continues to run
        boolean playing = true; 
        
        
     System.out.println( "Enter Spaghett's Lair! " );
        d.populate();
        
        //label to tell game to start from here
        GAME:
        while (playing) {
            System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            
    
     System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" Forward: Keep battling the forces of evil.");
        System.out.println(" Leave: Be a wuss and go home. ");
       
        String Progress = scan.nextLine();
       
        while(!Progress.equals("Forward") && !Progress.equals("Leave")) {
            System.out.println("Can you read? Forward or Leave genius");
            Progress = in.nextLine();
        }
     
      if(Progress.equals("Forward")) {
        System.out.println(" The games continue!");
      
        
        if (d.MoveToRightOne()==false){
            break;
      }
      }
         else if(Progress.equals("Leave")) {
        System.out.println(" Go home, you aren't strong enough for this adventure...puss...trami ");
         
      break;
         }
      DatagramPacket pkt = new DatagramPacket(Progress.getBytes(),Progress.length(),ip,58778); 
      sc.send(pkt);
      
        } 
        System.out.println(" Ravioli Ravioli, Thanks for playing. "
                + "(Bet you thought that would've Rhymed) ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
      sc.close();
     
      
 }
}




    

                
    

