import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.trim(); 
        if(s.isEmpty()){ System.out.println(0);
        return; }
        
        String[] s2 = s.split("[!?,._'@\\s]+");
        System.out.println(s2.length);//if string.length(), hereits array so array.lenght//
        
        for(String s3:s2){System.out.println(s3);}
        scan.close();
    }
}

