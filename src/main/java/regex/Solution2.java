package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution2{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    public static class MyRegex {
        String zeroTo255 = "([0]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])";
       String ipPattern = "\\b"+ zeroTo255 + "\\." +  zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\b";
        String zeroTo255_ = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        public String pattern = "\\b([0]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
                "([0]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
                "([0]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
                "([0]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])\\b"
                ;
    }
}