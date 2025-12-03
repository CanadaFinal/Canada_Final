
/**
 * Write a description of class num3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class num3
{
    public static void main(String []  args){
    Scanner in = new Scanner(System.in);
    
     System.out.println("\nTriangle Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}