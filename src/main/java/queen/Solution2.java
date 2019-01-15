package queen;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Solution2 {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        HashSet<String> obstaclesSet = getObstacles(obstacles);
        int directions[][] = {{1, 0}, {1, 1}, {0,1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
        int sum = 0;
        for (int i=0; i< directions.length; i++) {
            sum += findSqualsToAttach(n, r_q, c_q, directions[i], obstaclesSet);
        }
        return sum;

    }

    static int findSqualsToAttach(int n, int r_q, int c_q, int [] direction, HashSet<String> obstaclesSet) {
        int sum = 0;
        int r = r_q + direction[0];
        int c = c_q + direction[1];
        while(r >=1 && r <= n && c >= 1 && c <= n) {
            if (obstaclesSet.contains(r + "-" + c)) {
                break;
            }
            sum ++;
            r += direction[0];
            c += direction[1];

        }
        return sum;
    }

    private static HashSet<String> getObstacles(int[][]obstacles) {
        HashSet<String> obstaclesSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstaclesSet.add(obstacle[0] + "-" + obstacle[1]);
        }
        return obstaclesSet;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println(result);

        scanner.close();
    }
}
