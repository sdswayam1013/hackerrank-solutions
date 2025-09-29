import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        System.out.println(A.length()+ B.length());
        
        char c1 = A.charAt(0);
        char c2 = B.charAt(0);
        
        if(c1>c2){
        System.out.println("Yes");}
        else{
        System.out.println("No");}
        
        if (A !=null && !A.isEmpty())
        { A = A.substring(0,1).toUpperCase() + A.substring(1);}
         if (B !=null && !B.isEmpty())
        { B = B.substring(0,1).toUpperCase() + B.substring(1);}
        System.out.println( A + " " + B);
    }
}



