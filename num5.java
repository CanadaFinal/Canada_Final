import java.util.*;
public class num5
{
    public static void main(String []  args){
    Scanner in = new Scanner(System.in);
    
    int[] arr = {3, 8, 12, 5, 7};
        int target = 12;

        System.out.println("\nSearching for " + target);
        for (int num : arr) {
            if (num == target) {
                System.out.println("Found " + target);
                break;
            }
        }
    }
}