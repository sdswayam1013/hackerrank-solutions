import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long count = 1;
        
        while(scn.hasNextLine()){
          
          String str = scn.nextLine();
          System.out.println( count++ + " " + str);
        }
    }
}
