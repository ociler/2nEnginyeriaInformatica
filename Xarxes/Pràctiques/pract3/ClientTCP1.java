import java.net.*;
import java.util.*;
import java.io.*;
public class ClientTCP1
{
    public static void cosa1(){
        try{
            Socket s = new Socket("www.upv.es", 70);
            System.out.println("Connectat!");
            s.close();
        }
        
        catch(Exception e){System.out.println("NOPE");}
    }
    
    public static void cosa2(){
        try{
            Socket s = new Socket("zoltar.redes.upv.es", 13);
            Scanner sc = new Scanner(s.getInputStream());
            System.out.println(sc.nextLine());
            s.close();
        }
        
        catch(Exception e){System.out.println("NOPE");}
    }
    
    public static void cosa3(){
        
    }
    public static void main(String[] args){
        cosa2();
    }
}
