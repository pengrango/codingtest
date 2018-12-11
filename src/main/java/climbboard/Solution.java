package climbboard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
//        Integer[] uniqueScore = getUniqueScore(scores);
        int[] uniqueScore = Arrays.stream(scores).distinct().toArray();
        int scoreIndex = uniqueScore.length -1;
        int aliceIndex = 0;
        int [] ranks = new int[alice.length];
        if (scores.length == 0) {
            while(aliceIndex < alice.length){
                ranks[aliceIndex] = 1;
                aliceIndex++;
            }
        }
        do {
            if (scoreIndex < 0) {
                ranks[aliceIndex] = 1;
                aliceIndex++;
                continue;
            }
            int currentScore = uniqueScore[scoreIndex];
            int currentAliceScore =  alice[aliceIndex];



            if (currentAliceScore < currentScore ) {
                ranks[aliceIndex] = scoreIndex + 1 + 1;
                aliceIndex ++ ;
            } else if (currentAliceScore > currentScore) {
                scoreIndex --;
            } else { // equals
                ranks[aliceIndex] = scoreIndex + 1;
                aliceIndex ++ ;
            }


        } while(aliceIndex < alice.length);

        return ranks;
    }

static Integer [] getUniqueScore (int [] scores) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(scores[0]);

        for (int i =1 ; i< scores.length; i++) {
            if (scores[i] != list.get(list.size() -1)) {
                list.add(scores[i]);
            }
        }
    System.out.println(list);
        return  list.toArray(new Integer[list.size()]);
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}