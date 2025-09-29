import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0,k); //String smallest = s.substring(0, k);
                                      //String largest  = s.substring(0, k);
        largest = s.substring(0,k);
        
        for (int i=0;i<=s.length()-k;i++){ //-k because if not then limit outbound exception
          String s2 = s.substring(i, Math.min(i+k , s.length()));
         
          if( s2.compareTo(smallest)<0)  {  smallest = s2;}
          if( s2.compareTo(largest)>0)   {  largest  = s2;}
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}