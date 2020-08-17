/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatting.application;

/**
 *
 * @author ashut
 */
public class CallingClass {
    
    public static void main(String[] args) {
        
   /*     Server s= new Server();
        s.setVisible(true);
       Client c=new Client();
           c.setVisible(true);  */
        
          // Server.main(args);
       //    Client.main(args);
           
     Thread t1=new Thread(){
         @Override
         public void run(){
              Server.main(args);
         }
     };
     t1.start();
       
      Thread t2=new Thread(){
          @Override
          public void run(){
              Client.main(args);
         }
     };
     t2.start();
       
          
      
     
     
     
     
     
       
    }
    
}
