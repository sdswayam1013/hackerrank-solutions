import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         if( a.length() != b.length())
         return false;
         
         a = a.toLowerCase();
         b = b.toLowerCase();
         
         char[] array1 = a.toCharArray();
         char[] array2 = b.toCharArray();
         
         java.util.Arrays.sort( array1);
         java.util.Arrays.sort( array2);
         
         return java.util.Arrays.equals(array1 , array2);
    }
    
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}