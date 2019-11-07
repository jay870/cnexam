
import java.io.*;
import java.lang.*;
public class gobackn {

 public static void main(String args[]) throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  double window;
  System.out.println("Please enter the sequence bits : ");
  int bits = Integer.parseInt(br.readLine());
  window =Math.pow(2,bits);
 

  boolean loop = true;
  int sent = 0;
  int win=(int)window;
   int  a[]= new int[win];
   
  int rec=0;
  while(loop)
  {
   System.out.println("Sending Window");
   for(int i = 0; i < win-1; i++)
   {
    
    System.out.println("Frame " + sent + " has been transmitted.");
    sent++;
    if(sent>win-1){
     sent=0; 
     }
     a[i]=sent;
   
     
   }
   
   for(int i = 0; i < win-1; i++)
   {
    System.out.println("Receiving Window");
    System.out.println("Frame " + rec + " has been received.");
    rec++;
    if(rec>win-1){
     rec=0;
     
     }
   }


   
   System.out.println("Please enter the last Acknowledgement received.");
   int ack = Integer.parseInt(br.readLine());
   
   if(ack == win)
    loop = false;
   else
   {
    sent = ack;
    rec=ack;
    }
     
  }
  
 }
 
}


OUTPUT

Please enter the sequence bits : 
3
Sending Window
Frame 0 has been transmitted.
Frame 1 has been transmitted.
Frame 2 has been transmitted.
Frame 3 has been transmitted.
Frame 4 has been transmitted.
Frame 5 has been transmitted.
Frame 6 has been transmitted.
Receiving Window
Frame 0 has been received.
Receiving Window
Frame 1 has been received.
Receiving Window
Frame 2 has been received.
Receiving Window
Frame 3 has been received.
Receiving Window
Frame 4 has been received.
Receiving Window
Frame 5 has been received.
Receiving Window
Frame 6 has been received.
Please enter the last Acknowledgement received.
2
Sending Window
Frame 2 has been transmitted.
Frame 3 has been transmitted.
Frame 4 has been transmitted.
Frame 5 has been transmitted.
Frame 6 has been transmitted.
Frame 7 has been transmitted.
Frame 0 has been transmitted.
Receiving Window
Frame 2 has been received.
Receiving Window
Frame 3 has been received.
Receiving Window
Frame 4 has been received.
Receiving Window
Frame 5 has been received.
Receiving Window
Frame 6 has been received.
Receiving Window
Frame 7 has been received.
Receiving Window
Frame 0 has been received.
Please enter the last Acknowledgement received.
5
Sending Window
Frame 5 has been transmitted.
Frame 6 has been transmitted.
Frame 7 has been transmitted.
Frame 0 has been transmitted.
Frame 1 has been transmitted.
Frame 2 has been transmitted.
Frame 3 has been transmitted.
Receiving Window
Frame 5 has been received.
Receiving Window
Frame 6 has been received.
Receiving Window
Frame 7 has been received.
Receiving Window
Frame 0 has been received.
Receiving Window
Frame 1 has been received.
Receiving Window
Frame 2 has been received.
Receiving Window
Frame 3 has been received.