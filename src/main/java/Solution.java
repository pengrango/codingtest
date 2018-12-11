import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        in.close();
    }

    public static void printSeries(int a, int b, int n) {
        for (int i=0; i<= n-1; i++) {
            getElementByIndex(a, b, i);
        }
    }

    private static void getElementByIndex(int a, int b, int n) {

        int element = 0;
        element = a + b;
        System.out.println(element + " ");
        for (int j=1; j<= n-1; j++) {
            element += b * Math.pow(2, j);
            System.out.println(element + " ");
        }


    }

}
    