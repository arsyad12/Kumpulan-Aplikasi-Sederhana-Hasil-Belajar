
import java.io.IOException;
import java.util.Scanner;
public class TEST {
    public static void main(String[] args) throws IOException {
        String d = "";
        Scanner scn = new Scanner(System.in);
       
        d = scn.next();
        char[] arrCharStr = d.toCharArray();
        
        
        for (char e : arrCharStr) 
        {
            System.out.println(e+" = "+(int)e);}
      
            
            for (char e : arrCharStr) {
            System.out.println(e+" = 0"+Integer.toBinaryString(e));}
        
            
            
            for (char e : arrCharStr) 
            {
                String bin = "0"+Integer.toBinaryString(e);
                int ascii = Integer.parseInt(bin,2);
                char kar = (char) ascii;
                System.out.println(bin + " :: "+ ascii +" :: "+kar);}
 }
 }

