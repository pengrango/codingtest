package regex;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);
        List<String> list = new ArrayList();
//        matcher.groupCount()
        while(matcher.find()) {
            list.add(matcher.group());

        }
        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
        scan.close();
    }
}