import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        int i=0;
        boolean pallindrom = true;
        
        while( i< A.length()/2)
        {
          if(A.charAt(i) != A.charAt(A.length()-1-i))
          { pallindrom = false;
             break;
          }
          i++;
        }
        if(pallindrom == true)
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }   
    
}




