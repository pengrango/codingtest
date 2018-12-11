//package anagrams;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    // Complete the makeAnagram function below.
//    static int makeAnagram(String a, String b) {
//        char[] charsA = a.toCharArray();
//        char[] charsB = b.toCharArray();
//        Map<Character, Integer> map = new HashMap();
//        for (char c : charsA) {
//            int num = 0;
//
//                num += map.getOrDefault(c, 0);
//
//            map.put(c, num);
//        }
//
//        int charsToDeleteB = 0;
//        for (char c : charsB) {
//            map.getOrDefault(c, 0);
//            if (map.getOrDefault()containsKey(c)) {
//                if
//            } else {
//                charsToDeleteB ++;
//            }
//        }
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String a = scanner.nextLine();
//
//        String b = scanner.nextLine();
//
//        int res = makeAnagram(a, b);
//
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
