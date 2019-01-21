package timeconversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        Pattern pattern = Pattern.compile("(.*)\\:(.*)\\:(.*)(AM|PM)");
        Matcher matcher = pattern.matcher(s);
        int hour, minute, second;
        String halfDay;
        if (matcher.find()) {
            hour = Integer.parseInt(matcher.group(1));
            minute = Integer.parseInt(matcher.group(2));
            second = Integer.parseInt(matcher.group(3));
            halfDay = matcher.group(4);
        } else {
            return "";
        }

         if (halfDay.equalsIgnoreCase("PM")) {
            hour= (hour == 12) ? 12: hour+ 12;
        } else if(halfDay.equalsIgnoreCase("AM")) {
             hour= (hour == 12) ? 0: hour;
        }

        return String.format("%02d:%02d:%02d", hour, minute,second);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output"));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
        bw.write(result);
        bw.newLine();

        bw.close();
    }
}