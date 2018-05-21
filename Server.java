/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Big Thomas
 */
public class Server {
      public static void main(String[] args)throws IOException {
        Dungeon d = new Dungeon();
        Scanner in = new Scanner(System.in);
         Random rand = new Random();
        
        DatagramSocket sc = new DatagramSocket(58778);
         byte[] buf = new byte[1024];
         DatagramPacket pkt = new DatagramPacket( buf,1024);
         sc.receive(pkt);
         
         
         
         String[] Compliments = {"You're doing great...not really though", "Wow, I couldnt be less impressed", " LOL, you think that's progress?", "Huh? You're still alive?", "Can you hurry up and quit please? My son's got a soccer game at 6."};
         String Sarcastic = Compliments[rand.nextInt(Compliments.length)]; 
        
         System.out.println(Sarcastic);
         sc.close();
             
        
   }  
             
         
       
     
 }


           
    

             
           



