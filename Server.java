import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
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
public class Server {
      public static void main(String args[]) throws IOException{
        
        
          DatagramSocket sc = new DatagramSocket(58778);
         byte[] buf = new byte[1024];
         DatagramPacket pkt = new DatagramPacket( buf,1024);
         sc.receive(pkt);
         String greeting = new String(pkt.getData(), 0, pkt.getLength());
         System.out.println(greeting);
         sc.close();
    
}
}
