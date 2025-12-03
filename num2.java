
/**
 * Write a description of class num2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class num2
{
    public static void main(String []  args){
    Scanner in = new Scanner(System.in);
    
     int[] arr = new int[10];
        int count = 0;

        System.out.println("\nEnter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 7) count++;
        }
        System.out.println("7 appears " + count + " times.");
    }
}