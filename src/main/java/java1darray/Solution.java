package java1darray;

import java.util.*;

public class Solution {

    static HashSet<Integer> set = new HashSet();
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        set.clear();
        return isSovable(leap, game, 0);
//        return tryFromIndex(leap, game, 0);
    }

    private static boolean isSovable(int leap, int[] game, int beginIndex) {
        if (set.contains(beginIndex)) {
            return false;
        }
        set.add(beginIndex);

        if (beginIndex > game.length -1) {
            return true;
        }

        if (beginIndex < 0 || game[beginIndex] == 1) {
            return false;
        }

        return isSovable(leap, game, beginIndex + 1) || isSovable(leap, game, beginIndex + leap) || isSovable(leap, game, beginIndex -1);
    }

    public static boolean tryFromIndex(int leap, int[] game, int beginIndex) {
        if (beginIndex + 1 >= game.length  || beginIndex + leap >= game.length) {
            return true;
        }
        set.add(beginIndex);
        if (!set.contains(beginIndex + 1) && game[beginIndex + 1] ==0) {
            if (tryFromIndex(leap, game, beginIndex +1)) {
                return true;
            }
        }
        if (!set.contains(beginIndex + leap) && game[beginIndex + leap] == 0) {
            if(tryFromIndex(leap, game, beginIndex + leap)) {
                return true;
            }
        }

        if (!set.contains(beginIndex - 1) && beginIndex > 0 && game[beginIndex - 1] ==0  ) {
            if(tryFromIndex(leap, game, beginIndex -1)) {
                return true;
            }
        }

        return false;
    }

    public static String LongestWord(String sen) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        String[] senArr = sen.split("[^A-Za-z0-9]");
        String longest= "";
        int length = longest.length();
        for (String word : senArr) {
            if (word.length() > length) {
                longest = word;
                length = word.length();
            }
        }
        return longest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
//            System.out.println(Arrays.toString(game));
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}